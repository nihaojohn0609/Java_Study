public class PlayingCat {

    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int maxTemp = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;

//        if(summer){
//            return temperature >= 25 && temperature <= 45 ? true : false;
//        } else {
//            return temperature >= 25 && temperature <= 35 ? true : false;
//        }
//
//        if (!summer &&  (temperature >= 25 && temperature <=35)) {
//            return true;
//        } else if (summer  && (temperature>=25 && temperature <=45)){
//            return true;
//        } else
//            return false;
    }
}
