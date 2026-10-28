import java.util.Scanner;
public class Courier {
    String name, address;
    double weight, bill;
    char type;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: "); name = sc.nextLine();
        System.out.print("Enter Address: "); address = sc.nextLine();
        System.out.print("Enter Weight (Kg): "); weight = sc.nextDouble();
        System.out.print("Enter Type (D/I): "); type = sc.next().charAt(0);
    }
    void calculate() {
        if (weight <= 5) bill = weight * 800;
        else if (weight <= 10) bill = (5 * 800) + (weight - 5) * 700;
        else bill = (5 * 800) + (5 * 700) + (weight - 10) * 500;
        if (type == 'I' || type == 'i') bill += 1500;
    }
    void print() {
        System.out.println("Name: " + name + "\nAddress: " + address);
        System.out.println("Weight: " + weight + " Kg | Type: " + type + "\nTotal Bill: Rs. " + bill);
    }
    public static void main(String[] args) {
        Courier ob = new Courier();
        ob.accept(); ob.calculate(); ob.print();
    }
}