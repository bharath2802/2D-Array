//swap first column with last column
class FcolWithLcol
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int col1=0;
		int col2=arr.length-1;
		for(int row=0;row<arr.length;row++)
		{
			int temp=arr[row][col1];
			arr[row][col1]=arr[row][col2];
			arr[row][col2]=temp;
		}
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
		}
	}
}