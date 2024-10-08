public class PracticeFarwordReverse {
    
    public static void farword(int []arr,int index) {
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        farword(arr,index+1);
    }


    public static void reverse(int []arr,int index) {
        if(index==arr.length){
            return;
        }
        reverse(arr,index+1);
        System.out.print(arr[index]+" ");
        
    }

    public static void main(String[]args){
int []arr={3,6,1,90,12,45};

System.out.println("Farword:");
farword(arr,0);
System.out.println();

System.out.println("Farword:");
reverse(arr,0);
    }
}





