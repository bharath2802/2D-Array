//print min and max element of an array
class MinMaxEle
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int min=arr[0][0];
		int max=arr[0][0];
		for(int row=0;row<arr.length;row++)
		{
		for(int col=0;col<arr[0].length;col++)
		{
			if(arr[row][col]<min)
				min=arr[row][col];
			if(arr[row][col]>max)
				max=arr[row][col];
		}
		}
		System.out.println("the minimum value is:"+min);
		System.out.println("the maximum value is:"+max);
	}
}