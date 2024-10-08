public class StackArray {
    int[]a=new int[5];

    public  int tos=-1;

    public void push(int x){
        if (tos==a.length){
System.out.println("Stack is full");
        }
        else{
            a[++tos]=x;
        }

    }

    public int pop(){
if(tos==-1){
    System.out.println("Stack is empty");
    return -1;
}
else{
    return  a[tos--];
     

}
}

public static void main(String[]args){
    StackArray stack=new StackArray();
    for(int i=0;i<5;i++){
        stack.push(i);
    }
   
    for(int i=0;i<5;i++){
       System.out.print(" "+stack.pop());
    }
    
}
}
