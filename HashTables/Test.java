
public class Test {

	public static void main(String[] args) {
		HashTable table = new HashTable(10);
		
		table.put("Ed", "Hightower");
		table.put("Joe", "Smith");
		table.put("William", "Jones");
		table.put("Fred", "Wilson");
		table.put("Jason", "Taylor");
		
		table.displayTable();
	}

}
