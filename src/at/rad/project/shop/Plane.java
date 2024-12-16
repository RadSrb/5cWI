package at.rad.project.shop;

public class Plane implements Product   {
    private String name;
    private String model;

    public Plane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Plane(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public int getPrice() {
        return 1000000; 
    }

}
