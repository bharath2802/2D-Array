//print sum of each row in an array
class SumEachRow
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<arr.length;row++)
		{
		int sum=0;
		for(int col=0;col<arr[0].length;col++)
		{
		sum+=arr[row][col];
		}
		System.out.println(row+" sum is :" +sum);
		}
	}
}