
public class NumbersDivisibleByFive {
    
    public static boolean control(int number)
    {
        if(number%5 != 0)
        {
            System.out.println(number + " is not divisible by 5.");
            return false;
        }
        else
        {
            System.out.println(number + " is divisible by 5.");
            return true;
        }
    }
    public static void main(String[] args) {
       
        int number = 10, number2 = 33;
      
        control(number);
        control(number);
       
    }
    
}
