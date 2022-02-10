
import java.util.Scanner;

public class SortTheArray {

    public static void main(String[] args) {
       
        int array[]= new int[6];
        int min;
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter array elements: ");
        
        for(int i=0 ; i<6 ; i++)
        {
            array[i] = scanner.nextInt();
        }
        
        for(int j=0 ; j<6 ; j++)
        {
            min = array[0];
            
            for(int k=0 ; k<6 ; k++)
            {
                if(array[k] > array[j])
                {
                    min = array[k];
                    array[k] = array[j];
                    array[j] = min;
                }
            }
        }
        
        System.out.println("----- Sorted Array -----");
        for(int i=0 ; i<6 ; i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
