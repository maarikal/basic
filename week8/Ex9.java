package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {

        System.out.println("----Exercise 9.1-----");
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate another = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(another)) {
            finnish.add(another);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found

        System.out.println();
        System.out.println("-----Exercise 9.2-----");
        RegistrationPlate reg4 = new RegistrationPlate("EST", "ABC124");
        RegistrationPlate reg5 = new RegistrationPlate("EST", "OOO555");

        VehicleRegister register = new VehicleRegister();
        register.add(reg4, "Mari");
        register.add(reg5, "Meelis");

        System.out.println(register.get(reg1));
        System.out.println(register.get(reg2));
        System.out.println(register.get(reg3));
        System.out.println(register.get(reg4));
        System.out.println(register.get(reg5));

        //  register.delete(reg2);
        System.out.println(register.getOwners());

        System.out.println();
        System.out.println("---Exercise 9.3----");
        register.add(reg2, "Tom");
        register.printRegistrationPlates();
        register.printOwners();
    }
}