/// Arrays: Left Rotation

package test;
import java.util.Arrays;
import java.util.Scanner;
public class hacker {
	public static int [] rotate(int a[] ,int n)
	{
		int i;
		int temp =a[0];
		for( i=0;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		a[i]=temp;
		return a;
		}	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
	int arr[] =new int [n];
	for(int i=1;i<=k;i++)
	{
	 arr=rotate(a,n);
	}
	for(int j=0;j<n;j++)
	{
	System.out.println(arr[j]);
	}
}
}
