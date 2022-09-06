---
title: Math Calculator
layout: default
description: Math Calculator 
permalink: /frontend/opt2
categories: [markdown]
---


{% include nav_frontend.html %}


<div class="container bg-primary">
    <header class="pb-3 mb-4 border-bottom border-primary text-dark">
        <span class="fs-4">Math Calculator</span>
    </header>
</div>

<script>
    const num1 = parseFloat(prompt('Enter the first number: '));
    const operation = prompt('Enter the operation you would like to perform (+,-,*,/)');
    const num2 = parseFloat(prompt('Enter the second number: '));

    var result;

    if (operation == '+') {
    result = num1 + num2;
    }
    else if (operation == '-') {
        result = num1 - num2;
    }
    else if (operation == '*') {
        result = num1 * num2;
    }
    else if (operation == '/') {
        result = num1 / num2;
    }
    else {
        console.log('error: input invalid');
    }

    console.log(${num1} ${operation} ${num2});
</script>