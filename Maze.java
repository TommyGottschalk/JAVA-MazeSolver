// NAME: Thomas Gottschalk
// CLASS: 22FA_INFO_1521_WW
// ASSIGNMENT: Final Project - Maze Path Finding
// DATE: 11/21/22
// RESOURCES: Stack Overflow, Book, and previous assignments. My brother also helped me with troubleshooting and some formatting.
public class Maze { //initializing our class
    private int [][] map;   //initializing our variables
    private int entranceRow;

    public Maze(int[][] m){      //constructor, takes in our 2d array and sets it to m
        this.map = m;
        this.entranceRow = findEntranceRow();
    }


    private int findEntranceRow(){      //method to find maze starting point
        int entranceRow = -1;
        for (int row = 0; row < map.length; row++) {    //loops through first column
                if (map[row][0] == -1) {    //when it finds -1, it sets it to entranceRow
                    entranceRow = row;
                }
        }
        return entranceRow; //return maze entrance
    }



    public int getEntranceRow(){    //Getter method for our entrance, returns our entrance
        return findEntranceRow();
    }

    public int getExitColumn(){     //gets the length of our 2d array as exitColumn
        int exitColumn = map.length;
        return exitColumn;
    }

    public int getCell(int r, int c){   //Getter method for our maze coordinates, returns location
        return map[r][c];
    }

    public void setCell(int r, int c, int val){ //Setter method for changing characters after we've already been there
        map[r][c] = val;
    }

    public boolean isOpenSpace(int r, int c){   //checks if valid location in maze. makes sure location is in bounds,
        if (r >= 0 && r < map.length && c >= 0 && c < map[0].length) {  //returns true if movable space, otherwise returns false
            if (map[r][c] == 0){
                return true;
            }
        }
        return false;
    }


    public void printMaze(){        //Print method for our maze,checks maze size to get new String array size.
        String[][] mapToPrint = new String[map.length][map[0].length];
        for (int row = 0; row < map.length; row++) {    //to loop through entire array
            for (int column = 0; column < map[0].length; column++) {
                if (map[row][column] == 1){     //replaces 1's of arrays with **
                    mapToPrint[row][column] = "**";
                }else if (map[row][column] == 0){   //replaces 0's of arrays with "  "
                    mapToPrint[row][column] = "  ";
                }else if (map[row][column] == -1){  //replaces -1's of arrays with []
                    mapToPrint[row][column] = "[]";
                }else if (map[row][column] == 2){   //replaces 2's of arrays with @@, to show how we solved the maze
                    mapToPrint[row][column] = "@@";
                }
            }
        }
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                System.out.print(mapToPrint[row][column]);
            }
            System.out.print("\n");
        }

    }



}
