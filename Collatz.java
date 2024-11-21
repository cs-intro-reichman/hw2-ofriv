// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode1 = args[1];
		String mode2 = "v";
		int next = seed;
		int count = 0;
		if (mode1.equals(mode2)) 
		{
			if (seed == 1){
				System.out.println(seed +" "+ (seed *3 +1) +" "+ (seed +1) +" " + seed + " (4)" );
				System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");

			} 
			else{
			System.out.println("1 4 2 1 (4)");

			for(int i = 2 ; i <= seed; i++) {
			next = i;
			count =1;

			while (next != 1) {


			if (next % 2 == 0) {
			System.out.print(next + " ");
			next = next / 2;
			count++;

			}
			else{
			System.out.print(next + " ");
			next = next * 3 + 1;
			count++;


			}
			}

			System.out.println(next + " (" + count + ")" );

			}
		System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");
			}
		}	
		else{
		System.out.println("Every one of the first " +seed +" hailstone sequences reached 1.");
		}
	}
}
