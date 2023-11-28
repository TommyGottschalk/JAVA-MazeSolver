// NAME: Thomas Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Final Project - Maze Path Finding
// DATE: 11/21/22
// RESOURCES: Stack Overflow, Book, and previous assignments. My brother also helped me with troubleshooting and some formatting.
import java.util.Scanner;

public class MazeDriver {   //initializing our class

    static int[][] maze1 = {{1,1,1,1,1,1,1,1,1,1,1,1},  //2D Array of Maze1
            {1,0,0,0,1,0,0,0,0,0,0,1},
            {-1,0,1,0,1,0,1,1,1,1,0,1},
            {1,1,1,0,1,0,0,0,0,1,0,1},
            {1,0,0,0,0,1,1,1,0,1,0,-1},
            {1,1,1,1,0,1,0,1,0,1,0,1},
            {1,0,0,1,0,1,0,1,0,1,0,1},
            {1,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,1,0,1},
            {1,1,1,1,1,1,0,1,1,1,0,1},
            {1,0,0,0,0,0,0,1,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1}};


    static int[][] maze2 = {
        {1,1,1,1,1,1,1,1,1,1,1,1},  //2D Array of Maze2
        {1,0,0,0,1,0,0,0,1,1,0,-1},
        {1,0,1,0,0,0,1,0,0,0,0,1},
        {1,0,1,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,1,1,0,0,0,0,0,1},
        {1,1,1,0,1,1,1,1,0,1,0,1},
        {-1,0,0,0,0,0,0,0,0,0,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1}
        };


    static int[][] maze3 = {{1,1,1,1,1,1,1,1,1},    //2D Array of Maze3
            {1,0,1,0,1,0,0,0,1},
            {1,0,0,0,1,0,1,1,1},
            {1,1,1,0,1,0,1,0,-1},
            {-1,0,0,0,0,0,1,0,1},
            {1,1,0,1,0,1,1,0,1},
            {1,0,0,1,0,1,0,0,1},
            {1,1,0,1,0,1,0,0,1},
            {1,1,1,1,1,1,1,1,1}};





    public static void main(String[] args){ //Main method
        Maze m1 = new Maze(maze1);      //Setting our mazes to objects
        Maze m2 = new Maze(maze2);
        Maze m3 = new Maze(maze3);
        MazeSolver ms = new MazeSolver();

        System.out.print("***Welcome to the Maze Project***\n");      //formatting for our print statement
        System.out.print("Select a maze to solve:\n" + "1. Maze 1\n" + "2. Maze 2\n" + "3. Maze 3\n");
        System.out.print("Choice:");
        Scanner ui = new Scanner(System.in);    //scanner for user input
        Integer choice = Integer.valueOf(ui.nextLine());
        if (choice == 1){
            ms = new MazeSolver(m1);    //Sets user choice to correspond with what maze they want
        }else if (choice == 2){
            ms = new MazeSolver(m2);
        }else if (choice == 3){
            ms = new MazeSolver(m3);
        }

        ms.maze.printMaze();        //calling our printMaze method
        if (ms.solveMaze(ms.maze.getEntranceRow(), 0)){     //
            System.out.print("Solved");
        }

    }
}
