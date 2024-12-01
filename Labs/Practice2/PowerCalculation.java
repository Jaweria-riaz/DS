public class PowerCalculation {

    public static int power(int number,int power){
        if(power==0){
            return 1;
        }

        return number*power(number,power-1);
    } 
    public static void main(String[]args){
        int number = 2;
        int power = 3;
        int result = power(number, power);
        System.out.println(number + " to the power of " + power + " is: " + result);
    }
}
