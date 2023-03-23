package kolomytsev.course1.one;

public class TaskEight {
    public static boolean taskEight(int pi){
        return ((pi % 4 == 0) && (pi % 100 != 0)) || (pi % 400 == 0);
//        if (pi % 4 == 0 || pi % 400 == 0){
//            return true;
//        } else if (pi % 100 == 0) {
//            return false;
//        } else {
//            return false;
//        }

//        if (pi % 4 == 0){
//            if (pi % 100 == 0){
//                if (pi % 400 == 0){
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } else {
//            return false;
//        }
    }
}
