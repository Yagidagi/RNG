import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader
{


	public static String read(String name)
	{
		String result = "";
		try
		{
			File file = new File (name);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) 
			{
      				result += scanner.nextLine();
				if (scanner.hasNextLine())
				{
					result += "\n";
				}

			}	
		scanner.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return result;
	}
}