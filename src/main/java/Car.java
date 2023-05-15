public class Car {
    CarStopping carStopping;

    // IoC
    public Car(CarStopping carStopping) {
        this.carStopping = carStopping;
    }

    public void setCarfixing() {
        if ((int) Math.round(Math.random()) == 0){
            carStopping.stop();
        }
        else {
            System.out.println("crash");
        }
    }
}
