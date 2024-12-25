package words.word_dictionary;
import words.stringutils.StringUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import words.exceptions.NotProperWordException;
import words.exceptions.WordNotFoundException;
import words.exceptions.CharNotFoundException;

public class WordDict{
   
   private Map<Character , List<String>> dict;
   
   public WordDict()
   {
	   dict = new HashMap<>();
	   setDict();
   }
   private void setDict()
   {
	   	for (char c = 'a'; c <= 'z'; c++) 
                dict.put(c, new ArrayList<String>());
   }
   
   private String prepareWord(String s)
   {
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase(); 
   }
   
    
    public void addWord(String s) throws NotProperWordException
   {
	   if(!StringUtils.isAlpha(s)) throw new NotProperWordException();
	   s= s.toLowerCase();
	   /*System.out.println(s);
	   Character c = s.charAt(0);
	   System.out.println(c);*/
	   String w = prepareWord(s);
	   if(!dict.get(s.charAt(0)).contains(w))
	   {
		   dict.get(s.charAt(0)).add(w); 
		   Collections.sort(dict.get(s.charAt(0)));
	   }  
   }
   
    public String getDict()
   {
	    String res = "";
		
	    for (char c = 'a'; c <= 'z'; c++) 
		{
			String letter = (""+c).toUpperCase();
			res+= letter + " : \n";
			List<String> wordList = dict.get(c);
			for (String word : wordList) 
				res+="   " + word + "\n";
			res+="--------------------\n";
		}
		return res; 
   }
   
    public String getLetterDict(char cr) throws CharNotFoundException
   {
	   	if(Character.isLetter(cr))
		{		
	   char c = Character.toLowerCase(cr);
	   if(dict.containsKey(c)){
	    String letter = (""+c).toUpperCase();
	    String res = "";
		res+= letter + " : \n";
		List<String> wordList = dict.get(c);
		for (String word : wordList) 
				res+="   " + word + "\n";
			res+="--------------------\n";
		
		return res;  } }
	   throw new CharNotFoundException();
   }
   
   
       public void removeWord(String word) throws WordNotFoundException
   {
	    char firstLetter = word.toLowerCase().charAt(0);
	    String res = "";
		List<String> wordList = dict.get(firstLetter);
		String formatedWord = prepareWord(word);
		if(!wordList.remove(formatedWord)) throw new WordNotFoundException();
		
   }


}