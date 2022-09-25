---
title: Javascript Hacks 
layout: default
description: Javascript/HTML and UI Screens with data
permalink: /frontend/opt1
categories: [markdown]
---


{% include nav_frontend.html %}


<div class="container bg-primary">
    <header class="pb-3 mb-4 border-bottom border-primary text-dark">
        <span class="fs-4">Javascript Hacks</span>
    </header>
    <form>
        <!-- Totals -->
        <div class="form-group row">
            Total : <span id="total" class="label label-primary">0.0</span>
            Count : <span id="count" class="label label-primary">0.0</span>
            Average : <span id="average" class="label label-primary">0.0</span>
        </div>
        <!-- Rows -->
        <div class="form-group row">
            Input scores, press tab to add new number:
            <div id="scores">
                <input onblur="calculator()" type="text" name="score" id="score0"/><br>
                <!-- javascript generated inputs -->
            </div>
        </div>
    </form>
</div>
<style>
    position: absolute;
    width: 156px;
    height: 45px;

    background: #6886A2;
    border-radius: 24px;


    /* About Us */


    position: absolute;
    width: 98px;
    height: 35px;

    font-family: 'Heebo';
    font-style: normal;
    font-weight: 400;
    font-size: 24px;
    line-height: 35px;

    color: #E5E5E5;



    /* Polygon 6 */


    position: absolute;
    width: 17px;
    height: 14px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* Rectangle 22 */


    position: absolute;
    width: 3224px;
    height: 1863px;

    background: #170821;


    /* Rectangle 25 */


    position: absolute;
    width: 284px;
    height: 93px;

    background: #2EA5A5;
    border-radius: 24px;


    /* About Us */


    position: absolute;
    width: 179px;
    height: 73px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 35px;
    line-height: 52px;

    color: #E5E5E5;



    /* Rectangle 31 */


    position: absolute;
    width: 333px;
    height: 93px;

    background: #6FDADA;
    border-radius: 24px;


    /* Other */


    position: absolute;
    width: 284px;
    height: 73px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 36px;
    line-height: 54px;
    text-align: center;

    color: #E5E5E5;



    /* Rectangle 30 */


    position: absolute;
    width: 284px;
    height: 93px;

    background: #4BE6E6;
    border-radius: 24px;


    /* Tutoring */


    position: absolute;
    width: 179px;
    height: 73px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 40px;
    line-height: 60px;

    color: #E5E5E5;



    /* Rectangle 29 */


    position: absolute;
    width: 284px;
    height: 93px;

    background: #43DBDB;
    border-radius: 24px;


    /* Supplies */


    position: absolute;
    width: 179px;
    height: 73px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 40px;
    line-height: 60px;

    color: #E5E5E5;



    /* Rectangle 28 */


    position: absolute;
    width: 284px;
    height: 93px;

    background: #36B8B8;
    border-radius: 24px;


    /* Clothes */


    position: absolute;
    width: 179px;
    height: 73px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 40px;
    line-height: 60px;

    color: #E5E5E5;



    /* Polygon 8 */


    position: absolute;
    width: 30px;
    height: 29px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* Polygon 9 */


    position: absolute;
    width: 30px;
    height: 29px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* Polygon 10 */


    position: absolute;
    width: 30px;
    height: 29px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* Polygon 11 */


    position: absolute;
    width: 30px;
    height: 29px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* Polygon 12 */


    position: absolute;
    width: 30px;
    height: 29px;

    background: #E5E5E5;
    transform: rotate(-180deg);


    /* DNHS MARKET PLACE */


    position: absolute;
    width: 1118px;
    height: 867px;

    font-family: 'Poppins';
    font-style: normal;
    font-weight: 700;
    font-size: 200px;
    line-height: 300px;
    text-align: center;

    color: #FFFFFF;



    /* Group 1 */


    position: absolute;
    width: 1714px;
    height: 201px;



    /* Used TI Inspire Calculator... */


    position: absolute;
    width: 1208px;
    height: 74px;

    font-family: 'Poppins';
    font-style: italic;
    font-weight: 700;
    font-size: 45px;
    line-height: 68px;

    color: #9C9C9C;
</style>
<script>
    const scoresContainer = document.getElementById("scores");

    // Creates new input line
    function newInputLine(index) {
        // Prepare new input line
        var input = document.createElement("input");  // input element
        var br = document.createElement("br");  // line break element
        // Setup input line attributes
        input.setAttribute('onblur', "calculator()");
        input.setAttribute('type', "text");
        input.setAttribute('name', "score");
        input.setAttribute('id', "score" + index);
        // Add input and line break to page
        scoresContainer.appendChild(input);
        scoresContainer.appendChild(br);
    }

    // Calculates totals
    function calculator(){
        var array = document.getElementsByName('score'); // setup array of scores
        if (array[array.length-1].value.length != 0) {   // input cell has a value
            // algorithm to calculate results
            var total = 0;  // running total
            for(var i = 0; i < array.length; i++){  // iterate through array
                if(parseFloat(array[i].value))  // convert to float
                    total += parseFloat(array[i].value);  // add to running total
            }
            // update totals
            document.getElementById('total').innerHTML = total.toFixed(2);
            document.getElementById('count').innerHTML = array.length;
            document.getElementById('average').innerHTML = (total / array.length).toFixed(2);
            // make a new input line
            newInputLine(array.length);
            
        }
        // Set cursor focus on last element; this could be new or unchanged element
        document.getElementById("score" + (array.length-1)).focus();
    }

</script>