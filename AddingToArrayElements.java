
public class AddingToArrayElements {

    public static void Add(int array[])
    {
        for(int i=0 ; i<4 ; i++)
        {
            array[i] += i+5;
        }
        
        for(int j=0 ; j<4 ; j++)
        {
            System.out.println(array[j]);
        }
    }
    
    public static void main(String[] args) {
     
        int array[] = {2,4,5,9};
   
        Add(array);    
    }
}
