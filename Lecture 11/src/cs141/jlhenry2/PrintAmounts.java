/**
 * 
 */
package cs141.jlhenry2;

/**
 * @author jlhenry2
 *
 */
public class PrintAmounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] amount = new int [10]; // Array yayyyyyyyyyy
		
		for(int index = 1; index <= amount.length; index++) { // this'll multipy 10 
			amount[index-1] = index * 10;
		}
		
		for(int index : amount) { // This'll print out all of them
			System.out.println(index);
		}

	}

} // -JH
