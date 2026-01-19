//print first and last column of an array
class FlColSum
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(col==0||col==arr[0].length)
				sum+=arr[row][col];
		}
		}
		System.out.println("the sum of first and last col is:"+sum);
	}
}