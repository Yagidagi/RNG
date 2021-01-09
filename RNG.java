public class RNG
{
	
	public static void main(String args[])
	{
	
		
		int[] arr = {720555190, 133143292, 350469176, 715002068, 822810950, 400865843, 226553034, 200183345};
		find(arr);


	}
	
	int a=5, b=5, m=8, state=0;
    
	public RNG(int seed) {
		state = seed;
	}

	public RNG() {}

	public RNG (int x, int y, int z, int seed)
	{
		a=x;
		b=y;
		m=z;
		state = seed;
	}

	public void setA(int num)
	{
		a=num;
	}

	public  void setB(int num)
	{
		b=num;
	}
	
	public void setM(int num)
	{
		m=num;
	}

	public int getA()
	{
		return a;
	}

	public  int getB()
	{
		return b;
	}

	public  int getM()
	{
		return m;
	}

	public int nextInt()
	{
		state = (state*a+b)%m;
		return state;
	}

	public static void find(int[] arr)
	{
		int x = findM(arr);
		int y = findA(arr);
		int z = findB(arr);
		System.out.println("Modulus: " + x);
		System.out.println("Multiplier: " + y);
		System.out.println("Increment: " + z);
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