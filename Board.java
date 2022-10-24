package sanath.boardgames;

import static java.lang.Math.floor;
public class Board {



    static int size;
    public String[][] board;
    //String game;


    public Board(int board_size) {
        this.size = board_size;
        this.board = new String[this.size][this.size];
        displayboard();
        //String[][] board= new String[size][size];
    }





    public boolean nospaceleft(){
        //System.out.println("we are in nospaceleft");
        //System.out.println(size);
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                if(this.board[r][c] == null)
                    return false;
            }
        }
        return true;
    }

    public void displayboard(){
        //System.out.println("| - | - | - |");

        System.out.println("The current state of the board has been printed below");
        System.out.println("The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice");
        String firstline = "| - |";


        for(int i =0;i<size-1;i++){
            firstline = firstline + " -|";

        }

        //System.out.println(firstline);
        for(int i = 0; i<size;i++){
            System.out.println(printrow(i,this.board));
            //System.out.println(firstline);
            //System.out.println("| - | - | - |");
        }

    }


    public boolean validateinput(int pos){
        //System.out.println("we are in validate input");
        int r = (pos-1)/size;
        //System.out.println("the row is " + r);
        int c = (pos - ( r * size))-1;
        //System.out.println("the col is " + c);
        if(pos > (size*size) || pos <= 0){
            System.out.println("Please choose a position within the bounds of the tictactoe board");
            return false;

        } else if(!(this.board[r][c] == null)) {
            System.out.println("That position is already occupied, please choose another spot");
            return false;
        }

        return true;

    }

    public static String printrow(int row, String[][] board){
        String rowstring = "|";

        for(int j =0;j<size;j++){
            if(board[row][j] == null){
                int strpos = row*size + j + 1;
                rowstring = rowstring + " " + String.valueOf(strpos) + " |";
            }else{
                rowstring = rowstring + " " + board[row][j] + " " + "|";
            }


        }
        return rowstring;
    }

    public String determineresult(tictactoeplayer player1, tictactoeplayer player2) {
        //first iterate across along each row. Row1

        for (int i = 0; i < size; i++) {
            String firstval = " ";
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null){
                    break;
                }

                if (j == 0) {
                    firstval = board[i][j];

                } else {

                    if (board[i][j] != null && !firstval.equals(board[i][j])) {
                        break;
                    }
                    if (j == size - 1) {
                        if (board[i][j] != null && board[i][j].equals(firstval)) {
                            if (board[i][j] != null && firstval.equals(player1.key))
                                return player1.name;
                            else
                                return player2.name;

                        }
                    }
                }
            }
        }


        //first iterate across each column. Column1

        for (int j = 0; j < size; j++) {
            String firstval = " ";
            for (int i = 0; i < size; i++) {
                if (board[i][j] == null){
                    break;
                }
                if (i == 0) {
                    firstval = board[i][j];

                } else {
                    if (board[i][j] != null && !firstval.equals(board[i][j])){
                        break;
                    }
                    if (i == size - 1) {
                        if (board[i][j] != null && board[i][j].equals(firstval)) {
                            if (board[i][j] != null && firstval.equals(player1.key))
                                return player1.name;
                            else
                                return player2.name;

                        }
                    }
                }
            }
        }

        //left to right diagonal
        String firstval = " ";
        for (int i = 0; i < size; i++) {


            if (board[i][i] == null){
                break;
            }

            if (i == 0) {
                //System.out.println("the i and j are" + i);
                firstval = board[i][i];

            } else {

                if (board[i][i] != null && !firstval.equals(board[i][i])) {
                    break;
                }
                if (i == size - 1) {
                    if (board[i][i] != null && board[i][i].equals(firstval)) {
                        if (board[i][i] != null && firstval.equals(player1.key))
                            return player1.name;
                        else
                            return player2.name;
                    }

                }
            }
        }

        firstval = " ";
        for (int i = size - 1; i > -1; i--) {

            if (board[i][size - i - 1] == null){
                break;
            }
            if (i == size - 1) {
                firstval = board[i][size - i - 1];
            } else {
                if (board[i][size - i - 1] != null && !firstval.equals(board[i][size - i - 1])) {
                    break;
                }
                if (i == 0) {
                    if (board[i][size - i - 1] != null && board[i][size - i - 1].equals(firstval)) {
                        if (firstval.equals(player1.key))
                            return player1.name;
                        else
                            return player2.name;
                    }

                }
            }
        }


        String status = "Game in Progress";
        return status;


    }


    public String determineresult(Orderchaosplayer player1, Orderchaosplayer player2) {
        //first iterate across along each row. Row1

        for (int i = 0; i < size; i++) {
            String firstval = " ";
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null){
                    break;
                }

                if (j == 0) {
                    firstval = board[i][j];

                } else {

                    if (board[i][j] != null && !firstval.equals(board[i][j])) {
                        break;
                    }
                    if (j == size - 1) {
                        if (board[i][j] != null && board[i][j].equals(firstval)) {
                            if (board[i][j] != null && firstval.equals(board[i][j])){
                                if(player1.Role.equalsIgnoreCase("Order")){
                                    return player1.name;
                                }else{
                                    return player2.name;
                                }

                            }
                        }
                    }
                }
            }
        }


        //first iterate across each column. Column1

        for (int j = 0; j < size; j++) {
            String firstval = " ";
            for (int i = 0; i < size; i++) {
                if (board[i][j] == null){
                    break;
                }
                if (i == 0) {
                    firstval = board[i][j];

                } else {
                    if (board[i][j] != null && !firstval.equals(board[i][j])){
                        break;
                    }
                    if (i == size - 1) {
                        if (board[i][j] != null && board[i][j].equals(firstval)) {
                            if (board[i][j] != null && firstval.equals(board[i][j])){
                                if(player1.Role.equalsIgnoreCase("Order")){
                                    return player1.name;
                                }else{
                                    return player2.name;
                                }
                            }
                        }
                    }
                }
            }
        }

        //top left to bottom right diagonal
        String firstval = " ";
        for (int i = 0; i < size; i++) {


            if (board[i][i] == null){
                break;
            }

            if (i == 0) {
                firstval = board[i][i];

            } else {

                if (board[i][i] != null && !firstval.equals(board[i][i])) {
                    break;
                }
                if (i == size - 1) {
                    if (board[i][i] != null && board[i][i].equals(firstval)) {
                        if (board[i][i] != null && firstval.equals(board[i][i])) {
                            if (player1.Role.equalsIgnoreCase("Order")) {
                                return player1.name;
                            } else {
                                return player2.name;
                            }

                        }


                    }

                }
            }
        }


        //bottom left to top right diagonal
        firstval = " ";
        for (int i = size - 1; i > -1; i--) {

            if (board[i][size - i - 1] == null){
                break;
            }
            if (i == size - 1) {
                firstval = board[i][size - i - 1];
            } else {
                if (board[i][size - i - 1] != null && !firstval.equals(board[i][size - i - 1])) {
                    break;
                }
                if (i == 0) {
                    if (board[i][size - i - 1] != null && board[i][size - i - 1].equals(firstval)) {
                        if(player1.Role.equalsIgnoreCase("Order")){
                            return player1.name;
                        }else{
                            return player2.name;
                        }

                    }

                }
            }
        }


        String status = "Game in Progress";
        return status;




    }

    public void update_board(tictactoeplayer player1, int pos) {
        int row = (pos-1)/size;
        int col = (pos - (row*size))-1;
        this.board[row][col] = player1.key;

    }


    public void update_board(Orderchaosplayer player1, int pos, String keyoc) {
        int row = (pos-1)/size;
        int col = (pos - (row*size))-1;
        this.board[row][col] = keyoc;

    }






}
