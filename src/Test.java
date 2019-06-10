public class Test {
    public static void main(String[] args) {
        Car car1= new Car("Audi", 2010, 5);
        MotorBike motorBike = new MotorBike("Yamaha", 2007, 200);


        Vehicle move1 = new Car("Audi", 2010, 5);
        move1.turnLeft();
        System.out.println(move1.toString());

        move1.turnRight();
        System.out.println(move1.toString());


        Rentable carToRent = new RentableCar("Audi", 2010, 5);
        carToRent.rent("Jan", "Kowalski", "ABC123");

        System.out.println(carToRent);

        carToRent.handOver();

        if(carToRent.isRent()){
            System.out.println("Nie można wypożyczyć tego samochodu, jest zajęty");
        }else {
            carToRent.rent("Mariola", "Kowalska", "ABC124");
        }


    }
}
