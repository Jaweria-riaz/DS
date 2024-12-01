package Lab6;

public class SelectionSort {
    public static void  SelectionSort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){

            int minIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }


            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main (String []args){
        int []array={34,78,10,23,5};

       SelectionSort(array);
       for (int i=0;i<array.length;i++){
        System.out.println("Sorted: "+array[i]);
       }

      
    }
}
