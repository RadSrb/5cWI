package at.rad.project.shop;

public class Plane implements Product   {
    private String name;
    private String model;

    public Plane(String name, String model) {
        this.name = name;
        this.model = model;
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

}
