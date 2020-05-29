package arrayListvsLinkedList;
import java.util.ArrayList;
import java.util.*;

public class arraylinked {
	
	public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	LinkedList<Integer> linkedList = new LinkedList<>(); 
	
	for(int i = 0; i<100000; i++)
	{
		arrayList.add(i);
		linkedList.add(i); 
	} 
	
	final long startTimeLL = System.nanoTime();
	linkedList.get(100);
	//linkedList.remove(500);//
	final long endTimeLL = System.nanoTime();
	
	final long startTimeAL = System.nanoTime();
	arrayList.get(100); 
	//arrayList.remove(500); 
	final long endTimeAL = System.nanoTime();
	 
	long totalTimeLL = endTimeLL - startTimeLL;
	long totalTimeAL = endTimeAL - startTimeAL; 
	
	System.out.println("Total LL time exe: " + totalTimeLL);
	System.out.println("Total AL time exe: " + totalTimeAL);
	
	}
}


