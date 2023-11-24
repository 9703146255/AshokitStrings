package com.thiru.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class No07UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String name="Madam";
//		name=name.toLowerCase();
//		char[] x=name.toCharArray();
//		int len=name.length();
//		for(int i=0;i<len;i++)
//		{
//			boolean unique=true;
//			
//			for(int j=0;j<len;j++)
//			{
//				if( i != j &&  x[i] == x[j])
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
		
//		String name="madam";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		int i=0;
//		Map<Character,Integer> map=new HashMap<>();
//		while(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				map.put(x[i], newVal);
//			}
//			i++;
//		}
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		for(Map.Entry<Character, Integer> st:set)
//		{
//			if(st.getValue()>0)
//			{
//				System.out.println("Doesn't contains all the unique characters in a given string");
//				System.exit(0);
//			}
//		}
		
		

		
		
//		

		
		
		
//		String name="applea";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		int i=0;
//		Map<Character,Integer> map=new LinkedHashMap<>();
//		while(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				map.put(x[i], newVal);
//			}
//			i++;
//		}
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		for(Map.Entry<Character, Integer> st:set)
//		{
//			if(st.getValue()==1)
//			{
//			System.out.println(st.getKey());
//			break;
//			}
//				
//		}
		
		
		
		
		
		String name="appleappppp";
		char[] x=name.toCharArray();
		int len=name.length();
		int i=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		while(i != len)
		{
			if(map.containsKey(x[i])==false)
			{
				map.put(x[i], 1);
			}
			else
			{
				int oldVal=map.get(x[i]);
				int newVal=oldVal+1;
				map.put(x[i], newVal);
			}
			i++;
		}
		
		int maxVal=0;
		char maxKey=' ';
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer> st:set)
		{
			if(maxVal<st.getValue())
			{
				maxKey=st.getKey();
				maxVal=st.getValue();
			}
				
		}
		
		System.out.println(maxKey+"   :   "+maxVal);

	}

}
