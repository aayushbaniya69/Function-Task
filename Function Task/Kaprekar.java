public class Kaprekar {
    public static boolean isKaprekar(int num) {
        int square = num * num;
        String str = String.valueOf(square);
        for (int i = 1; i < str.length(); i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == num) return true;
        }
        return num == 1; 
    }
    
    
}
