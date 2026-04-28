
public class HashTable implements HashInterface{
	private HashNode[] table;
	private int count;
	private int size;
	
	public HashTable(int size) {
		this.size=size;
		table = new HashNode[size];
		this.count=0;
	}

	@Override
	public void put(String key, String value) {
		HashNode node = new HashNode(key,value);
		int hashCode = hashKey(key);
		table[hashCode]=node;
		this.count++;
	}

	@Override
	public String get(String key) {
		int hashCode = hashKey(key);
		HashNode node = table[hashCode];
		if(node!=null) {
			return node.value;
		}
		return null;
	}

	@Override
	public int hashKey(String key) {
		int hashCode = key.length() % this.size;
		return hashCode;
	}
	
	public void displayTable() {
		int index;
		HashNode node;
		
		System.out.printf("Size: %d, Count: %d, Load Factor: %5.2f\n",this.size,this.count,(double) this.count/this.size);
		for(index=0;index<table.length;index++) {
			node = table[index];
			if(node!=null) {
				System.out.printf("[%d]: {key: %s, value: %s}\n", index, node.key, node.value);
			}else {
				System.out.printf("[%d]: { NULL }\n", index);
			}
		}
	}

}
