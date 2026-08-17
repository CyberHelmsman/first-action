public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int rawProduction = 221 * speed;
        
        if (speed >= 1 && speed <= 4) {
            return rawProduction * 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return rawProduction * 0.9;
        } else if (speed == 9) {
            return rawProduction * 0.8;
        } else if (speed == 10) {
            return rawProduction * 0.77;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}