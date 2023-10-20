package adapterPattern;
import java.util.Scanner;

public class ApplianceApp {

    public static void main(String[] args){
        while (true){

            Scanner input = new Scanner(System.in);
            System.out.println("[1] Laptop");
            System.out.println("[2] Refrigerator");
            System.out.println("[3] Smartphone Charger");
            System.out.println("[4] Exit");
            System.out.print("\nChoose a device to plug-in: ");
            Integer choice = input.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    Laptop laptop = new Laptop();
                    PowerOutlet laptopPowOut = new LaptopAdapter(laptop);
                    System.out.println(laptopPowOut.plugIn());
                    System.out.println();
                    break;

                case 2:
                    Refrigerator refrigerator = new Refrigerator();
                    PowerOutlet refPowOut = new RefrigeratorAdaptor(refrigerator);
                    System.out.println(refPowOut.plugIn());
                    System.out.println();
                    break;

                case 3:
                    SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
                    PowerOutlet phoneChargerPowOut = new SmartphoneChargerAdapter(smartphoneCharger);
                    System.out.println(phoneChargerPowOut.plugIn());
                    System.out.println();
                    break;

                case 4: System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }
}
