public class palindrome {
    public static boolean isPalindromePrime(int num) {
        return isPalindrome(num) && isPrime(num);
    }
    
    private static boolean isPalindrome(int num) {
        int rev = 0, original = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return original == rev;
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    
}
