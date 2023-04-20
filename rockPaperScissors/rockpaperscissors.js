let playerSelection;
let check=0,player=0,computer=0,tie=0;
let finalWinner;
const para=document.querySelector('#result')


const image=document.querySelectorAll('img');
image.forEach(item => item.addEventListener('click',function(e){
    playerSelection=parseInt(this.id);
    game();
}))



function computerChoice(){ // this function will generate a random number which will be treated as Computer choice.
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

// function playerChoice(){  // this function ask the use to choose 1 for Rock 2 for Paper 3 for Scissors    
//     if(playerSelection==1){
//         playerSelection=33;
//         return playerSelection;
//     }
//     else if(playerSelection==2){
//         playerSelection=66;
//         return playerSelection;
//     }
//     else if(playerSelection==3){
//         playerSelection=99;
//         return playerSelection;
//     }
//     else{
//         alert("Looks you have entered a wrong choice");
//     }
// }

function winLose(pChoice,cChoice){ // this function takes the computer choice and player choice to compute win or lose.
let win,lose,tie;
if(pChoice==33){
    if(cChoice==99){
        para.textContent="You Win! Rock beats Scissors";
        console.log("You Win! Rock beats Scissors");
        win=1;
        return win;
    }
    else if(cChoice==66){
        para.textContent="You Lose! Paper beats Rock";
        console.log("You Lose! Paper beats Rock");
        lose=0;
        return lose;
    }
    else{
        para.textContent="Match is Tie";
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
else if(pChoice==66){
    if(cChoice==33){
        para.textContent="You Win! Paper beats Rock";
        console.log("You Win! Paper beats Rock");
        win=1;
        return win;
    }
    else if(cChoice==99){
        para.textContent="You Lose! Scissors beats Paper";
        console.log("You Lose! Scissors beats Paper");
        lose=0;
        return lose;
    }
    else{
        para.textContent="Match is Tie";
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
else if(pChoice==99){
    if(cChoice==66){
        para.textContent="You Win! Scissors beats Paper";
        console.log("You Win! Scissors beats Paper");
        win=1;
        return win;
    }
    else if(cChoice==33){
        para.textContent="You Lose! Rock beats Scissors";
        console.log("You Lose! Rock beats Scissors");
        lose=0;
        return lose;
    }
    else{
        para.textContent="Match is Tie";
        console.log("Match is Tie");
        tie=3;
        return tie;
    }
}
}

function playRound(){  // this function plays the one round 
    return  winLose(playerChoice(), computerChoice());
}


function game(){ // this function loops the game and prompt the user to play 5 rounds.
    
        check=winLose(playerSelection, computerChoice());

        if(check==1){
            player++;
        }
        if(check==0){
            computer++;
        }
        if(check==3){
            tie++;
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
    let temp=(player+computer+tie)%5
    if(temp==0){
        para.textContent=`\nFinal Scores Are\n \nPlayer : ${player}\nComputer : ${computer}\nTie : ${tie}\n\n As Score are clear winner is ${finalWinner}`
    }
  
}

