
public class BubbleSort {

	public static void main(String[] args) {
		
		int nums[] = {	99, -10, 100123, 18, -978,
						5623, 463, -9, 287, 49 };
		int temp, size = 10;
		
		System.out.print("Original array is: ");
		for(int i = 0; i < size; i++ )
		{
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i < size ; i++)
		{
			for(int j = size-1; j >= i ; j--)
			{
				if(nums[j-1] > nums[j])
				{
					temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
							
				}
			}
		}
		
		System.out.print("Sorted array is: " );
		for(int i = 0; i < size; i++ )
		{
			System.out.print(nums[i] + " ");
		}
		
	}

}
