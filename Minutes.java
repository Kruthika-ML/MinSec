public class Minutes {
    public static void main(String[] args) {
        System.out.println(getDuration(65,45));
        System.out.println(getDuration(3945));
    }

    private static String getDuration(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0 || seconds > 59)){
            return "Invalid value";
        }
        long hours = minutes / 60;
        long RemainingMinutes = minutes % 60;
        return hours + "h " +RemainingMinutes+ " m " +seconds+ "s";
    }

    private static String getDuration(long seconds){
        if (seconds < 0 || seconds > 59){
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long RemainingSeconds = seconds % 60;
        return getDuration(minutes,RemainingSeconds);
    }
}
