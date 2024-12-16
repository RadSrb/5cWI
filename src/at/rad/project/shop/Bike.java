package at.rad.project.shop;

public class Bike implements Product {
 private String style;
 private String name;

 public Bike(String name, String style) {
    this.name = name;
    this.style = style;
 }


 public String getStyle() {
    return style;
 }


@Override
public String getName() {
    return name;
}


@Override
public String getColor() {
    return "black";
}


@Override
public String getModel() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getModel'");
}


}
