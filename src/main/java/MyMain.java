public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        // YOUR CODE HERE
        if (board[row][col]) System.out.println("There was a hit!");
        else System.out.println("You missed a boat!");
        return board[row][col];
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        // YOUR CODE HERE
        if (direction.equals("down")) for (int i = row; i<row+boatLength; i++) board[row][col] = true;
        else if (direction.equals("right")) for (int i = col; i<col+boatLength; i++) board[row][col] = true;
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        // YOUR CODE HERE
        return false;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
