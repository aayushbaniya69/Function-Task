public class convertDays {
    public static void convertdays(int totalDays) {
        int years = totalDays / 365;
        int months = (totalDays % 365) / 30;
        int days = (totalDays % 365) % 30;
        System.out.println(years + " years, " + months + " months, " + days + " days");
    }
    
    
}
