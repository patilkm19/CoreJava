
public class StringBufferDemo {

	public static void main(String[] args) {
// String buffer introduced in 1.2 
//		String Buffer is mutable
//		
		StringBuffer buffer = new StringBuffer();
		buffer.append(false);
		buffer.append('a');
		buffer.append(3333d);
		System.out.println(buffer);
		System.out.println(buffer.toString());
		System.out.println(buffer.reverse());
		System.out.println(buffer.delete(0, 2));
	}

}
