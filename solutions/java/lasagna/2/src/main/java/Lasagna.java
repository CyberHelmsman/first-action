public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int elapsedTime) {
        int remainingTime = expectedMinutesInOven() - elapsedTime;
        return remainingTime;
    }

    public int preparationTimeInMinutes(int numberOfLayer) {
        int preparationTimeInMinutes = numberOfLayer * 2;
        return preparationTimeInMinutes;
    }

    public int totalTimeInMinutes(int numberOfLayer, int elapsedTime) {
        int totalTimeInMinutes = preparationTimeInMinutes(numberOfLayer) + elapsedTime;
        return totalTimeInMinutes;
    }
}
