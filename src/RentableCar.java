public class RentableCar extends Car implements Rentable {

    private Person person;


    public RentableCar(String name, int age, int seats) {
        super(name, age, seats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person(firstName,lastName,id);

    }

    @Override
    public void handOver() {
        person=null;

    }

    @Override
    public boolean isRent() {
        return person!=null;
    }

    @Override
    public String toString() {
        return "Samochód wypożyczony dla "+ person;
    }

}
