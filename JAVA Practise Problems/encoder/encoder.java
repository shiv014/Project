package encoder;

public class encoder {
	
	public static void main(String args[]) {
		String str="shivendra";   // taking string as input
		char[] strarr=str.toCharArray(); // converting string to char array
		
		int len=strarr.length;
			
		StringBuffer output=new StringBuffer();
		String ascstr;
		
		//testing converting char to ascii
//		int ascii='a';
//		ascii='b';
//		System.out.print(ascii);
		
		int ascii;
		
		//iterate the char array
		
		for(int i=0;i<len;i++) {
			ascii=strarr[i]-96;
			ascstr=Integer.toString(ascii);
			output.append(ascstr);
			if(ascstr.length()==2) {
				output.append("0");
			}
			
			
		}
		
		System.out.print(output);
	}

}
