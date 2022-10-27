---
title: Fetch of myStore data with RapidAPI
layout: default
description: myStore data fetch and display
---

<!-- HTML table fragment for page -->
<html>
<body>
<!-- <table>
  <thead>
  <tr>
    <th>Category</th>
  </tr>
  </thead>
  <tbody>
    <td id="category"></td>
  </tbody>
</table>

<!-- <table>
  <thead>
  <tr>
    <th>Category</th>
  </tr>
  </thead>
  <tbody id="result">
 </tbody>
</table>  

<p id = "data"></p> -->
<h1>Del Norte Market Place API</h1>
<div id="data"></div>

<script>
  // prepare HTML result container for new output
  //const resultContainer = document.getElementById("result");
  // prepare fetch options
  const resultContainer = document.getElementById("result");
  const url = "http://womeninstem.tk/api/listings";
  const get_url = url +"/";

  const options = {
    method: 'GET', // *GET, POST, PUT, DELETE, etc.
    mode: 'cors', // no-cors, *cors, same-origin
    cache: 'default', // *default, no-cache, reload, force-cache, only-if-cached
    credentials: 'same-origin', // include, same-origin, omit
    headers: {
      'Content-Type': 'application/json'
      // 'Content-Type': 'application/x-www-form-urlencoded',
    },
  };

  final String[] arrayStrings = {"PE Lock, bob@urmom.com",
                                  "AP Calculus BC Prep Book, bob@urmom.com",
                                  "Pranavi's Apple Bundle *Not Clickbait*, bob@urmom.com",
                                  "Meena's TINspire, bob@urmom.com"}
  fetch(get_url, options)
    // response is a RESTful "promise" on any successful fetch
    .then(response => {
      // check for response errors
      if (response.status !== 200) {
          error('GET API response failure: ' + response.status);
          return;
      }
      // valid response will have JSON data
      response.json().then(data => {
      var rowNum = 0; 
      var table = document.createElement("table"), row, cellA, cellB;
      document.getElementById("data").appendChild(table);
      for (const row of data) {
        row = table.insertRow();
        cellA = row.insertCell();
        cellB = row.insertCell();
        cellA.innerHTML = rowNum;
        rowNum ++; 
        cellB.innerHTML = response[rowNum];
        }
});
  //         console.log(data);
  //         for (const row of data) {
  //           // make "tr element" for each "row of data"
  //           const tr = document.createElement("tr");
            
  //           // td for joke cell
  //           const joke = document.createElement("td");
  //             joke.innerHTML = row.id + ". " + row.joke;  // add fetched data to innerHTML

  //           // td for haha cell with onclick actions
  //           const haha = document.createElement("td");
  //             const haha_but = document.createElement('button');
  //             haha_but.id = HAHA+row.id   // establishes a HAHA JS id for cell
  //             haha_but.innerHTML = row.haha;  // add fetched "haha count" to innerHTML
  //             haha_but.onclick = function () {
  //               // onclick function call with "like parameters"
  //               reaction(HAHA, like_url+row.id, haha_but.id);  
  //             };
  //             haha.appendChild(haha_but);  // add "haha button" to haha cell

  //           // td for boohoo cell with onclick actions
  //           const boohoo = document.createElement("td");
  //             const boohoo_but = document.createElement('button');
  //             boohoo_but.id = BOOHOO+row.id  // establishes a BOOHOO JS id for cell  
  //             boohoo_but.innerHTML = row.boohoo;  // add fetched "boohoo count" to innerHTML
  //             boohoo_but.onclick = function () {
  //               // onclick function call with "jeer parameters"
  //               reaction(BOOHOO, jeer_url+row.id, boohoo_but.id);  
  //             };
  //             boohoo.appendChild(boohoo_but);  // add "boohoo button" to boohoo cell
             
  //           // this builds ALL td's (cells) into tr (row) element
  //           tr.appendChild(joke);
  //           tr.appendChild(haha);
  //           tr.appendChild(boohoo);

  //           // this adds all the tr (row) work above to the HTML "result" container
  //           resultContainer.appendChild(tr);
  //         }
  //     })
  // // catch fetch errors (ie Nginx ACCESS to server blocked)
  // .catch(err => {
  //   error(err + " " + get_url);
  // });




//   window.addEventListener("load", () => {
//   var table = document.createElement("table"), row, cellA, cellB;
//   document.getElementById("data").appendChild(table);
//   for (let key in data.categories) {
//     row = table.insertRow();
//     cellA = row.insertCell();
//     cellB = row.insertCell();
//     cellA.innerHTML = key;
//     cellB.innerHTML = data.categories[key].category;
//   }
// });
         

          
  //         for (let i in data.categories) {
  //           document.getElementById("data").innerHTML = "Category " + ", " + data.categories[i].category;
  //           // // tr for each row
  //           const tr = document.createElement("tr");
  //           // // td for each column
  //          const category = document.createElement("td");
            
  //           // // data is specific to the API
  //           category.innerHTML = data.categories[i].category;
            
  //           // tr.appendChild(category);

  //           // // add HTML to container
  //           resultContainer.appendChild(tr);
  //         }


  // const options = {
  //   method: 'GET', // *GET, POST, PUT, DELETE, etc.
  //   mode: 'cors', // no-cors, *cors, same-origin
  //   cache: 'default', // *default, no-cache, reload, force-cache, only-if-cached
  //   credentials: 'omit', // include, *same-origin, omit
  //   headers: {
  //     'Content-Type': 'application/json'
  //     // 'Content-Type': 'application/x-www-form-urlencoded',
  //   }
  // };

  // fetch the API
  // fetch(url, options)
  //   // response is a RESTful "promise" on any successful fetch
  //   .then(response => {
  //     // check for response errors
  //     if (response.status !== 200) {
  //         const errorMsg = 'Database response error: ' + response.status;
  //         console.log(errorMsg);
  //         const tr = document.createElement("tr");
  //         const td = document.createElement("td");
  //         td.innerHTML = errorMsg;
  //         tr.appendChild(td);
  //         resultContainer.appendChild(tr);
  //         return;
  //     }
  //     // valid response will have json data
  //     response.json().then(data => {
  //         console.log(data);
  //         console.log(data.category)

  //         // World Data
  //         document.getElementById("category").innerHTML = data.category;


  //         // Country data
  //         for (const row of data.category) {
  //           console.log(category);

  //           // tr for each row
  //           const tr = document.createElement("tr");
  //           // td for each column
  //           const category = document.createElement("td");
            
  //           // data is specific to the API
  //           category.innerHTML = row.category;
            
  //           tr.appendChild(category);

  //           // add HTML to container
  //           resultContainer.appendChild(tr);
  //         }
  //     })
  // })
  // // catch fetch errors (ie ACCESS to server blocked)
  // .catch(err => {
  //   console.error(err);
  //   const tr = document.createElement("tr");
  //   const td = document.createElement("td");
  //   td.innerHTML = err;
  //   tr.appendChild(td);
  //   resultContainer.appendChild(tr);
  // });
</script>
</body>
</html>