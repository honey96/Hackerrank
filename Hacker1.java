//Strings: Making Anagrams

package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Hacker1 {
	public static int numberNeeded(String first, String second) {
		int count1=0;
		int count2=0;
		char ch[] = first.toCharArray();
		char ab[] =second.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ab.length;j++)
			{
				if(ch[i]==ab[j])
				{
					ab[j]='#';
					ch[i]='#';
					
				}
				else
				{
					continue;
			}
				
				}
		}
		for(int k=0;k<ch.length;k++)
		{
			if(ch[k]=='#')
			{
				count1++;
			}
			else
				k++;
		}
		for(int l=0;l<ab.length;l++)
		{
			if(ab[l]=='1')
			{
				count2++;
			}
			else
				l++;
		}
		System.out.println(count1);
		System.out.println(count2);
				int temp=(ch.length+ab.length)-(count1+count2);
				return temp;
	      
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));			
	}

}
