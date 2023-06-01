let currentValue="";
let previousValue="";
let operator="";

document.addEventListener("DOMContentLoaded",function(){
   let clear=document.querySelector(".clear");                  
   let equal=document.querySelector(".equal");
   let decimal=document.querySelector(".decimal");
  
   let numbers=document.querySelectorAll(".number");
   let operators=document.querySelectorAll(".operator");
   
   let previousScreen=document.querySelector(".previousScreen");
   let currentScreen=document.querySelector(".currentScreen");
  
  
  numbers.forEach((number) => number.addEventListener("click",function(e){
       handleNumber(e.target.textContent);  
       currentScreen.textContent=currentValue;
  }))
  
  operators.forEach((op) => op.addEventListener("click",function(e){
       handleOperator(e.target.textContent);
       previousScreen.textContent=previousValue + " " + operator;
       currentScreen.textContent=currentValue;
  }))


  clear.addEventListener("click",function(){
        currentValue="";
        previousValue="";
        operator="";
        previousScreen.textContent="";
        currentScreen.textContent="";
  })


  equal.addEventListener("click",function(){
        calculate();
        previousScreen.textContent="";
        currentScreen.textContent=previousValue;
  })

})
  
  
  function handleNumber(num){
      if(currentValue.length<=15){
      currentValue += num;
      }
  }

  function handleOperator(op){
    operator=op;
    previousValue=currentValue;
    currentValue="";
    }

  function calculate(){
    previousValue=Number(previousValue);
    currentValue=Number(currentValue);

    if(operator==="+"){
        previousValue+=currentValue;
    }else if(operator==="-"){
        previousValue-=currentValue;
    }else if(operator==="X"){
        previousValue*=currentValue;
    }else if(operator==="/"){
        previousValue/=currentValue;
    }
    previousValue=Math.round(previousValue*1000000000000000)/1000000000000000;
    console.log(previousValue);

    previousValue=previousValue.toString();
    currentValue=currentValue.toString();

  }
  
