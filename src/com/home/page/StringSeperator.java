package com.home.page;

public class StringSeperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "aaaaddddfffrrrraayhjasfasd$$$$dfgfdsgdsgffasdw";
		data.length();
		String empty;
		//System.out.println(data.charAt(36));
		int count = 0;
	System.out.println(	data.length());
		for (int i = 0; i <= data.length() - 1; i++) {

			// System.out.print(data.charAt(i));

			if (i < data.length() - 1) {

				if (data.charAt(i) == data.charAt(i + 1)) {
					count++;
				}
				if (data.charAt(i) != data.charAt(i + 1)) {
					count++;
					// data=data.substring(i+1);
					// System.out.println(data);
					System.out.print(data.charAt(i) + "" + count+"\n");
					count = 0;
				}
			}
			if(i==data.length()-1) {
				if(data.charAt(i)!=data.charAt(i-1)) {
					count++;
					System.out.println(data.charAt(i) + "" + count);
					
				}
			}
		}

	}

}
