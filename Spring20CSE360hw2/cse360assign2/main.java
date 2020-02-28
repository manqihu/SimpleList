package cse360assign2;

public class main {

	public static void main (String[] args) {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.add(2);
		simplelist.add(3);
		simplelist.add(4);
		simplelist.add(5);
		simplelist.add(6);
		simplelist.add(7);
		simplelist.add(8);
		simplelist.add(9);
		simplelist.add(10);
		simplelist.add(11);
		simplelist.add(12);
		simplelist.add(13);
		simplelist.add(14);
		simplelist.add(15);
		simplelist.add(16);
		simplelist.add(17);
		simplelist.add(18);
		simplelist.remove(18);
		simplelist.remove(17);
//		simplelist.remove(16);
//		simplelist.remove(15);
		int count = simplelist.count();
		int size = simplelist.size();
		int first = simplelist.first();
		String str=simplelist.toString();
		int index=simplelist.search(9);
		int last = simplelist.last();
		System.out.println(str);
		System.out.println("The count of the string is " + count);
		System.out.println("The size of the string is " + size);
		System.out.println("The first element is " + first);
		System.out.println("9 is at index " + index);
		System.out.println("The last "+last);
		
		simplelist.append(18);
		simplelist.append(19);
		str=simplelist.toString();
		System.out.println(str);
		count = simplelist.count();
		size = simplelist.size();
		first = simplelist.first();
		last = simplelist.last();
		System.out.println("The count of the string is " + count);
		System.out.println("The size of the string is " + size);
		System.out.println("The first element is " + first);
		System.out.println("The last "+last);

	}
}


