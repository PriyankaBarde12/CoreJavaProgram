package com.progstring;

public class CountVowelConsonant
{
	public static void main(String[] args)
	{
		int vowelCount =0 , contCount = 0 , wcount =0 ,digCount =0;
		String str = " Java is object6 oriented34 programming lang";           
	      //  str = str.toLowerCase();    
	      for(int i = 0 ;i<str.length() ;i++)
	      {
	    	  if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) =='o' || str.charAt(i) == 'u')
	    	  {
	    		  vowelCount ++;
	    	  }
	    	  else if(str.charAt(i) == ' ')
	    	  {
	    		  wcount ++;
	    	  }
	    	  else if( str.charAt(i) >= '0' && str.charAt(i)<='9' )
	    	  {
	    		  digCount ++;
	    	 }
	    	
	    	  else
	    	  {
	    		  contCount++;
	    	  }
	      }
	                // else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
            
	              
	        System.out.println("Number of vowels : " + vowelCount);    
	        System.out.println("Number of consonants : " + contCount);  
	        System.out.println("count white space : " + wcount);
	        System.out.println("Number of digits : " + digCount);
		/*StringBuffer br = new StringBuffer(10); 
		String input = br.readline();
		int n = Integer.parseInt(input);
		input = "";
		for(int i=0 ; i<n ;i++)
		{
			i=(i*2)+1;
			input+=i+"";
		}
		System.out.print(input +" ");*/
	       
	}

}
