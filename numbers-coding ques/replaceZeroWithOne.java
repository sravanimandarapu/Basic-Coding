public class replaceZeroWithOne {
    public static void main(String[] args) {
        int num = 706120678;
        String str = String.valueOf(num);  // Convert int to String properly
        String replaced = str.replace('0', '1');
        int result = Integer.parseInt(replaced);  // Convert back to int
        System.out.println("After replacing 0 with 1: " + result);
    }
}
