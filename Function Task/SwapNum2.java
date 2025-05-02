public class SwapNum2 {
    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
    
    
}
