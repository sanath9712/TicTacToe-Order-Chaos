import sanath.boardgames.Board;
import sanath.boardgames.Orderchaosplayer;
import sanath.boardgames.Player;
import sanath.boardgames.tictactoeplayer;


import java.util.Random;
import java.util.Scanner;



public class boardgames {



    public static void tictactoe(String play1, String play2){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key(X/O) for: " + play1);
        String key1 = input.nextLine().toUpperCase();
        System.out.println("Enter the key(X/O) for: " + play2);
        String key2 = input.nextLine().toUpperCase();
        tictactoeplayer player1 = new tictactoeplayer(play1, key1);
        tictactoeplayer player2 = new tictactoeplayer(play2, key2);
        System.out.println("Enter the size of the board (3 or more)");
        int board_size = input.nextInt();
        Random rand = new Random();
        int turn = rand.nextInt(2);
        if(turn==1) {
            System.out.println("THE FIRST TURN GOES TO " + player2.name);
        }else{
            System.out.println("THE FIRST TURN GOES TO " + player1.name);
        }

        Board board;
        board = new Board(board_size);
        System.out.println("You entered: " + board_size);
        int winner_flag = 0;
        while (!board.nospaceleft()) {

            if (turn == 0) {
                System.out.println(player1.name + ", It is your turn");
                System.out.println("Enter the position where you would like to place your key " + player1.key);
                int pos = input.nextInt();
                while(!board.validateinput(pos)){
                    pos = input.nextInt();
                }

                board.update_board(player1, pos);


                turn = 1;
            } else if (turn == 1) {
                System.out.println(player2.name + ", It is your turn");
                System.out.println("Enter the position where you would like to place your key " + player2.key);
                int pos = input.nextInt();
                while(!board.validateinput(pos)){
                    pos = input.nextInt();
                }

                board.update_board(player2, pos);
                turn = 0;



            }


            board.displayboard();

            String result = board.determineresult(player1, player2);

            if(!result.equals("Game in Progress")){
                winner_flag = 1;
                System.out.println("CONGRATULATIONS! THE WINNER IS: " + result);
                break;
            }

        }

        if(winner_flag == 0 && board.nospaceleft()){
            System.out.println("THE GAME WAS A TIE");



        }
        Scanner new_input = new Scanner(System.in);
        System.out.println("Would you like to continue playing?(Y/N)");
        String choice = new_input.nextLine();
        if(choice.equalsIgnoreCase("Y")){
            System.out.println("What would you like to play?(T/O)");
            String choice2 = new_input.nextLine();
            if(choice2.equalsIgnoreCase("T")){
                tictactoe(play1, play2);
            }else{
                orderchaos(play2, play2);
            }

        }else{
            System.out.println("Goodbye! Have a nice day");
        }

    }

    public static void orderchaos(String play1, String play2){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the role for " + play1 + "(Order/Chaos)");
        String role1 = input.nextLine();
        String role2 = "";
        if(role1.equalsIgnoreCase("Order")){
            role2 = "Chaos";
            System.out.println("Setting role of " + play2 + " to chaos as " + play1 + " chose order");
        }if(role1.equalsIgnoreCase( "Chaos")){
            role2 = "Order";
            System.out.println("Setting role of " + play2 + " to order as " + play1 + " chose chaos");
        }

        Orderchaosplayer player1 = new Orderchaosplayer(play1, role1);
        Orderchaosplayer player2 = new Orderchaosplayer(play2, role2);

        Board board;
        board = new Board(6);



        if(player1.Role.equals("Order"))
        {
            System.out.println("THE FIRST TURN GOES TO ORDER: " + player1.name);
            orderchaosimplementer(player1, player2,board);

        }else{
            System.out.println("THE FIRST TURN GOES TO ORDER: " + player2.name);
            orderchaosimplementer(player2, player1,board);
        }

    }

    public static void orderchaosimplementer(Orderchaosplayer player_1, Orderchaosplayer player_2, Board board)
    {
        Scanner input = new Scanner(System.in);
        while (!board.nospaceleft()) {


            System.out.println(player_1.name + ", It is your turn");
            System.out.println("Enter the key you would like to place(X/O)");
            String keyoc1 = input.nextLine().toUpperCase();
            String keyoc2 = "";
            System.out.println("Enter the position where you want to play the key");
            int pos = input.nextInt();


            while(!board.validateinput(pos)){
                pos = input.nextInt();
            }

            board.update_board(player_1, pos, keyoc1);

            board.displayboard();

            String result = board.determineresult(player_1, player_2);
            if(!result.equals("Game in Progress")){
                System.out.println("CONGRATULATIONS! THE WINNER IS ORDER: " + result);
                break;
            }

            keyoc1 = input.nextLine();



            System.out.println(player_2.name + ", It is your turn");
            System.out.println("Enter the key you would like to place(X/O)");
            keyoc2 = input.nextLine().toUpperCase();



            System.out.println("Enter the position where you want to place the key");
            pos = input.nextInt();


            while(!board.validateinput(pos)){
                pos = input.nextInt();
            }

            board.update_board(player_2, pos, keyoc2);

            board.displayboard();

            result = board.determineresult(player_1, player_2);

            if(!result.equals("Game in Progress")){
                System.out.println("CONGRATULATIONS! THE WINNER IS ORDER: " + result);
                break;
            }
            keyoc2 = input.nextLine();
        }

        String winner;

        if(board.nospaceleft()){
            if(player_1.Role.equals("Order")){
                winner = player_2.name;
            }else{
                winner = player_1.name;
            }

            System.out.println("CONGRATULATIONS! THE WINNER IS CHAOS: " + winner);

        }

        Scanner new_input = new Scanner(System.in);
        System.out.println("Would you like to continue playing?(Y/N)");
        String choice = new_input.nextLine();
        if(choice.equalsIgnoreCase("Y")){
            System.out.println("What would you like to play?(T/O)");
            String choice2 = new_input.nextLine();
            if(choice2.equalsIgnoreCase("T")){
                tictactoe(player_1.name, player_2.name);
            }else{
                orderchaos(player_1.name, player_2.name);
            }

        }else{
            System.out.println("Goodbye! Have a nice day");
        }

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("There will be two players in this game.");
        System.out.println("Enter the name of the First player");
        String play1 = sc.nextLine();
        System.out.println("Enter the name of second player");
        String play2 = sc.nextLine();

        System.out.println("Choose the game which you would like to play:(T/O)");
        String game;
        game = sc.nextLine();
        game = game.toUpperCase();
        System.out.println("You entered: " + game);



        if(game.equalsIgnoreCase("T")){
            tictactoe(play1,play2);
        }else{
            orderchaos(play1, play2);
        }




    }
}