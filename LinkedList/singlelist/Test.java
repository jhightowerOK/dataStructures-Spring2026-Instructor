package singlelist;
public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert("One");
		list.insert("Two");
		list.insert("Three");
		list.insert("Four");
		list.insert("Five");
		
		list.show();
		
		list.saveToFile("list1.dat");
		

	}

}
