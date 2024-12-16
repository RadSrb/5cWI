package at.rad.project.shop;

public class Main {
        public static void main(String[] args) {

        Car c1 = new Car("Audi", "red");
        Bike b1 = new Bike("KTM", "Trail");
        Plane p1 = new Plane("Airbus", "747");

        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(b1);
        gui.addProduct(p1);
        gui.addProduct(new Car("BMW", "Mercedes"));
        gui.addProduct(new Car("Mercedes", "Black"));

        gui.run();
}
}
