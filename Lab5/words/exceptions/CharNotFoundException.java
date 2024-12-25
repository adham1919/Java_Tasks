package words.exceptions;
import java.lang.Exception;
public class CharNotFoundException extends Exception {
		
		public CharNotFoundException()
		{
			super("Char Not in the Dictionary");
		}		
	}