public class Operations {
    
    public static String count (int start, int end){
        String str = "";
        for (int count = start; count <= end; count++) {
            str += count + "...";
        }
        return str;
    }

}