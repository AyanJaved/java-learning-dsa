package Assignment;
import java.util.*;
class primeCheck{
    public boolean isPrime( int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
public class _ayanjaved1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A number : ");
        int num = sc.nextInt();
        primeCheck primeCheck = new primeCheck();
        boolean isPrime = primeCheck.isPrime(num);
        if (isPrime){
            System.out.println(num + " Number is prime ");
        } else {
            System.out.println(num + " Number is not a prime ");
        }
        sc.close();
    }    
}
