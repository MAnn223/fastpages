---
title: Javascript Hacks 
layout: base
description: Javascript/HTML and UI Screens with data
permalink: /frontend/opt1
categories: [markdown]
---


{% include nav_frontend.html %}


<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial;
}

* {
  box-sizing: border-box;
}

form.searchBar input[type=text] {
  padding: 10px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  height: 74px;

    font-family: 'Poppins';
    font-style: italic;
    font-weight: 400;
    font-size: 20px;
    line-height: 68px;

    background: #FFF9F9;
    border-radius: 100px;
    color: #9C9C9C;
}

form.searchBar button {
  float: left;
  width: 20%;
  padding: 10px;
  width: 64px;
  height: 74px;
  border: 1px solid grey;
  background: url(image.png);
  background: #FFF9F9;
  border-radius: 100px;
  cursor: pointer;
}

form.searchBar button:hover {
  background: #0b7dda;
}

form.searchBar::after {
  content: "";
  clear: both;
  display: table;
}

h2 {
    background-color: black;
    color: white;
    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 20px;
    line-height: 68px;
}

body {
  background-color: black;
}
</style>
</head>
<body>

<h2>DN Market Place Search</h2>

<form class="searchBar" action="https://www.google.com/search" target="_blank">
  <input type="text" placeholder="Used TI Inspire Calculator..." name="q">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>


</body>
</html> 
