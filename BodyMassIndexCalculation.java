
import java.util.Scanner;

public class BodyMassIndexCalculation {
  
    public static void main(String[] args)
    {
        double bmi, height;
        int weight;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Height: ");    height = scanner.nextDouble();
        System.out.println("Weight: ");     weight = scanner.nextInt();
        
        bmi = weight / (height*height);
        
        System.out.println("Body Mass Index: " + bmi);
    
        if(bmi < 18.5)
        {
            System.out.println("You are underweight, you should gain weight.");
        }
        else if(bmi > 18.5 && bmi < 25)
        {
            System.out.println("Normal, your weight is ok.");
        }
        else if(bmi > 25 && bmi < 35)
        {
            System.out.println("You are overweight, you should lose weight.");
        }
        else if(bmi > 30)
        {
            System.out.println("Unfortunately, you are obese.");
        }
    }
}
