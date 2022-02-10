
import java.util.Scanner;

public class FindTheMaxNumber {
  
    public static void main(String[] args){
        
        int number, number2, number3, max = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number 1: ");     number = scanner.nextInt();
        System.out.print("Number 2: ");     number2 = scanner.nextInt();
        System.out.print("Number 3: ");     number3 = scanner.nextInt();
     
        if(number >= number2 && number >= number3)
        {
            max = number;
        }
        else if(number2 >= number && number2 >= number3)
        {
            max = number2;
        }
        else
        {
            max = number3;
        }
        
        System.out.println("Max number: " + max);
        
    }
  
}
