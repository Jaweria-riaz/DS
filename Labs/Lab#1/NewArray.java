public class NewArray {

    void extractBoundaries(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][0] + " "); 
            System.out.print(arr[i][cols - 1] + " "); 
            System.out.println();
        }

        
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();
    }

    
    void cropCenterPart(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        NewArray obj = new NewArray();
        System.out.println("Boundaries:");
        obj.extractBoundaries(arr);

        System.out.println("\nCenter Part:");
        obj.cropCenterPart(arr);
    }
}