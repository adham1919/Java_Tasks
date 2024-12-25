package lambdastr;
import lambdastr.stringutils.StringUtils;


public class Main
{
	  public static void main(String args[ ])
        { 
             StringUtils util = new StringUtils();
			 System.out.println("the better string: "+util.isBetter("Adham","Hany",(s1,s2) -> s1.length()>s2.length()));
			 System.out.println("the better string: "+util.isBetter("Adham","Hany",StringUtils::isShorter));
			 System.out.println("the better string: "+util.isBetter("Adham","Hany",util::isAsciiValueMore));

         }
}