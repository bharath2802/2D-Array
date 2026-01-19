//create transpose image of an array
class Transpose
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][]=new int[3][3];
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			arr1[row][col]=arr[col][row];
		System.out.print(arr1[row][col]+" ");
		}
		System.out.println();
		}
	}
}