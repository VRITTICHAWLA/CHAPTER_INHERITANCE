import java.util.Scanner;

class CarRental {
    String renterName;
    int zipCode;
    String sizeOfCar;
    int daysForRental;
    double rentalFee;

    public CarRental(String renterName, int zipCode, int daysForRental) {
        this.renterName = renterName;
        this.zipCode = zipCode;
        this.sizeOfCar = sizeOfCar;
        this.daysForRental = daysForRental;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for size of car:\n1. Economy\n2. Midsize\n3. Full size");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                this.rentalFee = 29.99;
                sizeOfCar="economy";
                break;
            case 2:
                this.rentalFee = 38.99;
                sizeOfCar="midsize";
                break;
            case 3:
                this.rentalFee = 43.50;
                sizeOfCar="fullsize";
                break;
            default:
                this.rentalFee = 0.0;
                break;
        }
    }

    public void display() {
        System.out.println("Renter Name: " + renterName);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Size of Car: " + sizeOfCar);
        System.out.println("Rental Fee per Day: $" + rentalFee);
        System.out.println("Days for Rental: " + daysForRental);
        System.out.println("Total Rental Fee: $" + (rentalFee * daysForRental));
    }
}

class LuxuryCarRental extends CarRental {
    boolean includeChauffeur;
    double chauffeurFee;

    public LuxuryCarRental(String renterName, int zipCode, int daysForRental, boolean includeChauffeur) {
        super(renterName, zipCode, daysForRental);
        this.includeChauffeur = includeChauffeur;

        if (includeChauffeur) {
            this.chauffeurFee = 200.0;
        }
    }

    @Override
    public void display() {
        super.display();
        if (includeChauffeur) {
            System.out.println("Include Chauffeur: Yes");
            System.out.println("Chauffeur Fee per Day: $" + chauffeurFee);
            System.out.println("Total Rental Fee (including Chauffeur): $" + ((rentalFee + chauffeurFee) * daysForRental));
        } else {
            System.out.println("Include Chauffeur: No");
        }
    }
}

public class UseCarRental {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter renter name: ");
//        String renterName = sc.nextLine();
//
//        System.out.print("Enter zip code: ");
//        int zipCode = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter car size (economy, midsize, fullsize): ");
//        String carSize = sc.nextLine();
//
//        System.out.print("Enter rental length (in days): ");
//        int rentalLength = sc.nextInt();
//
//        System.out.print("Do you want to include a chauffeur? (true/false): ");
//        boolean includeChauffeur = sc.nextBoolean();

        LuxuryCarRental rental = new LuxuryCarRental("vritti", 132103, 4,true);
        System.out.println("\nRental Details:");
        rental.display();

    }
}
