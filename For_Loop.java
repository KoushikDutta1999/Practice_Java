import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
