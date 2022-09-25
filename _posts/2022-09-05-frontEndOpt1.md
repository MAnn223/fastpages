---
title: Javascript Hacks 
layout: default
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

form.example input[type=text] {
  padding: 10px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  height: 74px;

    font-family: 'Poppins';
    font-style: italic;
    font-weight: 700;
    font-size: 20px;
    line-height: 68px;

    background: #FFF9F9;
    border-radius: 100px;
    color: #9C9C9C;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  width: 64px;
  height: 74px;
  background: url(image.png);
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
</style>
</head>
<body>

<h2>DNHS Black Market Search</h2>

<form class="example" action="https://www.google.com/search?q=">
  <input type="text" placeholder="Used TI Inspire Calculator..." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>


</body>
</html> 
