package de.zerocode.util;

public class ArraysUtil {
	/**
	 * this method will gives elements present inside the object array
	 * @author sujwal b
	 * @since 2022-12-02
	 * @param inputOne
	 * @return temp
	 * @throws Exception
	 */
	public Object getAddElements(Object[] input) {
		String strResult ="";
		int  intResult =0;
		char charResult =' ';
		for (int i = 0; i < input.length; i++) {
			if (input[i] instanceof String) {
				strResult+=(String)input[i];
			}else if(input[i] instanceof Integer){
				intResult+=(int)input[i];
			}else if(input[i] instanceof Character) {
				charResult+=(char)input[i];
			}
		}
		return charResult +" "+strResult+"  "+intResult;
	}

	public static void main(String[] args) {
		ArraysUtil arraysUtil = new ArraysUtil();
		Object[] one = { 2, 3, 1, 2, "String",'a','b','f' };
		System.out.println(arraysUtil.getAddElements(one));
		
	}
}
