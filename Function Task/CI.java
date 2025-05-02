public class CI {
    public static double compoundInterest(double principal, double rate, int time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
    
    
}
