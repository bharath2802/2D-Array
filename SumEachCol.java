//print sum of each column of an array
class SumEachCol
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int col=0;col<arr[0].length;col++)
		{
			int sum=0;
		for(int row=0;row<arr.length;row++)
		{
			sum+=arr[row][col];
		}
		System.out.println("the sum of " +col+ " column is:" +sum);
		}
	}
}