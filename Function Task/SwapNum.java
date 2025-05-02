public class SwapNum {
    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }
    
}
