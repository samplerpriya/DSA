// Q.1

//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=4 ; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//}


//Q.2
//
//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=5 ; i++) {
//
//            for (int j = 1; j <= 4; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//}


//Q.3

//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=5; i++) {
//
//            for (int j = 1; j<=i; j++) {
//
//                System.out.print( j );
//            }
//            System.out.println( );
//        }
//
//    }
//
//}



//
//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=5; i++) {
//
//            for (int j = 1; j <= 5-i+1; j++) {
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}



//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=4 ; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//    }
//
//}




//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for(int i=0; i< 2*5 ; i++) {
//            int totalColInRow = i > 5? 2 * 5 - i :i;
//            for (int j = 0; j < totalColInRow; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//}


//public class patternQuestion {
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 2 * 5; i++) {
//            int totalColInRow = i > 5 ? 2 * 5 - i : i;
//
//            int no0fSpaces = 5 - totalColInRow;
//            for (int s = 0; s < no0fSpaces; s++) {
//                System.out.println(" ");
//            }
//
//            for (int j = 0; j < totalColInRow; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//}



public class patternQuestion {
    public static void main(String[] args) {

       for(int line = 1; line <= 4; line++){
           for(int star = 4; star >=1; star --){
               System.out.println("*");
           }

       }
        System.out.println(" ");

    }
}