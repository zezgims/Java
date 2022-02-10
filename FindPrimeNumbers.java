
public class FindPrimeNumbers {
  
    public static boolean primeControl(int number)
    {
        for(int i=2 ; i<sayi ; i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        for(int i=2 ; i<1000 ; i++)
        {
            if(primeControl(i))
            {
                System.out.println(i);
            }
        }        
    } 
}
