package Lab8;
public class GreedyPathFinder {
    // Define the matrix
    static int[][] matrix = {
        {0, -1, -1, 1, 1, 1, 0},
        {-1, 2, 5, 4, 10, 3, -1},
        {3, 2, -1, 0, -1, 0, 8},
        {4, -1, 10, 2, -1, -1, 17},
        {4, 3, 9, -1, -1, 8, 33},
        {17, -1, -1, 1, 0, 44, 100}
    };

    static int goalRow = matrix.length - 1;
    static int goalCol = matrix[0].length - 1;

    public static void main(String[] args) {
        // Start from the top-left corner (0, 0)
        int startRow = 0, startCol = 0;
        String path = findPath(startRow, startCol);

        if (path != null) {
            System.out.println("Path found: " + path);
        } else {
            System.out.println("NO POSSIBLE PATH due to BLOCKs on every side.");
        }
    }

    public static String findPath(int row, int col) {
        StringBuilder path = new StringBuilder();
        path.append("[").append(row).append(", ").append(col).append("]");

        while (row != goalRow || col != goalCol) {
            int[] nextMove = getNextMove(row, col);

            if (nextMove == null) {
                return null; // No possible path due to blocks
            }

            row = nextMove[0];
            col = nextMove[1];
            path.append(" -> [").append(row).append(", ").append(col).append("]");
        }

        return path.toString();
    }

    public static int[] getNextMove(int row, int col) {
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int maxValue = -1;
        int[] nextMove = null;

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValid(newRow, newCol) && matrix[newRow][newCol] > maxValue) {
                maxValue = matrix[newRow][newCol];
                nextMove = new int[]{newRow, newCol};
            }
        }

        return nextMove;
    }

    public static boolean isValid(int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length && matrix[row][col] != -1;
    }
}