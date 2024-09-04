
Here's a sample README for your Java ten-pin bowling score tracker application:

Ten-Pin Bowling Score Tracker
Overview
This Java application is a console-based ten-pin bowling score tracker that allows multiple players to play a game of bowling. The program calculates and displays scores according to standard ten-pin bowling rules, handling strikes, spares, and open frames.

Features
Multiple Players: Supports multiple players in a single game.
Score Calculation: Automatically calculates scores following standard ten-pin bowling rules.
Frame Management: Correctly handles strikes, spares, and open frames.
User Input: Users can input the number of pins knocked down in each roll.
Score Display: Continuously displays the scores of each player after every frame.
Requirements
Java 8 or higher installed on your system.
A terminal or command prompt to run the application.
Setup and Installation
Clone the Repository:

bash
Copy code
git clone https://github.com/YusufCeres/Ten_Pin_Bowling.git
cd ten-pin-bowling
Compile the Java Program:

bash
Copy code
javac Game.java
Run the Program:

bash
Copy code
java Game
Usage
Starting the Game:

When you run the program, you will be prompted to enter the number of players.
After entering the number of players, provide each player's name when prompted.
Playing the Game:

For each frame, enter the number of pins knocked down in the first and (if necessary) second roll.
The program will automatically calculate the scores, including bonuses for strikes and spares.
Viewing Scores:

After each frame, the current scores for all players will be displayed.
At the end of the game, the final scores will be shown.
Example
bash
Copy code
Enter number of players: 2
Enter name for player 1: Alice
Enter name for player 2: Bob

Frame 1 for Alice
Enter first roll: 7
Enter second roll: 2

Frame 1 for Bob
Enter first roll: 10

Scores for Alice: 9
Scores for Bob: 10
Code Structure
Player.java: Represents a player in the game, tracking their name and scores.
Frame.java: Represents a single frame in a bowling game, handling rolls, strikes, and spares.
Game.java: Manages the overall game, handling player input, score calculation, and the game loop.
