package com.thiru.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.LinkedList;
import java.util.Set;


/*
 string builder is same here
 
 1)by using lambda expressions
 2)by using for loop and charAt() ,indexOf() and append() methods
 3)check unique or not boolean
 */
public class No02RemoveDuplicateElementsInAstring {
	
	
	public static void main(String[] args) {
//		 String str="programming";
//		
////		//approach-1
////         StringBuilder sbr1=new StringBuilder();
////         str.chars().distinct().forEach(s->sbr1.append((char)s));
////         System.out.println(sbr1);
//		
//		
//		
////		//approach-2
////		System.out.println("//approach-2");
////		StringBuilder sb2=new StringBuilder();
////		for(int i=0;i<str.length();i++)
////		{
////			char ch=str.charAt(i);   //p,r,o,g,r,a,m,m,i,n,g
////			int idx=str.indexOf(ch, i+1); //p[0]==>r,o,g,r,a,m,m,i,n,g[it will check all char] not presnt return -1
////			if(idx == -1)
////			{
////				sb2.append(ch);
////			}
////		}
////		System.out.println(sb2);
//		
//		
//	
//		
//		
//		//approach-3
//		String str="hellohellohello";
//		System.out.println("/approach-3");
//		char[] arr=str.toCharArray();
//		StringBuilder sb3=new StringBuilder();
//		for(int i=0;i<str.length();i++)
//		{
//			boolean repeated=false;
//			 for(int j=i+1;j<str.length();j++)
//			 {
//				 if(arr[i]==arr[j])
//				 {
//					 repeated=true;
//					 break;
//				 }
//				 
//			 }
//			 if(!repeated)
//			 {
//				 sb3.append(arr[i]);
//			 }
//		}
//		System.out.println(sb3);
//
//		
//		
		//approach-4
//		System.out.println("//approach-4");
//		StringBuilder sb4=new StringBuilder();
//		Set<Character> set=new LinkedHashSet<>();
//		for(int i=0;i<str.length();i++)
//		{
//			set.add(str.charAt(i));
//		}
//		for(Character c:set)
//		{
//			sb4.append(c);
//		}
//		System.out.println(sb4);
		
		

		
//		//approach-1
//		
//		String name="hellohellohellohello";
//		StringBuilder sbr=new StringBuilder();
//		name.chars().distinct().forEach(s->sbr.append((char)s));
//      System.out.println(sbr);
//		
    //approach-2[print unique number of character
      
      
//      String name="hiiiii";
//      char[] x=name.toCharArray();
//      StringBuffer sbr=new StringBuffer();
//      
//      for (int i = 0; i < name.length(); i++) 
//      {
//    	  boolean unique=true;
//    	  
//    	  for (int j = i+1; j < name.length(); j++) 
//    	  {
//    		 if(x[i] == x[j])
//    		 {
//    			 unique=false;
//    		 }
//		  }
//    	  
//    	  if(unique)
//    	  {
//    		 System.out.println(x[i]);
//    	  }
//		
//	}
      
      //approach-3[print unique number of character
		
//      String name="hiiiii";
//      StringBuffer sbfr=new StringBuffer();
//     
//      
//      
//      for (int i = 0; i < name.length(); i++) 
//      {
//    	  char ch = name.charAt(i);
//    	  int indx=name.indexOf(ch, i+1);
//    	  
//    	  if(indx == -1)
//    	  {
//    		  sbfr.append(ch);
//    	  }
//    			  
//      }
//      System.out.println(sbfr);
		
		
		
//	    String x="hiiiihiiho";
//	   
//	    
//	    StringBuffer sbfr=new StringBuffer();
//	    Set<Character> set=new HashSet<>(); 
//	    
//	    for (int i = 0; i < x.length(); i++) 
//	    {
//	    	set.add(x.charAt(i));
//	    }
//	    
//	   for(Character ch:set)
//	   {
//		   sbfr.append(ch);
//	   }
//	   
//	   System.out.println(sbfr);
	    
	    
	    
	    
      
      
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
