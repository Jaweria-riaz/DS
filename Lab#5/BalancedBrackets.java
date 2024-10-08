import java.util.Stack;

public class BalancedBrackets{

    public  boolean balancedBracket(String exp){
    Stack<Character>temp=new Stack<>();

    for(int i=0;i<exp.length();i++){
        char current=exp.charAt(i);

        if(current=='{'|| current=='['|| current=='('){
            temp.push(current);
        }

        else if(current=='}'|| current==']'|| current==')'){

            if(temp.isEmpty()){
                return false;
            }
    
            char top=temp.pop();

            if((current==')'&& top!='('  )|| (current=='}'&& top!='{')||(current==']'&& top!='[')){
                return false;
            }
        }
}
return temp.isEmpty();
}

public static void main (String []args){
    BalancedBrackets c = new BalancedBrackets();
    String expression = "({[a+b]+c}-1))"; // Test expression

    // Call the method to check for balanced brackets
    if (c.balancedBracket(expression)) {
        System.out.println("Balanced");
    } else {
        System.out.println("Not Balanced");
    }
}
}
    
