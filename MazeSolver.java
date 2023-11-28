// NAME: Thomas Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Final Project - Maze Path Finding
// DATE: 11/21/22
// RESOURCES: Stack Overflow, Book, and previous assignments. My brother also helped me with troubleshooting and some formatting.
public class MazeSolver {   //initializing our class
    Maze maze;

    MazeSolver(Maze m){ //constructor
        maze = m;
    }

    public MazeSolver() { //added 2nd empty constructor

    }


    public boolean solveMaze(int r, int c){ //solveMaze method, finds our start and replaces it with 2
        if (maze.getCell(r,c) == -1){
            if (c == 0) {
                maze.setCell(r, c, 2);
                solveMaze(r, c + 1);
            }
            else {
                System.out.print("Maze Solved:\n"); //print statement for when maze is solved
                maze.printMaze();
                return true;
            }
        }
        if(maze.isOpenSpace(r, c)) {

            maze.setCell(r,c,2);

            //to check space above current location
            boolean returnValue = solveMaze(r - 1, c);


            //to check space to the right current location
            if(!returnValue) {
                returnValue = solveMaze(r, c + 1);
            }

            //to check space below current location
            if(!returnValue) {
                returnValue = solveMaze(r + 1, c);
            }

            //to check space to the left current location
            if(!returnValue) {
                returnValue = solveMaze(r, c - 1);
            }

            if(returnValue) {
            }
            return returnValue;
        }

       return false;
    }

}
