import java.util.Scanner;

class datatype {
    static int dataTypeSize(String str) {
        switch (str) {
            case "Character": return 1; 
            case "Integer": return 4;
            case "Long": return 8; 
            case "Float": return 4; 
            case "Double": return 8; 
            default: return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data type: ");
        String str = sc.nextLine();
        
        int size = dataTypeSize(str); 
        if (size != -1) {
            System.out.println("Size of " + str + ": " + size + " bytes");
        } else {
            System.out.println("Invalid data type entered: " + str);
        }
        
        sc.close(); 
    }
}
