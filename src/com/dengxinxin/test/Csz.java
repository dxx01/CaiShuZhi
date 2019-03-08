package com.dengxinxin.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
* 
* 
* @author 邓鑫鑫
* @version 创建时间：2019年3月8日 下午8:17:27
* 类说明
*/
@SuppressWarnings("unused")
public class Csz {


	public static void main(String[] args) {
	//	new sanbai().run();
		
		System.out.println(new Csz().run1("adsdsv"));
		System.out.println(new Csz().fun("adsdsv"));
		
		Map<Character, Integer> map = new Csz().fun("adsdsv");
		for(Character c:map.keySet()){
			System.out.println(c+":"+map.get(c));
		}
		for(Entry<Character, Integer> ent : map.entrySet()){
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
	}
		//1234组成的三位数不重复数字
		public void run(){
			int ge = 0;int shi = 0;int bai = 0;int num=0;
			for(int i = 123;i<=432;i++){
				ge=i%10;
				shi=i/10%10;
				bai=i/100;
				if(ge<=4&shi<=4&bai<=4&ge>=1&shi>=1&bai>=1){
					if(ge!=shi&ge!=bai&shi!=bai){
						System.out.println(i);
						num++;
					}
				}
			}
			System.out.println("个数："+num);
		}
		
		//输入一串字符，自动输出第二次出现的字符
		public char run1(String str){
			char str1 = 0;
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i = 0; i < str.length(); i++){
				str1=str.charAt(i);
				if(str.indexOf(str1)!=str.lastIndexOf(str1)){
					return str1;
				}
			}
			return str1;
		}
		
		public Map<Character, Integer> fun(String string){
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(null == map.get(c))map.put(c, 1);
			else {
			int length = map.get(c)+1;
			map.put(c, length);
			}
			}
			return map;
			}
	

}
