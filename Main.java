import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		RNG gen = new RNG();
		Calendar calendar = Calendar.getInstance();

		if (args[0].equalsIgnoreCase("show"))
		{
			PeriodFinder a = new PeriodFinder();
			a.show(args[1]);
		}

		if (args[0].equalsIgnoreCase("break"))
		{
			String[] strarr = args[1].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
			int[] arr = new int[strarr.length];
			for (int i=0; i< arr.length; i++)
			{
				arr[i] = Integer.parseInt(strarr[i]);
			}

			RNG.find(arr);
		}

		if (args[0].equalsIgnoreCase("int"))
		{
			System.out.println(gen.nextInt(Math.abs((int)calendar.getTimeInMillis()%gen.getM())));
		}
	}
}