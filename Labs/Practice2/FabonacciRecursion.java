package Practice2;
public class FabonacciRecursion {
    public static int  fab(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        
            return fab(num-1)+fab(num-2);
        
    }
    public static void main (String []args){
  int n=9;
  int result=fab(n);
  System.out.println(result+" ");

    }
}
