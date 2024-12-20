// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[] args) {
	    int tries = Integer.parseInt(args[0]);
		int countLow = 0;
		int countHigh = 0;
		double randomNum = 0;
		for(int i = 0; i < tries ; i++)
		{
			randomNum = Math.random();
			if(randomNum > 0.5){
				countHigh++;
			}else {
				countLow++;
			}
		}
		System.out.println("> 0.5: "+countHigh+" times");
		System.out.println("<= 0.5: "+countLow+" times");
		double ratio;
		if (countHigh == 0 || countLow == 0) {
			ratio = 0;
		}else{
		 ratio = (double)(Math.min(countLow, countHigh))/(double)(Math.max(countLow, countHigh));
		
		System.out.println("Ratio:"+ ratio);
		}
	}
}
