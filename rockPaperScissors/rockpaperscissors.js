// Create a fucntion getComputerChoice().
// getComputerChoice() must randomly return rock paper scissor.
//create a function which will take value from user and the computer choice and say winner.

function computerChoice(){
    let computerSelection;
    computerSelection=Math.floor(Math.random()*100);
    
    if(computerSelection>=0 && computerSelection<=33) {
        computerSelection=33;
        return computerSelection;
    }
    else if(computerSelection>=34 && computerSelection<=66){
        computerSelection=66;
        return computerSelection;
    }
    else if(computerSelection>=67 && computerSelection<=100){
        computerSelection=99;
        return computerSelection;
    }
    
}

function playerChoice(){
    let playerSelection;
    playerSelection=parseInt(prompt("Enter you choice\n 1 for Rock\n 2 for Paper\n 3 for Scissors"));
    
    if(playerSelection==1){
        playerSelection=33;
        return playerSelection;
    }
    else if(playerSelection==2){
        playerSelection=66;
        return playerSelection;
    }
    else if(playerSelection==3){
        playerSelection=99;
        return playerSelection;
    }
    else{
        alert("Looks you have entered a wrong choice");
    }
}

function winLose(pChoice,cChoice){
let win,lose,tie;
if(pChoice==33){
    if(cChoice==99){
        console.log("You Win! Rock beats Scissors");
        win=1;
        return win;
    }
    else if(cChoice==66){
        console.log("You Lose! Paper beats Rock");
        lose=0;
        return lose;
    }
    else{
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
else if(pChoice==66){
    if(cChoice==33){
        console.log("You Win! Paper beats Rock");
        win=1;
        return win;
    }
    else if(cChoice==99){
        console.log("You Lose! Scissors beats Paper");
        lose=0;
        return lose;
    }
    else{
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
else if(pChoice==99){
    if(cChoice==66){
        console.log("You Win! Scissors beats Paper");
        win=1;
        return win;
    }
    else if(cChoice==33){
        console.log("You Lose! Rock beats Scissors");
        lose=0;
        return lose;
    }
    else{
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
}

function playRound(){
    return  winLose(playerChoice(), computerChoice());
}


function game(){
    let check=0,player=0,computer=0,tie=0;
    let finalWinner;
    for(let i=0;i<5;i++){
        check=winLose(playerChoice(), computerChoice());

        if(check==1){
            player++;
        }
        if(check==0){
            computer++;
        }
        if(check==3){
            tie++;
        }
    }

    if(player>computer){
        finalWinner="Player";
    }
    else if(player<computer){
        finalWinner="computer";
    }
    else{
        finalWinner="No One";
    }
    alert(`\nFinal Scores Are\n \nPlayer : ${player}\nComputer : ${computer}\nTie : ${tie}\n\n As Score are clear winner is ${finalWinner}`)
}

game();