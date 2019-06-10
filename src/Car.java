public class Car extends Vehicle {
    private int seats;

    public Car(String name, int age, int seats) {
        super(name, age);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Samochód  " + getName() + " jedzie w kierunku " + getDirection();
    }
}
