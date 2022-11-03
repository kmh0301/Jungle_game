package Jungle_game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Model {

// Fields
    private String AuserName,BuserName;
    public String[][] board = new String[9][];

// Functions

    //    get both user’s name
    private void getUsername(){

    }

    //    initial the game and all the pieces
    public void init(){

    }

    // The position is river/trap/den/land.
    // return a String represent position information
    // "1" represents river, "2" represents trap,
    // "3" den, "0" land, "4A1" piece
    public String[][] posiInfo() throws IOException {
        Scanner scanner = new Scanner( new BufferedReader(new FileReader("Jungle_game/src/board.txt")));
        final  int totalRow = 9;
        final  int totalColumn = 7;
        String[][] boardlist = new  String[totalRow][totalColumn];
        while (scanner.hasNextLine()){
            for (int i = 0; i<boardlist.length ; i++) {
                String[] line = scanner.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    boardlist[i][j] =  (line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(boardlist));
        System.out.println(Arrays.deepToString(boardlist).replace("[[","|").replace("], ", "|\n").replace("[", "|").replace(", ", "|").replace("]]", "|"));
//        for (int i = 0; i < boardlist.length;i++) {
//            System.out.println(Arrays.toString(boardlist[i]));
//        }



//        BufferedReader bufReader =;
//        ArrayList<String> boardList = new ArrayList<>();
//
//        String line = bufReader.readLine();
//
//        while (line != null) {
//            boardList.add(line);
//            line = bufReader.readLine();
//        }
//        bufReader.close();
//        return boardList;
        return boardlist;
}
    // check is that any user fulfills the win condition
// list is empty: other side is win
// list is not empty: check whether chessmen stay in the den.
// In the den -> win, not in the den
// (1)	lose    (2)	win    (3)	not finish
// return a string type to indicate the status
    public String winnerCheck(List availablePieces){
        String status = new String();
        return status;
    }

    // return a Boolean value to check whether the position is available or not
    public boolean posiCheck(){
        boolean result = false;
        return result;
    }

    // Check whether the pieces are in which position,
    // return a list with two integer (x,y)
    public int[] piecesInfo(String pieces) throws IOException {
//        int targeti = 0, targetj= 0;
        int[] target= new int[2];
        String[][] boardlist = posiInfo();
        System.out.println("piecesinfonow");
        for (int i = 0; i < boardlist.length; i++) {
            for (int j = 0; j < boardlist[i].length; j++) {
                if (boardlist[i][j].equals(pieces)){
                    target[0]=i;
                    target[1]=j;
                }
            }
        }
        return target;
    }

    // check the available chessman which is still alive
    // return a list of string (name of piece)
    private List<String> alivePiecesCheck(){
        List<String> PieceName = new ArrayList<String>();
        return PieceName;
    }

//  move the corresponding piece by analysing command user entered
//   direction: (1->up 2->down 3->left 4->right)
    public void move (String userCommand){
        if(userCommand == null){
            throw new IllegalArgumentException();
        }
    }

}
