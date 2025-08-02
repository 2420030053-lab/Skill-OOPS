package codes;

public class Stringbuffer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Java");

		sb.append(" Programming");
		System.out.println("After append: " + sb);

		sb.insert(5, "Language ");
		System.out.println("After insert: " + sb);

		sb.delete(5, 14);
		System.out.println("After delete: " + sb);

		sb.reverse();
		System.out.println("After reverse: " + sb);

		sb.replace(0, 4, "avaJ");
		System.out.println("After replace: " + sb);

		System.out.println("Current capacity: " + sb.capacity());
	}
}
