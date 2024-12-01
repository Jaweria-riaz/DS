package Lab8;

public class  DecimalToBinary {
    public static String DecimalToBinary(int num){
        if(num==0){
            return "0";
        }
        if (num==1){
            return "1";
        }

        return DecimalToBinary( num/2)+(num%2);
    }

    public static void main(String[]args){
        int number=13;
        String binary=DecimalToBinary(number);
        System.out.println("Binary of "+number+" is "+binary);
    }
}
