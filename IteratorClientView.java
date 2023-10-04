import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Your Name(s):
 *
 * Iterator Practice: You must use an iterator to solve these problems!!!
 * When you are done with the in-class exercise print this file and
 * give it to me. Make sure you include your names above.
 */
public class IteratorClientView {

	public static void main(String[] args) {
		List<String> myList = null;

		// (1) Instantiate myList as an LinkedList of String objects,
		// and add these strings to myList
		// "A", "BB", "C", "A", "A", "AB", "C", "ABC" in this order.
		myList = new LinkedList<>();
		myList.add("A");
		myList.add("BB");
		myList.add("C");
		myList.add("A");
		myList.add("A");
		myList.add("AB");
		myList.add("C");
		myList.add("ABC");
		myList.add("BB");

		// (2) Write and call the method count described below.
		// Print the "target" and value returned
		//System.out.println("There are " + count(myList, new String("A")) + " occurrences of A in myList");

		// (3) Write and call the method printOddLengthStrings
		//printOddLengthStrings(myList);

		// (4) Write and call the method removeFirst. Print myList before and
		// after a call to removeFirst to verify that it is working
		//removeFirst(myList, "C");

		// Extra Credit -- if time permits
		// (5) Write and call the method removeLast. Print myList before and
		// after a call to remove target to verify that it is working
		removeLast(myList, "BB");

		Iterator<String> iter = myList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	/**
	 * (2)
	 * Use an Iterator to return the number of occurrences of the
	 * specified target String in myList.
	 * 
	 * @param myList list that is searched for the target value
	 * @param target is the String we are looking for
	 * @return number of occurrences of target in myList
	 */
	private static int count(List<String> myList, String target) {
		int i = 0;
		Iterator<String> iter = myList.iterator();
		while (iter.hasNext()) {
			if (iter.next().equals(target))
				i++;
		}
		return i;
	}

	/**
	 * (3)
	 * Use an Iterator to print all the strings in myList that have odd length.
	 * 
	 * @param myList is the list that is searched
	 */
	public static void printOddLengthStrings(List<String> myList) {
		Iterator<String> iter = myList.iterator();
		int i = 0;
		while (iter.hasNext()) {
			if (i % 2 != 0) {
				iter.next();
				System.out.println(iter.next());
			}
			i++;
		}
	}

	/**
	 * (4)
	 * Use an Iterator to remove the first occurrence of the
	 * specified target String in myList.
	 * 
	 * @param myList is the list that is searched
	 * @param target is the element we are trying to remove
	 * @return true if the target was removed and false otherwise
	 */
	private static boolean removeFirst(List<String> myList, String target) {
		Iterator<String> iter = myList.iterator();
		while (iter.hasNext()) {
			if (iter.next().equals(target)) {
				iter.remove();
				break;
			}
		}
		return false;
	}

	/**
	 * (5) Extra Credit -- must be done efficiently (one traversal of the list)
	 * Use a ListIterator to remove the >>>last<<< occurrence of the
	 * specified target String in myList.
	 * 
	 * @param myList is the list that is searched
	 * @param target is the element we are trying to remove
	 * @return true if the target was removed and false otherwise
	 */

	private static boolean removeLast(List<String> myList, String target) {
		Iterator<String> iter = myList.iterator();
		int highest = -1;
		int i = 0;
		while(iter.hasNext()){
			if(iter.next().equals(target)) highest = i;
			i++;
		}
		Iterator<String> iterter = myList.iterator();
		for(int j = 0; j < highest + 1; j++){
			iterter.next();
		}
		iterter.remove();
		return false;
	}
}