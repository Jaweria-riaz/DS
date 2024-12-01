import java.util.Stack;

public class InfixToPostfix {

    
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    
    public static String infixToPostfix(String expression) {
       
        Stack<Character> stack = new Stack<>();
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            
            else if (c == '(') {
                stack.push(c);
            }
            
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); 
            }
           
            else if (isOperator(c)) {
         
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                
                stack.push(c);
            }
        }

       
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A + B * C + D";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Postfix expression: " + postfixExpression);
    }
}
