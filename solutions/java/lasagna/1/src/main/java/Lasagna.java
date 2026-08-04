public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int elapsedTime) {
        int remainingTime = expectedMinutesInOven() - elapsedTime;
        return remainingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayer) {
        int preparationTimeInMinutes = numberOfLayer * 2;
        return preparationTimeInMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayer, int elapsedTime) {
        int totalTimeInMinutes = preparationTimeInMinutes(numberOfLayer) + elapsedTime;
        return totalTimeInMinutes;
    }
}
