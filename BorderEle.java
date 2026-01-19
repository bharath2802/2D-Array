//print boarder of the elements in an array
class BorderEle
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(row==0||row==arr.length-1||col==0||col==arr[0].length-1)
			System.out.print(arr[row][col]+" ");
			else
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}