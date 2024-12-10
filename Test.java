import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
{
		Scanner s = new Scanner(
			
		
		
		System.in);
		//System.out.println("Enter an integer to build an array from:");
		int num = s.nextInt();
		int nums[] = new int[getSize(num)];
		//System.out.println(nums.length);
		makeArray(num, nums);
		outputArray(nums);
	}
	public static int getSize(int n)
	{
        int x =0;
		while(n!=0){
            n/=10;
            x++;
        }
        return x;
	}
	public static void makeArray(int n, int[] nums)
	{
        int x = nums.length;
		for(int i=0;i<nums.length;i++){
            nums[x-1]=n%10;
            n=n/10;
            x=x-1;
        }
			
	}
	public static void outputArray(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}
}