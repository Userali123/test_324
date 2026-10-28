import java.util.Scanner;
public class ElectricityBill {
    String name;
    int unit;
    double charge;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Consumer Name: "); name = sc.nextLine();
        System.out.print("Enter Units Consumed: "); unit = sc.nextInt();
    }
    void calculate() {
        if (unit <= 100) charge = unit * 5.0;
        else if (unit <= 200) charge = (100 * 5.0) + (unit - 100) * 4.0;
        else charge = (100 * 5.0) + (100 * 4.0) + (unit - 200) * 3.50;
        charge += 200; // Monthly service charge
    }
    void display() {
        System.out.println("Name of the customer: " + name);
        System.out.println("No. of Units: " + unit + "\nTotal Charge: Rs. " + charge);
    }
    public static void main(String[] args) {
        ElectricityBill ob = new ElectricityBill();
        ob.accept(); ob.calculate(); ob.display();
    }
}