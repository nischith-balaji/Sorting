
public class SelectionSort {
	void selSort(int a[])
	{
		int n=a.length;
		for (int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if (a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	
	void printArr(int a[])
	{
		int n=a.length;
		for (int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort s=new SelectionSort();
		int arr[]= {10,3,79,45,33,56,8,11};
		System.out.println("Array before Sorting: ");
		s.printArr(arr);
		s.selSort(arr);
		System.out.println("\nArray after Sorting:");
		s.printArr(arr);
		
		
	}

}
