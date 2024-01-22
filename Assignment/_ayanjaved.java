package Assignment;
import java.util.*;
class SIcalc{
    double p;
    double r;
    double t;
    SIcalc(double p,double r,double t){
        this.p = p;
        this.r = r;
        this.t = t;
    }
    double calculator(){
        double interest = (p*r*t)/100;
        return interest; 
    }
} 
public class _ayanjaved {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter Time : ");
        double t = sc.nextDouble();
        SIcalc calculator = new SIcalc(p,r,t);
        double interest = calculator.calculator();
        System.out.println("Simple Interest : " + interest);
        sc.close();
    }
}
