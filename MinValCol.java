//minimum value of each column of an array
class MinValCol
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int col=0;col<arr[0].length;col++)
		{
			int min=arr[0][col];
		for(int row=0;row<arr.length;row++)
		{
			if(arr[row][col]<min)
				min=arr[row][col];
		}
		System.out.print(col+" the minimum val is:"+min);
		System.out.println();
		}
	}
}