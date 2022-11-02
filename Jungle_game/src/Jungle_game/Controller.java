package Jungle_game;

import java.util.Scanner;

public class Controller {

//    Functions

//    user input (movement / username / operations like 1,2,3)
//    return a boolean represents whether break the driver loop
//    if(state == “menu”)evalMenu(expression)
//    elseif(state == “Game”)evalGame(expression)
//    check whether can move a piece to a certain place

// return end index
//    ? not sure about how to use this function
    private String getWord(int startPosition, String expression){
        return new String();
    }

//    check which command user entered
//    enter 1: jump to start game
//    enter 2: jump to user guide
//    enter 3: quit the software
    public void evalMenu(String userCommand){
        if(userCommand == null) {
            throw new IllegalArgumentException();
        }
    }

//     input "move piece direction" to check
//     whether user can move one piece to a certain place
//       or check whether a piece can capture another piece
//     e.g. move A1 1
    public boolean evalGame(String userCommand, String[][] board){
        if(board.length == 0 || board == null){
            throw new IllegalArgumentException();
        }
        boolean flag = true;
        return flag;
    }

}
