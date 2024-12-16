package at.rad.project.shop;

public class Car implements Product {
    private String color; 
    private String name;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }



    public Car(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String getModel() {
        return "Audi";
    }



    @Override
    public int getPrice() {
   return 10000;
    }
}
