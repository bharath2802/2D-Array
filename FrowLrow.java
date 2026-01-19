//Swap first row with last row
class FrowLrow
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int row1=0;
		int row2=arr.length-1;
		for(int col=0;col<arr[0].length;col++)
		{
			int temp=arr[row1][col];
			arr[row1][col]=arr[row2][col];
			arr[row2][col]=temp;
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