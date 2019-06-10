public abstract class Vehicle implements Moveable {
    private String name;
    private int age;
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void turnLeft() {
        direction = "Left";

    }

    @Override
    public void turnRight() {
        direction = "Right";

    }

    @Override
    public void goForward() {
        direction = "Forward";

    }

    @Override
    public void goBack() {
        direction = "Back";

    }

    @Override
    public String toString() {
        return "Pojazd porusza się w kierunku " + direction;
    }
}
