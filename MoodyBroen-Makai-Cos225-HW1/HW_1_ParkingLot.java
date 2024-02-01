public class HW_1_ParkingLot {
    public static HW_1_ParkingSpot[] spots;

    public HW_1_ParkingLot (){
        spots = new HW_1_ParkingSpot[10];
        for (int i = 0; i<10; i++){
            if (i > 1){
                spots[i] = new HW_1_ParkingSpot(false);
            }
            else{
                spots[i] = new HW_1_ParkingSpot(true);
            }
        }
    }

    public static int carParker(HW_1_Car car){
        if (car.handicapAccess == true){
            for (int i = 0; i<2; i++){
                if (spots[i].parkedCar == null){
                    spots[i].parkedCar = car;
                    return i;
                }
            }
        }
        else{
            for (int i = 2; i<=10; i++){
                if (spots[i].parkedCar == null){
                    spots[i].parkedCar = car;
                    return i;
                }
        }
            }
        return 0;
        }

    public static HW_1_Car carGiver(int a){
        HW_1_Car selectedCar = spots[a].parkedCar;
        if (selectedCar != null){
            spots[a].parkedCar = null;
            return selectedCar;
        }
        return null;
        }

    public String toString(){
        int h = 0;
        int nh = 0;

        for (int i = 0; i <2; i++){
            if (spots[i].parkedCar == null){
                h++;
                
            }
        }
        for (int i = 2; i <10; i++){
            if (spots[i].parkedCar == null){
                nh++;
            }
    }
    return "" + h + " " + nh;
}
}


