
let boxColor="white";

function setColor(color){
    boxColor=color;
}

function changeColor(x){
  x.style.backgroundColor=`${boxColor}`;
  document.querySelector("h1").style.color=boxColor;
  document.querySelector("button").style.backgroundColor=boxColor;
  // document.querySelector("button").style.color="white";
  document.querySelector("label").style.color=boxColor;
  document.querySelector("#my-input").style.color=boxColor;
}

function updateValOnScroll(val){
    
let label=document.querySelector("label");
label.innerHTML=`the Grid is of size ${val} x ${val}`;
const boxsize=parseInt(val);
let numOfBoxes=boxsize*boxsize;

const grid=document.getElementById("grid");
grid.replaceChildren();
grid.style.gridTemplateColumns=`repeat(${boxsize}, auto)`;
for (let i = 0; i < numOfBoxes; i++) {
    const box = document.createElement("div");
    box.className= "box";
    grid.appendChild(box);
    box.setAttribute('id',`${i}`);
    box.setAttribute('onmouseover','changeColor(this)')
  }
 
}


const clear=document.querySelector("button");
clear.addEventListener('click',()=>{
  grid.replaceChildren();
})