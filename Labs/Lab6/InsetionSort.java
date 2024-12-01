package Lab6;

public class InsetionSort {
    public static void InsertionSort(int[]array){
        for(int i=0;i<array.length;i++){
            int key =array[i];
            int j=i-1;
while(j>=0   &&  array[j]>key){
    array[j+1]=array[j];
    j=j-1;
}
array[j+1]=key;
        }
    }


    public static void main(String[]args){
        int []array={2,9,6,4,8};
        InsertionSort(array);

        for(int i=0;i<array.length;i++){
       

            System.out.print(array[i]+" ");
        }
    }
}
