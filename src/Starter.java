
public class Starter {
	
	public static void main(String[] args) {
		
//		SortedLinkedList<Integer> sll = new SortedLinkedList<Integer>();
//		sll.insert(2);
//		System.out.println(sll.toString());
//		sll.insert(1);
//		System.out.println(sll.toString());
//		sll.insert(3);
//		System.out.println(sll.toString());
//		sll.insert(4);
//		System.out.println(sll.toString());
//		sll.insert(6);
//		System.out.println(sll.toString());
//		System.out.println(sll.get(2));
//		System.out.println(sll.getSize());
//		System.out.println(sll.printAllValues());
		
//		Stack<Integer> stacked = new Stack<Integer>();
//		stacked.push(2);
//		stacked.push(1);
//		stacked.push(10);
//		stacked.push(11);
//		System.out.println(stacked.pop()); 
//		System.out.println(stacked.top());
		
//		DoubleLinkedList<Integer> test = new DoubleLinkedList<Integer>();
//		test.insert(5, 0);
//		test.insert(2, 0);
//		test.insert(7, 0);
//		test.insert(6, 0);
//		System.out.println(test.toString());
//		test.delete(1);
//		System.out.println(test.toString());
//		System.out.println(test.getSize());
		
		Queue<Integer> q= new Queue<Integer>();
		q.push(2);
		q.push(3);
		q.push(5);
		q.push(10);
		q.push(8);
		System.out.println(q.top());
		q.pop();
		q.pop();
		System.out.println(q.toString());
		



		
	}

}
