# CS342-Project05
TicTacToe w/ Min-Max Algorithm
-----------------------------------
Team #15: 	

* Aksa Chacko         | achack8
* Lawford Liu         | hliu204
* Hilda Mendoza-Avila | hmendo3
* Jason Zhang         | gzhang37
			
-----------------------------------
Name of Class: ClientGUI | Name of Developer: Jason

Class Description/Function(s):
* When each client logs on, they will choose if the server plays in “easy”, “medium” or “expert” mode and play a game of Tic Tac Toe with the server.
* When that game is complete, they can choose to play again or quit. If they play again, they can change the server’s level of expertise to something else if they want.
* Each client should see the updated list. 
* It must have a startup scene that allows the user to enter a port and IP address to connect to the server
* It must have a way to choose if the server will play in “easy”, “medium” or “expert” mode.
* It must have a way to display the current game board, top 3 scores and a “play again” button.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: ServerGUI | Name of Developer: Jason

Class Description/Function(s):
* It must have a start-up scene to enter the port and start the server. 
* It must have a list view that records the actions and traffic on the server.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: GameInfo | Name of Developer: Aksa

* Class Description/Function(s):
* It must still utilize the GameInfo class as the only means of passing information between the server and each client.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: Server | Name of Developer: Lawford

Class Description/Function(s):
* Keeps track of the list of the top 3 highest scores.
* It will also need to utilize synchronization to avoid multiple client threads corrupting the results.
* The server will incorporate this code into a class called FindNextMove. (Maybe inner class for Server just like ServerThread and ClientThread).
* The server will have a single instance of the FindNextMove class that will be used to determine each next move for each client game.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: ServerThread | Name of Developer: Lawford

Class Description/Function(s):
* The ServerThread will utilize the instance of FindNextThread found in its enclosing class, which is Server, to determine its moves as well as when the game has been won, tied or lost.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: FindNextMove | Name of Developer: Hilda

Class Description/Function(s):
* It must take the current state for a game and call the Min-Max algorithm to inform the server of its next move.
* It will also need to utilize synchronization to avoid multiple client threads corrupting the results. (For instance, Min-Max returns a list of moves but it is a combination of moves from multiple games on different threads).
* The algorithm must run on its own thread.
* It may only use the Min-Max code provided. You may alter it if you wish to suit your server’s logic. The Min-Max algorithm must run on its own thread and use synchronization to avoid race conditions. 
* Determine how to use the results of the algorithm for “expert,” “easy,” and “medium” modes and return the appropriate play according to the difficulty mode.
* Include JUnit 5 test cases for the Min-Max code provided. 
-----------------------------------
Name of Class: ClientThread | Name of Developer: Hilda

Class Description/Function(s):
* At the end of each game, each client will be able to play again or quit. 
* After each game is complete, the number of client wins should be updated as well as the list of top 3 scores.
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
Name of Class: Client | Name of Developer: Aksa

Class Description/Function(s):
* Write two test cases for this class. (The test could test the functionality of a method or the accessibility of a class data member).
-----------------------------------
