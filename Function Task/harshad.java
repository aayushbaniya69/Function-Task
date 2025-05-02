public class harshad {
    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }
    
    
}
