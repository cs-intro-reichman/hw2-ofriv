// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheerWord = args[0].toUpperCase();
            String printAn = "AEFHILMNORSX";
            for(int i = 0 ; i < cheerWord.length(); i++)
            {
                if(printAn.contains(Character.toString(cheerWord.charAt(i))))
                {
                 System.out.println("Give me an "+ cheerWord.charAt(i)+": "+ cheerWord.charAt(i)+"!");
                }
                else
                System.out.println("Give me a  "+ cheerWord.charAt(i)+": "+ cheerWord.charAt(i)+"!");
            } 
            System.out.println("What does that spell?");  
            int times = Integer.parseInt(args[1]);
            for(int i = 0 ; i < times; i++)
            {
                System.out.println(cheerWord+"!!!");
            }
        }
}
