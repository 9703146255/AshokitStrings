package com.thiru.string;

/*
 * 
 * [o, p, e, n, , e, x, ]
 * O P E N 1 E X 2
 */

public class No06CharacterWithOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
//		   String input = "hellohiil";
//		   input=input.toLowerCase();
//	        char targetChar = 'l';
//	        
//	        int count = 1;
//	        StringBuilder result = new StringBuilder();
//	        
//	        for (char c : input.toCharArray()) {
//	            if (c == targetChar) {
//	                result.append(count);
//	                count++;
//	            } else {
//	                result.append(c);
//	            }
//	        }
//	        
//	        System.out.println(result.toString());
		
		
		
		

		
//		String inputText="helloHILL";
//		int count1=1;
//		inputText=inputText.toLowerCase();
//		char targChar='l';
//		
//		StringBuilder sbr=new StringBuilder();
//		
//		for(char res : inputText.toCharArray())
//		{
//			if(res == targChar )
//			{
//				sbr.append(count1);
//				count1++;
//			}
//			else
//			{
//				sbr.append(res);
//			}
//		}
//		
//		System.out.println(sbr.toString());
		
		
		
		
//		String name="thiruthithi";
//		StringBuilder sbr=new StringBuilder();
//	    char targetChar='t';
//	    int count=1;
//		for(char name1:name.toCharArray())
//		{
//			if(name1 == targetChar)
//			{
//				sbr.append(count);
//				count++;
//			}
//			else
//			{
//				sbr.append(name1);
//			}
//		}
//		System.out.println(sbr);
		
		
		
		
		
		
		String name="vikramarkavikramarkavikramarkavikramarka";
		char tarChar='k';
		int count=1;
		StringBuffer sbfr=new StringBuffer();
		
		for (Character ch : name.toCharArray())
		{
			if(tarChar == ch)
			{
				sbfr.append(count);
				
				count++;
			}
			else
			{
				sbfr.append(ch);
			}
			
			
		}
		
		System.out.println(sbfr);
		
		
		
		
		
		
		
		
		
		
		
	    }
	

	}


