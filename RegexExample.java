package pack.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample 
{
	//Three way to represent pattern & matcher
	//1st way
	public static void main(String[] args) {
		Pattern p=Pattern.compile(".a"); //single dot represents single character
		//compile regular expression into pattern
		Matcher m=p.matcher("ma"); //.a dot. represent single char m 
		boolean b=m.matches(); //output for b //true
		
		//2nd way
		boolean bb=Pattern.compile("..m").matcher("aam").matches();
		
		//3rd way
		boolean b1=Pattern.matches(".a","sa"); //true
		System.out.println(b+" "+bb+" "+b1);
	}
}
