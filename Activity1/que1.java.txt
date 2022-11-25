package question1;

import java.util.*;

public class hightest_placement {
	public static void main (String args[]) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter placements of CSE") ;
		int cse = input1.nextInt();
		
		System.out.println("Enter placements of IT") ;
		int it = input1.nextInt();
		
		System.out.println("Enter placements of MECH") ;
		int mech = input1.nextInt();
		
		if (cse > it && cse > mech) {
			System.out.println("CSE has the hightest number of placements");
		}
		else if (it == cse && it == mech) {
			System.out.println("IT, CSE and MECH has the hightest number of placements");
		}
		else if (it == mech) {
			System.out.println("IT and mech has the hightest number of placements");
		}
		else if (cse == it) {
			System.out.println("CSE and IT has the hightest number of placements");
		}
		else if (cse == mech) {
			System.out.println("CSE and MECH has the hightest number of placements");
		}
		else if (it > mech) {
			System.out.println("IT has the hightest number of placements");
		}
		else {
			System.out.println("MECH has the hightest number of placements");
		}
	}
}