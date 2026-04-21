package arrays;

public class Frame {
	int frameID;
	String str;
	
	public Frame(int id, String str) {
		this.frameID=id;
		this.str=str;
	}
	
	public String toString() {
		return "[" + this.frameID + "]: " + this.str; 
	}
}
