
import java.util.Scanner;

public class FactorialCalculation {
    
    public static void main(String[] args) {
      
        int number, result = 1;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");      number = scanner.nextInt();
        
        for(int i=number ; i>0 ; i--)
        {
            result *= i;
        }
            
        System.out.println("Factorial = " + result);
    }
    
}
