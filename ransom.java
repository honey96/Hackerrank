package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ransom {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int ma = in.nextInt();
	        int n = in.nextInt();
	        int count=0;
	        int count1=0;
	        String magazine[] = new String[ma];
	        for(int magazine_i=0; magazine_i < ma; magazine_i++){
	            magazine[magazine_i] = in.next();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	        }
    if(magazine.length < ransom.length)
    {
        System.out.print("No");
    }
    else
    {
	        
	        HashMap<String, Integer> hm =new HashMap<String,Integer>();
	        HashMap<String, Integer> hm1 =new HashMap<String,Integer>();
	        for (int k = 0; k < magazine.length; k++) {
	            if (!hm.containsKey(magazine[k])) {
	                hm.put(magazine[k], 1);
	            } else {
	                hm.put(magazine[k], (Integer) hm.get(magazine[k]) + 1);
	            }
	        }
	        for(Map.Entry m:hm.entrySet()){  
	        	   System.out.println(m.getKey()+" "+m.getValue());  
	        	  }  
	        System.out.println(".................................");
	       
	        for (int i = 0; i < ransom.length; i++) {
	            if (!hm1.containsKey(ransom[i])) {
	                hm1.put(ransom[i], 1);
	            } else {
	                hm1.put(ransom[i], (Integer) hm1.get(ransom[i]) + 1);
	            }
	        }
	        for(Map.Entry m1:hm1.entrySet()){  
	        	   System.out.println(m1.getKey()+" "+m1.getValue());  
	        	  }  

	       
			for(int j=0;j<n;j++)
	{
		if(hm.get(ransom[j])>=hm1.get(ransom[j]))
		{
			count++;
		}
		else
			break;			
	}
	if(count==n)
	{
		System.out.print("Yes");
	}
	else
		System.out.print("No");
		
		}
		
}

}