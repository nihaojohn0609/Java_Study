public class FlourPackProblem {

    public static void main(String[] args) {

    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        while (bigCount > 0 && goal >= 5) {
//            bigCount--;
//            goal -= 5;
//        }
//        return smallCount >= goal;
//    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if(bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        int bigCountToUse = bigCount < goal / 5 ? bigCount : goal / 5;  // determine how many bigCount to use
//        return (goal - bigCountToUse * 5) <= smallCount;
//    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if(bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        if(bigCount * 5 + smallCount < goal) {
//            return false;
//        }
//        return (goal % 5 <= smallCount);    // regardless of bigCount, remainder of goal has to be less than smallCount
//    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        for(int i = 0; i <= bigCount; i++) {
            for(int j = 0; j <= smallCount; j++) {
                if(goal == (i * 5) + j) {
                    return true;
                }
            }
        }
        return false;
    }
}
