---
title: Fetch of DN Market Place Listings
layout: default
description: DN Market Place Listings data fetch and display
---


<html>
<body>
<h1>DN Market Place</h1>
<ul id="listings">
</ul>

<script>
  const ul = document.getElementById('listings');
  const list = document.createDocumentFragment();
  const url = 'https://womeninstem.tk/api/listings/';

  fetch(url)
    .then((response) => {
      return response.json();
    })
    .then((json) => {
      json.map(function(listing) {
        let li = document.createElement('li');
        let name = document.createElement('h2');
        

        name.innerHTML = `${listing.name}`;
        

        li.appendChild(joke);
        list.appendChild(li);
		ul.appendChild(list);
      });
    })
    .catch(function(error) {
      console.log(error);
    });

 
</script>
</body>
</html>