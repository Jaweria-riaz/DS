public class Exercise2 {
    public void noDup(int[][]array2d,int[]array1d){
int index=0;

for(int i=0;i<array2d.length;i++){
    for(int j=0;j<array2d[i].length;j++){
int currentvalue=array2d[i][j];
boolean isDuplicate =false;

for(int k=0;k<index;k++){
    if(array1d[k]==currentvalue){
        isDuplicate =true;
        break;

    }
}
if(! isDuplicate){
    array1d[index]=currentvalue;
    index ++;
}
    }
}
    }
    public static void main (String []args){

    }
}
