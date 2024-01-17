public class BarkingDog {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if(barking == true && (hourOfDay >= 0 && hourOfDay <=23) && ((hourOfDay<8) || (hourOfDay>22))) {
//            return true;
//        } else {
//            return false;
//        }

        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        } else {
            return true;
        }
    }
}
