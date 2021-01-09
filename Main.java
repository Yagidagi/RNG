public class Main
{
	public static void main(String args[])
	{
		if (args[0].equals("show"))
		{
			PeriodFinder a = new PeriodFinder();
			a.show(args[1]);
		}

		if (args[0].equals("break"))
		{
			String[] strarr = args[1].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
			int[] arr = new int[strarr.length];
			for (int i=0; i< arr.length; i++)
			{
				arr[i] = Integer.parseInt(strarr[i]);
			}

			RNG.find(arr);
		}
	}
}