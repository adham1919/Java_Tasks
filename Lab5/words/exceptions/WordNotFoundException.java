package words.exceptions;
import java.lang.Exception;
public class WordNotFoundException extends Exception {
		
		public WordNotFoundException()
		{
			super("Word Not in the Dictionary");
		}		
	}