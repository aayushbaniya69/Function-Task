public class duck {
    public static boolean isDuckNumber(int num) {
        String str = Integer.toString(num);
        return str.contains("0") && str.charAt(0) != '0';
    }
    
}
