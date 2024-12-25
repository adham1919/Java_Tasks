package words.exceptions;
import java.lang.Exception;
public class NotProperWordException extends Exception {
		
		public NotProperWordException()
		{
			super("This is not a proper word");
		}		
	}