package singlelist;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LinkedList implements Serializable{
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public void insert(String data) {
		Node newNode = new Node(data);
		if(this.head==null) {
			this.head=newNode;
		}else {
			newNode.next=this.head;
			this.head=newNode;
		}
	}
	
	public void show() {
		Node current = this.head;
		while(current!=null) {
			System.out.printf("------------\n");
			System.out.printf("Ref:  %s\n",current);
			System.out.printf("Data: %s\n",current.data);
			System.out.printf("Next: %s\n\n",current.next);
			current=current.next;
		}
	}
	
	public void saveToFile(String fileName) {
		try {
			FileOutputStream fileStream = new FileOutputStream(fileName);
			ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
			objStream.writeObject(this);
			objStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public LinkedList loadFromFile(String fileName) {
		LinkedList list=null;
		
		try {
			FileInputStream fileStream = new FileInputStream(fileName);
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			list = (LinkedList) objStream.readObject();
			objStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
