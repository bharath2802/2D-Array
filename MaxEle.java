//print Max element of an array
class MaxEle
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int max=arr[0][0];
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(arr[row][col]>max)
				max=arr[row][col];
		}
		}
		System.out.println("the max element in an array is:"+max);
	}
}