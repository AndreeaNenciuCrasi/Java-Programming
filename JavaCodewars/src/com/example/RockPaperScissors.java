package com.example;

//Rock Paper Scissors
//        Let's play! You have to return which player won! In case of a draw return Draw!.
//
//        Examples:
//
//        rps('scissors','paper') // Player 1 won!
//        rps('scissors','rock') // Player 2 won!
//        rps('paper','paper') // Draw!

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if ((p1 == "scissors" && p2 =="paper") || (p1 == "paper" && p2 =="rock")||(p1 =="rock" && p2 == "scissors")){
            return "Player 1 won!";
        }else if
        ((p2 == "scissors" && p1 =="paper") || (p2 == "paper" && p1 =="rock")||(p2 =="rock" && p1 == "scissors"))
        {
            return "Player 2 won!";
        }else if
        ((p1 == "scissors" && p2 =="scissors") || (p1 == "paper" && p2 =="paper")||(p1 =="rock" && p2 == "rock"))
        { return "Draw!";}
        return "no game";
    }
}
