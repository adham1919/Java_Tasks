package lambdastr.stringutils;

public class StringUtils{
	
	
	public String isBetter(String s1,String s2,CompareStringFunction c)
	{
		if(c.compare(s1,s2))
			return s1;
		return s2;
	}
	
	public static boolean isShorter(String s1,String s2)
	{
		return s1.length() <  s1.length();
	}
	
	public boolean isLonger(String s1,String s2)
	{
		return s1.length() >  s1.length();
	}
	
	
    public  boolean isAsciiValueMore(String s1,String s2)
	{
		return getTotalAsciiValue(s1) >  getTotalAsciiValue(s2);
	}
	
	public  boolean isAsciiValueLess(String s1,String s2)
	{
		return getTotalAsciiValue(s1) <  getTotalAsciiValue(s2);
	}
    public static int getTotalAsciiValue(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  
            sum += (int) c;  
        }   
        return sum;
    }
	
	
	boolean isAlpha(String s)
	{
		if(s.length()==0) return false;
		for(int i=0;i<s.length();i++)
		{ Character c = s.charAt(i);
			if(!Character.isLetter(s.charAt(i)))
				return false;
		}
		return true;
	}
	
	
	
}