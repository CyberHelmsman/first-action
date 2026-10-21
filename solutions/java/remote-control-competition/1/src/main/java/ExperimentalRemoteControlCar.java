public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int units = 0;

    @Override
    public void drive() {
        units += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return units;
    }
}