package java013_api;

/*
 * 	java.lang.String : immutable(불변)
 * 	java.lang.StringBuffer : mutable(가변), 동기화
 *		java.lang.StringBuilder : mutable(가변), 비동기화
 */

public class Java129_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp");
		System.out.println("ss: " + ss);
		System.out.println("sg: " + sg);
		System.out.println(ss==ss);
		System.out.println(sg.toString());

		
		StringBuffer sb = new StringBuffer("Spring test");
		StringBuffer su = sb.replace(0,6,"framework");
		System.out.println("sb: "+sb);
		System.out.println("su: " +su);
		System.out.println(sb==su);
		System.out.println(sb.equals(su));
		System.out.println(sb.toString());
	}

}
