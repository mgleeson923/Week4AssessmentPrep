import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/17/17.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numofCars;

        System.out.println("How many cars are you entering?: ");
        numofCars = scnr.nextInt();
        scnr.nextLine();

        ArrayList<Car> carList = new ArrayList<>(numofCars);

        for (int i = 0; i <= numofCars ; i++) {
            Car car = new Car();
            System.out.println("Enter Make: ");
            String make = scnr.nextLine();
            car.setMake(make);
            System.out.println("Enter Model: ");
            String model = scnr.nextLine();
            car.setModel(model);
            System.out.println("Enter Year:");
            int year = scnr.nextInt();
            car.setYear(year);
            System.out.println("Enter Price: ");
            double price = scnr.nextDouble();
            car.setPrice(price);
            scnr.nextLine();

            carList.add(i, car);
        }

//        for (int i = 0; i < carList.size() ; i++) {
            System.out.println(carList.toString());
//
//        }






    }

}
