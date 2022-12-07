package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã ÀÇ ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦
		// / ±âÁØÀ¸·Î Àß¶ó¼­ È«·Ã¸¸ Ãâ·ÂÇÏ½Ã¿À
		String query = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		String [] words = query.split("/");
		StringTokenizer st = new StringTokenizer(query,"/");
		while (st.hasMoreTokens()) {
			if(st.nextToken().contentEquals("È«·Ã")) 
			System.out.println("È«·Ã");
			//System.out.println(st.nextToken());
			//ÀÌ·¸°Ô ÇÏ¸é È«·Ã ´ÙÀ½ ÄáÁã°¡ Ãâ·ÂµÊ
		}
	}

}
