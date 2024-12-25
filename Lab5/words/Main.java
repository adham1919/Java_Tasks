package words;
import words.word_dictionary.WordDict;
import java.util.Scanner;
import words.exceptions.*;
public class Main {
  public static void main(String args[ ])
{
 
          	WordDict wd = new WordDict();
	        boolean cont = true;
	        Scanner scanner = new Scanner(System.in);			
	  while (cont) {
            try {
                System.out.println("1- add Word");
				System.out.println("2- display Dictionary");
                System.out.println("3- display letter words");
				System.out.println("4- remove Word");
                System.out.println("5- exit");
				System.out.print("enter the option: ");
                String c = scanner.next();
                if (c.equals("1")) {
                    System.out.print("please enter the word: ");
					String word = scanner.next();
					wd.addWord(word);
                } else if (c.equals("2")) {
                    System.out.println(wd.getDict());
                }
                else if (c.equals("3")) {
                    System.out.print("please enter a character: ");
					String letterInput = scanner.next();
					if(letterInput.length()!=1)
						 System.out.print("you havent entered a letter\n");
					else {
					char c2 = letterInput.charAt(0);
					 System.out.println(wd.getLetterDict(c2)); 
					}
                } 
                else if (c.equals("4")) {
                    System.out.print("please enter the word: ");
					String word = scanner.next();
					 wd.removeWord(word);
                } 				
				else if (c.equals("5")) {
					  cont = false; 
                } else {
					 System.out.print("Wrong input\n");
                } 
            }  
			 catch(WordNotFoundException e)
         {
	    System.out.println(e.getMessage());
         }
      catch(CharNotFoundException e)
      {
	   System.out.println(e.getMessage());
       }
    catch(NotProperWordException e)
      {
	   System.out.println(e.getMessage());
      }
       catch(Exception e)
      {
	   System.out.println("Unexpected error occured\n");
      } 
	  
	  finally {
	   System.out.println("\n=****************************=\n");
      }
        }
        scanner.close(); 
    }

   



} 


/*
   WordDict wd = new WordDict();
   wd.addWord("Ahmed");
   wd.addWord("Adham");
   wd.addWord("Anwar");
   wd.addWord("Omar");
   wd.addWord("Omnia");
  // wd.addWord("H7ny");
   wd.addWord("Iman");
   wd.addWord("Ranny"); 
   wd.addWord("Adham");
   
   System.out.println(wd.getDict()); 
   System.out.println(wd.getLetterDict('o')); 
   wd.removeWord("hany");
   



*/