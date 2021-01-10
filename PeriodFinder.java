import java.util.*;

class PeriodFinder
{


	public static void show(String str) 
	{
		RNG gen= new RNG();
		gen.setM(Integer.parseInt(str));

		for (int i=0;i<gen.getM();i++)
		{
			gen.setA(i);
			for (int j=0;j<gen.getM();j++)
			{
				gen.setB(j);
				int result = 0;
				for (int k = 0; k < gen.getM(); k++) 
				{
					int temp = gen.nextInt();
					System.out.print(temp + ",");
					result += temp;
        				}
				System.out.print("   Sum: " + result + "   A: " + gen.getA()+ "   B: " +gen.getB());
				System.out.println();
			}
		}
	}

	public static void showUnique(String str) 
	{
		RNG gen= new RNG();
		gen.setM(Integer.parseInt(str));
		ArrayList arr = new ArrayList();


		for (int i=0;i<gen.getM();i++)
		{
			gen.setA(i);
			for (int j=0;j<gen.getM();j++)
			{
				gen.setB(j);
				int result = 0;
				arr = new ArrayList();
				for (int k = 0; k < gen.getM(); k++) 
				{
					int temp = gen.nextInt();
					if (unique(arr, temp))
						arr.add(temp);
        				}
				if(arr.size()==gen.getM())
				{
					String line = "";
					for(int x=0; x<arr.size();x++)
					{
						System.out.print(arr.get(x)+",");
					}
					System.out.print("   Sum: " + result + "   A: " + gen.getA()+ "   B: " +gen.getB());
					System.out.println();
				}
			}
		}
	}

	public static boolean unique(ArrayList arr, int num)
	{
		boolean result = true;

		for (int i=0;i<arr.size();i++)
		{
			if (num == (int) arr.get(i))
				return false;
		}

		return result;
	}
}












