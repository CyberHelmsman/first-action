// class Darts {
//     int score(double xOfDart, double yOfDart) {
//         double distance = (xOfDart * xOfDart) + (yOfDart * yOfDart);
//         int scoreInt = 0;
//         if (distance > 10*10) {
//             scoreInt += 0;
//         }
//         else if (distance > 5*5 && distance <= 10*10) {
//             scoreInt += 1;
//         }
//         else if (distance > 1*1 && distance <= 5*5) {
//             scoreInt += 5;
//         }
//         else if (distance >= 0 && distance <= 1*1) {
//             scoreInt += 10;
//         }
//         return scoreInt;
//     }
// }
// class Darts {
//     int score(double xOfDart, double yOfDart) {
//         double distance = (xOfDart * xOfDart) + (yOfDart * yOfDart);
        
//         if (distance > 10 * 10) {
//             return 0;
//         } else if (distance > 5 * 5) {
//             return 1;
//         } else if (distance > 1 * 1) {
//             return 5;
//         } else {
//             return 10;
//         }
//     }
// }
class Darts {
    private static final double INNER_SQ = 1.0 * 1.0;
    private static final double MIDDLE_SQ = 5.0 * 5.0;
    private static final double OUTER_SQ = 10.0 * 10.0;

    int score(double xOfDart, double yOfDart) {
        double distance = (xOfDart * xOfDart) + (yOfDart * yOfDart);

        if (distance <= INNER_SQ) return 10;
        if (distance <= MIDDLE_SQ) return 5;
        if (distance <= OUTER_SQ) return 1;

        return 0;
        
    }
}