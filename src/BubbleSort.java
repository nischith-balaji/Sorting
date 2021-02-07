
public class BubbleSort {
	
	void bubSort(int a[])
	{
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	void printarr(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs=new BubbleSort();
		int arr[]= {4,7,2,10,5,8,3,1};
		System.out.println("Array before Sorting:");
		bs.printarr(arr);
		bs.bubSort(arr);
		System.out.println("\nArray after Sorting:");
		bs.printarr(arr);
		
		
	}

}
