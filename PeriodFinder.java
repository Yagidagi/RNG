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
				System.out.print("   " + result + "   " + gen.getA()+ gen.getB());
				System.out.println();
			}
		}
	}
}