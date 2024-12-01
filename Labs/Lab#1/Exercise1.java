import java.util.Arrays;
public class Exercise1 {
    
public static void main (String args[])
{

int array[]={4,7,5,9,0,1,2,3,6,8};
System.out.println("before sorting"+Arrays.toString(array));
int i=0;

for(int j=0;j<array.length;j++){
    if(array[j]%2!=0){
    int temp=0;
    temp=array[i];
    array[i]=array[j];
    array[j]=temp;

    i++;
}
}
System.out.println("after sorting"+Arrays.toString(array));
}}