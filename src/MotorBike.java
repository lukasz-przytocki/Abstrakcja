public class MotorBike extends Vehicle {
    private int speedLimit;

    public MotorBike(String name, int age, int speedLimit) {
        super(name, age);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
