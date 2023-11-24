package com.thiru.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class No05FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// 1 way without using collections

//		String name="Madam";
//		name=name.toLowerCase();
//		char[] x=name.toCharArray();
//		int len=name.length();
//		for(int i=0;i<len;i++)
//		{
//			
//			boolean unique=true;
//			
//			for(int j=0;j<len;j++)
//			{
//				
//				if((i != j)  && x[i]==x[j])
//				{
//					unique=false;
//				}
//			}
//			
//			if(unique)
//			{
//				System.out.println(x[i]);
//			}
//		}

		// 2nd way with usign collections

//	   String  name="Madam";
//	   char[] x=name.toCharArray();
//	   int len=name.length();
//	   Map<Character,Integer> map=new HashMap<>();
//	   int i=0;
//	   while(i != len)
//	   {
//		   if(map.containsKey(x[i])==false)
//		   {
//			   map.put(x[i], 1);
//		   }
//		   else
//		   {
//			   int oldVal=map.get(x[i]);
//			   int newVal=oldVal+1;
//			   map.put(x[i], newVal);
//		   }
//		   i++;
//	   }
//	    
//	 Set<Map.Entry<Character,Integer>> set=map.entrySet();
//	 for(Map.Entry<Character,Integer> st:set)
//	 {
//		 if(st.getValue()==1)
//		 {
//			 System.out.println(st.getKey()+">>>>> "+st.getValue());
//			 break;
//		 }
//	 }

		// print first non-repeated character

//		String name = "Apple";
//		name=name.toLowerCase();
//		char[] x = name.toCharArray();
//		int len = name.length();
//		//StringBuilder sbr=new StringBuilder();
//		for (int i = 0; i < x.length; i++) {
//
//			boolean unique = true;
//
//			for (int j = 0; j < x.length; j++) {
//
//				if (i != j && x[i] == x[j]) {
//					unique = false;
//				}
//
//			}
//			
//			if(unique)
//			{
//				System.out.println(x[i]);
//				System.exit(0);
//			}
//		}
		
		
		
//		String name="Madamma";
//		name=name.toLowerCase();
//		int len=name.length();
//		char[] x=name.toCharArray();
//		Map<Character,Integer> map=new LinkedHashMap<>();
//		int i=0;
//		while(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal = map.get(x[i]);
//				int newVal = oldVal+1;
//				map.put(x[i], newVal);
//			}	
//			i++;
//		}
//		
//	
//		
//	     Set<Map.Entry<Character, Integer>> set=map.entrySet();
//	     
//	     for(Map.Entry<Character, Integer> res:set)
//	     {
//	    	if(res.getValue()==3)
//	    	{
//	    		System.out.println(res.getKey()+">>>>>>>>>>>>>>>>>"+res.getValue());
//	    		System.exit(0);
//	    	}
//	     }
		
		
		
		//first non-reapeated character in a given string
		
		
//		String name="Madam";
//		name=name.toLowerCase();
//		for (int i = 0; i < name.length(); i++) 
//		{
//			boolean unique=true;
//			for (int j = 0; j < name.length(); j++) 
//			{
//				if(j != i && name.charAt(i) == name.charAt(j))
//				{
//					unique=false;
//				}
//			}
//			if(unique)
//			{
//				System.out.println(name.charAt(i));
//				System.exit(0);
//			}
//		}
		
		
//		String name="Madam";
//		name=name.toLowerCase();
//		char[] x=name.toCharArray();
//		int len=name.length();
//		
//		Map<Character,Integer> map=new LinkedHashMap<>();
//		int i=0;
//		
//		while(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				Integer oldVal = map.get(x[i]);
//				int newVal = oldVal+1;
//				map.put(x[i], newVal);
//			}
//			
//			i++;
//		}
//		
//		
//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//		for(Entry<Character, Integer> mp:entrySet)
//		{
//			if(mp.getValue()==1)
//			{
//				System.out.println(mp.getKey()+">>>>>>>>>>>>>>>>>>>>"+mp.getValue());
//				System.exit(0);
//			}
//		}
		
		
		
		
		
	
		

	}

}
