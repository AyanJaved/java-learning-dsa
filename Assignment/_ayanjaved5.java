package Assignment;
import java.util.*;
class ArmstrongNumber {
    int num;
    ArmstrongNumber(int num) {
        this.num = num;
    }
    boolean isArmstrong() {
        int originalNum = num;
        int sum = 0;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, 3); // Change the power to the number of digits in your specific case
            originalNum /= 10;
        }
        return sum == num;
    }
}
public class _ayanjaved5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(number);
        if (armstrongNumber.isArmstrong()) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }
}

