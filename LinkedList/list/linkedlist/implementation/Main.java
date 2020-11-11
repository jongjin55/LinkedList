package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList numbers = new LinkedList();
		
		
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		numbers.addFirst(5);
		numbers.add(1, 15);
		
		
		System.out.println( numbers.removeLast() );
		System.out.println( numbers.size() );
		System.out.println( numbers.get(2) );
		System.out.println( numbers ); 
		System.out.println(numbers.indexOf(5));
		
		LinkedList.ListIterator i = numbers.listIterator();
		
		//System.out.println(i.next());
		
		i.add(6);  // 위치를 설정해주지 않았기 때문에 첫번째로 추가됨!
		i.next();
		i.add(17);
		
		System.out.println( numbers );
		
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
	}
	
	
	

}
