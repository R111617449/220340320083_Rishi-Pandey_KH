// reverse the linked list

class ReverseLL {
	static Node head;
	  static class Node{
		  Node prev;
		  int data;
		  Node next;
		  
		  Node(int d ){
		  Node prev = null;
			  data = d;
              next = null;
			  
		}
		  
		  
		  
	  }
	  
	 Node reverse(Node node)
	 {
		 Node prev = null;
		 Node n = node;
		 Node next = null;
	 while(n !=null){
		  
		  next = n.next;
		  n.next = prev;
		  prev = n;
		  n = next;
		  
		 
		 
	 } 
	   node = prev;
	   return node;
		 
	 }	 
	
	void printList(Node node){
		
		while(node != null){
			
			System.out.println(node.data+ "   ");
			node = node.next;
		} 
		
	}
	public static void main(String... args){
		ReverseLL re = new ReverseLL();
		re.head = new Node(1);
		re.head.next = new Node(5);
		re.head.next.next = new Node(3);
		re.head.next.next.next = new Node(2);
		System.out.println( " Before  ");
		re.printList(head);
		
		
		System.out.println( " After  ");
		head = re.reverse(head);
		re.printList(head);
		
		
		
	} 
}