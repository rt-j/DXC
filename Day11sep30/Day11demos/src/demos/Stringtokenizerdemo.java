package demos;
import java.util.StringTokenizer;

public class Stringtokenizerdemo {
	public static void main(String[] args) {
		String msg="Hello:bro-:-man";
		StringTokenizer st=new StringTokenizer(msg,":");//indiactes that : should not be counted
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("-"));
		}
				
	}

}
