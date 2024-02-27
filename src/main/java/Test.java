/**
 * 
 */

/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "ABCDDD";
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointBefore(2));
		System.out.println(name.compareTo("ABC"));

		System.out.println(name.compareToIgnoreCase("abc"));
		System.out.println(name.concat("PQR"));
		System.out.println(name.contains("Z"));
		System.out.println(name.endsWith("R"));
		String dname = "ABC";
		System.out.println(name.equals(dname));
		String kname = "abc";
		System.out.println(name.equalsIgnoreCase(kname));

		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.replace("A", "Z"));
		name = name.replace("A", "Z");

		System.out.println(name);
		long l = 11888888l;
		boolean flag=false;
		System.out.println(String.valueOf(l));

		String lString=String.valueOf(l);
		String fname=String.valueOf(flag);
		System.out.println(fname.charAt(0));
		System.out.println(name.toLowerCase());
		System.out.println(fname.toUpperCase());
		
//		lString.
	}

}
