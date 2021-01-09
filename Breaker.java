import java.util.*;

public class Breaker
{
	public static void main(String args[])
	{
		int[] arr = {6,5,0,7,2,1,4,3};

		System.out.println(findM(arr));
		System.out.println(findA(arr));
		System.out.println(findB(arr));

	}

	public static int findA(int[] arr)
	{
		int x = arr[2]-arr[3];
		int y = arr[1]-arr[2];
		int m = findM(arr);
		int a = x * modInv(y, m);
		a = ((a % m) +m)%m;
		return a;
	}

	public static int findB(int[] arr)
	{
		int m = findM(arr);
		int a = findA(arr);
		int b = arr[2]-a*arr[1];
		b = ((b % m) +m)%m;
		return b;
	}

	public static int modInv(int x, int m)
	{
		int result = 1;
		while ((result*x)%m != 1)
		{
			result++;
		}
		return result;
	}

	
	public static int[] findT(int[] arr)
	{
		int[] result = new int[arr.length-1];
		for(int i=0; i< result.length; i++)
		{
			result[i]=arr[i+1]-arr[i];
		}
		return result;
	}

	public static int[] findU(int[] arr)
	{
		int[] result = new int[arr.length-2];
		for(int i=0; i< result.length; i++)
		{
			result[i]=Math.abs(arr[i+2]*arr[i]-arr[i+1]*arr[i+1]);
		}
		return result;
	}

	public static int findM(int[] arr)
	{
		int[] Tarr = findT(arr);
		int[] Uarr = findU(Tarr);
		return findGCD(Uarr);
	}

	public static int findGCD (int a, int b)
	{
		int temp;
		if (a < b)
		{
			temp = b;
			b = a;
			a = temp;
		}
		while (b!=0)
		{
			a = a % b;

			temp = b;
			b = a;
			a = temp;
		}
		
		return a;
	}

	public static int findGCD (int[] arr)
	{
		int result = (int) arr[0];

		for (int i=0;i<arr.length;i++)
		{
			result = findGCD(result, (int) arr[i]);
		}

		return result;
	}
}