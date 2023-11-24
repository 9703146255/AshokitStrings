package com.thiru.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 Count number of characters in a given string
 */
public class No04CountNoOfCharInAString {

	public static void main(String[] args) {
		
		
//		String name="thirumalesh";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		Map<Character,Integer> map=new HashMap<>();
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
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				
//				map.put(x[i], newVal);
//			}
//			
//			
//			i++;
//		}
//		
//		Set<Map.Entry<Character,Integer>> set=map.entrySet();
//		for(Map.Entry<Character,Integer> st:set)
//		{
//			System.out.println(st);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String name="thiruamlesh";
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
//		
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		for(Map.Entry<Character, Integer> st:set)
//		{
//			System.out.println(st.getKey()+">>>>>"+st.getValue());
//		}
//

		
		String name="Apple how Ar EYoU";
		name.toLowerCase();
		name.replace("", " ");
		char[] x=name.toCharArray();
		int i=0;
		int len=name.length();
		
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		while(i != len)
		{
			if(map.containsKey(x[i]) == false)
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
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		
		for(Entry<Character, Integer> s1:set)
		{
			if(s1.getValue()==1)
			{
				System.out.println(s1.getKey()+">>>>>>>>>>>>>>"+s1.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
