public class TimeCalc {
    public static void main(String[] args) {
        String timeInput = args[0];
        int hours = Integer.parseInt(timeInput.substring(0, 2)); 
        int minutes = Integer.parseInt(timeInput.substring(3, 5)); 
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        String formattedHours = (newHours < 10 ? "0" : "") + newHours;
        String formattedMinutes = (newMinutes < 10 ? "0" : "") + newMinutes;
        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
