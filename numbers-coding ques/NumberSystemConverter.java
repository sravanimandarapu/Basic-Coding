import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Number System Converter -----");
        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Octal to Decimal");
        System.out.println("3. Hexadecimal to Decimal");
        System.out.println("4. Decimal to Binary");
        System.out.println("5. Decimal to Octal");
        System.out.println("6. Decimal to Hexadecimal");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter Binary Number: ");
                String bin = sc.nextLine();
                int binToDec = Integer.parseInt(bin, 2);
                System.out.println("Decimal: " + binToDec);
                break;

            case 2:
                System.out.print("Enter Octal Number: ");
                String oct = sc.nextLine();
                int octToDec = Integer.parseInt(oct, 8);
                System.out.println("Decimal: " + octToDec);
                break;

            case 3:
                System.out.print("Enter Hexadecimal Number: ");
                String hex = sc.nextLine();
                int hexToDec = Integer.parseInt(hex, 16);
                System.out.println("Decimal: " + hexToDec);
                break;

            case 4:
                System.out.print("Enter Decimal Number: ");
                int dec1 = sc.nextInt();
                System.out.println("Binary: " + Integer.toBinaryString(dec1));
                break;

            case 5:
                System.out.print("Enter Decimal Number: ");
                int dec2 = sc.nextInt();
                System.out.println("Octal: " + Integer.toOctalString(dec2));
                break;

            case 6:
                System.out.print("Enter Decimal Number: ");
                int dec3 = sc.nextInt();
                System.out.println("Hexadecimal: " + Integer.toHexString(dec3).toUpperCase());
                break;

            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}
