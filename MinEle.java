//print Minimum element of an array
class MinEle
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int min=arr[0][0];
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(arr[row][col]<min)
				min=arr[row][col];
		}
		}
		System.out.println("the minimum element of an array is:"+min);
	}
}