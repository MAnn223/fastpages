---
title: Post Listings
layout: default
description: Post Listings
---


<html>
<body>
  <form onsubmit="javascript:handleClick();return false">
  <label for="object">Object:</label>
  <input type="text" id="object" name="object"><br><br>
  <label for="price">Price:</label>
  <input type="text" id="price" name="price"><br><br>
  <label for="seller">Seller:</label>
  <input type="text" id="seller" name="seller"><br><br>
  <label for="imageURL">Image URL:</label>
  <input type="text" id="imageURL" name="imageURL"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
<script>
	function handleClick() {
	
		if (window.confirm('Click ok to view your listing')) 
		{
		window.location.href='https://mann223.github.io/fastpages/2022/10/01/dnMarketPlace.html';
		};;
	
	console.log("test");
		var requestOptions = {
		method: 'POST',
		redirect: 'follow'
		};
		
		const item = document.getElementById("object").value;
		const price = document.getElementById("price").value;
		const seller = document.getElementById("seller").value;
		const imageURL = '&url=' + encodeURIComponent(document.getElementById("imageURL").value);
		

		fetch(`https://womeninstem.tk/api/listings/create/${item}/${price}/${seller}/${imageURL}`, requestOptions)
	}
</script>
</html>