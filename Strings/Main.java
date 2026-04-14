
// public class removevowels {
//     public static void main(String[] args) {
//     String s="jhansi";
//     String s1="";
//     s1=s.replaceAll("[aeiouAEIOU]", "");
//     System.out.println("String after removing vowels: " + s1);
// }
//     }

// Check if the given string is Palindrome or not 
// class removevowels {
//     public static void main(String[] args) {
//         String s="mada";
//         String s1="";
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             s1+=(s.charAt(i));
//         }
//         if(s.equals(s1))
//         {
//             System.out.println("The string \"" + s + "\" is a Palindrome.");
//         }
//         else
//         {
//             System.out.println("The string \"" + s + "\" is not a Palindrome.");
//         }
//     }
// }

// removecharacters in a string except alphabets
// class Main {

// public static void main(String[] args) {
//      String s = "hel1456lo56wor%^ld";
//      s=s.replaceAll("[^a-zA-Z]","");
//      System.out.println(s);
//    }
// }

// String[] s1 = s.split("[\\s]"); - removes spaces

// public class Main {
// public static void main(String[] args) {
// String str="4PREP2INSTAA6";
// int sum=0;
// for(int i=0;i<str.length();i++){ 
// if(str.charAt(i)>='0' && str.charAt(i)<='9'){
// sum+=(str.charAt(i)-'0');
// }
// }
// System.out.println("Sum of all digits " +sum );
// }
// }