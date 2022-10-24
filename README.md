# CS611-<Assignment 1>
## <Assignment Tic Tac Toe and other variants>
------------------------------------------------------------------------------------------------------------------------------
Name: Sanath Bhimsen
Email: sanath97@bu.edu
BUID: U76109980
------------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------------
## Files

1. boardgames.java: This is file which has the boardgames class and the main method. So the program effectively runs out of this file. The other classes and libraries which I have used are imported to this file. The main method collects the names of the two players who will be playing the program and then allows the user to select the game they want to play. The two games developed are Tic Tac Toe and order&chaos. Based the user's choice, the respective function is invoked in the code(tictactoe or order&chaos).

2. Board.java: This file has the board class and forms the backbone of my implementation along with boardgames.java. The program operates on an instance of this class which is the board. Both the games are played on the instance of this class and any move made by the player is reflected on the board. The board class has many functions that enables operations on the board. For eg: displaying the board, updating the board after each move by the player and so on.

3. Player.java: The purpose of this class is to initialize the player class and out of which the tictactoeplayer class and the orderchaosplayer class is formed. These classes add the respective attributes based on which the class gains its significance and fuctionality.

4. tictactoeplayer.java: This file contains the tictactoeplayer class which is a child of the player class. This class is used to create a player and it stores the name and key(X/O) associated with that player.

5. Orderchaosplayer.java: This file contains the tictactoeplayer class which is a child of the player class. This class is used to create a player and it stores the name and role(Order/Chaos) associated with that player

------------------------------------------------------------------------------------------------------------------------------

#How to compile

javac -d bin src/*.java
java -cp bin boardgames

Instructions:

1) Move all the files except the the java file with the main method into the src directory.
2) keep the boardgames.java file outside the source directory
3) go to the src dir and compile those 4 files.
4) come outside and compile the boardgames.java file

sanathbhimsen@crc-dot1x-nat-10-239-119-56 src %  javac -d . *.java
sanathbhimsen@crc-dot1x-nat-10-239-119-56 test % java boardgames.java 

-------------------------------------------------------------------------------------------------------------------------------

Sample Input/Output:
1.
There will be two players in this game.
Enter the name of the First player
Sanath
Enter the name of second player
Player2
Choose the game which you would like to play:(T/O)
T
You entered: T
Enter the key(X/O) for: Sanath
X
Enter the key(X/O) for: Player2
O
Enter the size of the board (3 or more)
3
THE FIRST TURN GOES TO Sanath
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| 1 | 2 | 3 |
| 4 | 5 | 6 |
| 7 | 8 | 9 |
You entered: 3
Sanath, It is your turn
Enter the position where you would like to place your key X
1
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | 2 | 3 |
| 4 | 5 | 6 |
| 7 | 8 | 9 |
Player2, It is your turn
Enter the position where you would like to place your key O
4
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | 2 | 3 |
| O | 5 | 6 |
| 7 | 8 | 9 |
Sanath, It is your turn
Enter the position where you would like to place your key X
2
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | 3 |
| O | 5 | 6 |
| 7 | 8 | 9 |
Player2, It is your turn
Enter the position where you would like to place your key O
7
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | 3 |
| O | 5 | 6 |
| O | 8 | 9 |
Sanath, It is your turn
Enter the position where you would like to place your key X
3
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X |
| O | 5 | 6 |
| O | 8 | 9 |
CONGRATULATIONS! THE WINNER IS: Sanath


2.
/Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=59860:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/sanathbhimsen/IdeaProjects/Boardgames/out/production/Boardgames boardgames
There will be two players in this game.
Enter the name of the First player
Sanath
Enter the name of second player
Bhimsen
Choose the game which you would like to play:(T/O)
O
You entered: O
Enter the role for Sanath(Order/Chaos)
Order
Setting role of Bhimsen to chaos as Sanath chose order
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| 1 | 2 | 3 | 4 | 5 | 6 |
| 7 | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
THE FIRST TURN GOES TO ORDER: Sanath
Sanath, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to play the key
1
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | 2 | 3 | 4 | 5 | 6 |
| 7 | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Bhimsen, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to place the key
2
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | 3 | 4 | 5 | 6 |
| 7 | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Sanath, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to play the key
3
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X | 4 | 5 | 6 |
| 7 | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Bhimsen, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to place the key
4
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X | X | 5 | 6 |
| 7 | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Sanath, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to play the key
7
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X | X | 5 | 6 |
| X | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Bhimsen, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to place the key
5
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X | X | X | 6 |
| X | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
Sanath, It is your turn
Enter the key you would like to place(X/O)
X
Enter the position where you want to play the key
6
The current state of the board has been printed below
The numbers indicate the positions which are free and please enter a number while choosing a position, it will be filled after your choice
| X | X | X | X | X | X |
| X | 8 | 9 | 10 | 11 | 12 |
| 13 | 14 | 15 | 16 | 17 | 18 |
| 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |
| 31 | 32 | 33 | 34 | 35 | 36 |
CONGRATULATIONS! THE WINNER IS ORDER: Sanath
