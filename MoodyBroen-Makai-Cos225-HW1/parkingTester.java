public class parkingTester {
    public static void main(String[] args){

        HW_1_ParkingLot parkingLot = new HW_1_ParkingLot();
        System.out.println(parkingLot);

        HW_1_Car InfinitiA = new HW_1_Car("Infiniti","Nissan",true);
        HW_1_ParkingLot.carParker(InfinitiA);
        System.out.println(parkingLot);

        HW_1_Car CaddilacB = new HW_1_Car("Caddilac","GM",false);
        HW_1_ParkingLot.carParker(CaddilacB);
        System.out.println(parkingLot);

        HW_1_ParkingLot.carGiver(0);
        System.out.println(parkingLot);
    }
    
}
