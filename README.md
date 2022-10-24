# CS611-<Assignment 1>
## <Assignment Tic Tac Toe and other variants>
------------------------------------------------------------------------------------------------------------------------------
Name: Sanath Bhimsen
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

sanathbhimsen@crc-dot1x-nat-10-239-119-56 test % java boardgames

-------------------------------------------------------------------------------------------------------------------------------
