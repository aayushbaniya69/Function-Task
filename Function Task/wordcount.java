public class wordcount {
    public static int countWords(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }
    
    
}
