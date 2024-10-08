public class Array {
    public static void noDup(int [][] array2d, int []array1d){
        int index = 0;
for (int i=0;i<array2d.length;i++){
for(int j=0;j<array2d[i].length;j++){
    int currentValue = array2d[i][j];
                boolean isDuplicate = false;

                for (int k = 0; k < index; k++) {
                    if (array1d[k] == currentValue) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    array1d[index] = currentValue;
                    index++;
                }
}
}
    }
    public static void main (String [] args){
int [][]array2d ={{2,4,6,1,9},{10,5,3,7,12},{11,7,4,2,8},{13,40,51,69,70}};

int array1d[]=new int[20];
noDup(array2d, array1d);
for (int i = 0; i < array1d.length; i++) {
    System.out.print("1dArray"+array1d[i] + " ");
}

    }


}
