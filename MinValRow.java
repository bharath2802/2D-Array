//minimum value of each row in an array
class MinValRow
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<arr.length;row++)
		{
		int min=arr[row][0];
		for(int col=0;col<arr[0].length;col++)
		{
			if(arr[row][col]<min)
				min=arr[row][col];
		}
			System.out.print(row+" min value is:"+min);
			System.out.println();

		}
			
	}
}
		