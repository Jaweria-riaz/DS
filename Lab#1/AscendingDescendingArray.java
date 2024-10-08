import java.util.Random;

public class  AscendingDescendingArray{
    public static void main(String []args){
        int []data=new int [20];
        Random rand=new Random(); 

        for(int i=0;i<data.length;i++){
            data[i]=rand.nextInt(100);
        }
        System.out.print("Original Array: ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" "); 
        }


for(int i=0;i<data.length-1;i++){
    for(int j=0;j<data.length-1-i;j++){
        if (data[j] >data[j + 1]) {
            // Swap array[j] and array[j + 1]
            int temp = data[j];
            data[j] = data[j + 1];
            data[j + 1] = temp;
        }
    }
}

// Print the sorted array in ascending order
System.out.print("Ascending Order: ");
for (int i = 0; i < data.length; i++) {
    System.out.print(data[i] + " ");
}
System.out.println();

// Sort the array in descending order (simple bubble sort)
for (int i = 0; i < data.length - 1; i++) {
    for (int j = 0; j < data.length - 1 - i; j++) {
        if (data[j] <data[j + 1]) {
            // Swap array[j] and array[j + 1]
            int temp = data[j];
            data[j] = data[j + 1];
            data[j + 1] = temp;
        }
    }
}

// Print the sorted array in descending order
System.out.print("Descending Order: ");
for (int i = 0; i < data.length; i++) {
    System.out.print(data[i] + " ");
}
System.out.println();
}
}
    