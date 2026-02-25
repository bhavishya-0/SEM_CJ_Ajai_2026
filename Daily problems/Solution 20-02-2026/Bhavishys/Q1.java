import java.util.Scanner;

public class Q1{

    public static void reverseString(char[] s) {
        
        int front = 0;
        int back = s.length - 1;

        while (front < back) {
            char temp = s[front];
            s[front] = s[back];
            s[back] = temp;

            front++;
            back--;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        char[] arr= input.toCharArray();

        reverseString(arr);

        System.out.print("Reversed string: ");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }

        s.close();
    }
}