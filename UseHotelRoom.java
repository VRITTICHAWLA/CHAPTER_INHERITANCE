 class HotelRoom {
     int roomNumber;
     double nightlyRate;

    HotelRoom(int roomNumber) {
       this.roomNumber = roomNumber;
        if (roomNumber <= 299) {
            nightlyRate = 69.95;
        }
        else {
            nightlyRate = 89.95;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
 class Suite extends HotelRoom {
     Suite(int roomNumber) {
         super(roomNumber);
 //        super(roomNumber);
//        double regularRate = super.getNightlyRate();
//        nightlyRate = regularRate + SURCHARGE;
         if (roomNumber <= 299) {
             nightlyRate = 69.95 + 40;
         } else {
             nightlyRate = 89.95 + 40;
         }
     }
 }
public class UseHotelRoom {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom(300);
        System.out.println("Room number: " + room1.getRoomNumber());
        System.out.println("Nightly rate: $" + room1.getNightlyRate());

        Suite suite1 = new Suite(301);
        System.out.println("Suite number: " + suite1.getRoomNumber());
        System.out.println("Nightly rate: $" + suite1.getNightlyRate());
    }
}