import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter third string: ");
        String str3 = sc.nextLine();

        String largest = str1;

        if (str2.length() > largest.length()) {
            largest = str2;
        }

        if (str3.length() > largest.length()) {
            largest = str3;
        }

        System.out.println("Largest string: " + largest);

        sc.close();
    }
}