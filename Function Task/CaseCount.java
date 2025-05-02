public class CaseCount {
    public static void countCases(String str) {
        int upper = 0, lower = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }
    
    
}
