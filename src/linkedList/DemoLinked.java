package linkedList;

public class DemoLinked {

	//Properties
	Node head;
	int count;
	
	//Constructors
//	public DemoLinked(){
//		head =  null;
//		count = 0;
//	}
	public DemoLinked(Node newHead){
		head = newHead;
		count = 1;
	}
	//Methods
	
	//add
	public void add(int newData){
		
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	//get
	
	//size
	
	//isEmpty
	
	//remove
	
	
	public static void main(String[] args) {
		
	}
}
