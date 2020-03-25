package com.epam.app;

public class Remove_A {
	public static String remove(String string) {
		// TODO Auto-generated method stub
		if(string.length()>0) {
			String str = string;
			String r_st = "";
			if(str.charAt(0)=='A') {
				r_st = str.replaceFirst("A","");
				if(r_st.charAt(0)=='A') {
					 r_st = r_st.replaceFirst("A","");
				}
			}
			else if(str.charAt(1)=='A') {
				r_st = str.replaceFirst("A","");
			}
			if(r_st.length()>0) {
				return r_st;
			}
			return str;
		}
		else {
			return "";
		}
	}
}
