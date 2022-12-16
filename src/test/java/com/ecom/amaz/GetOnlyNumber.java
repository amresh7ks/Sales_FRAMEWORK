package com.ecom.amaz;

public class GetOnlyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Str= {"$ 3,234","$  1,334","$4,034" };
		int copy=Integer.MAX_VALUE;
		for(int j=0;j<Str.length;j++) {
			String s=Str[j];
			String Num="";
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					Num=Num+s.charAt(i);
				}

			}
			if(copy>Integer.parseInt(Num)) {
				copy=Integer.parseInt(Num);
			}
		}
		System.out.println(copy);
	}

}


