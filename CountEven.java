//count all even numbers in an array
class CountEven
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int count=0;
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(arr[row][col]%2==0)
				count++;
		}
		}
		
		System.out.println("count is:"+count);
	}
}