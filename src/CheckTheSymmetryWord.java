import java.util.Scanner;

public class CheckTheSymmetryWord {
    public static boolean isPalindrome(String inputString, String outputString) {

        String reverseString = new StringBuffer(outputString).reverse().toString();

        boolean checkString = inputString.equalsIgnoreCase(reverseString);

        return checkString;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Chuỗi nhập vào để tạo chuỗi đảo ngược
        System.out.println("Enter the output String ");
        String outputString = scanner.nextLine();

        //Chuỗi nhập vào để so sánh
        System.out.println("Enter the input String ");
        String inputString = scanner.nextLine();


        if (isPalindrome(inputString, outputString)) {
            System.out.println("Good! You are win ");
        } else {
            System.out.println("Good luck! ");
        }
    }
}
