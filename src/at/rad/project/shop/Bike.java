package at.rad.project.shop;

public class Bike implements Product {
 private String style;
 private String name;

 public Bike(String name, String style) {
    this.name = name;
    this.style = style;
 }


 public Bike(String string, String string2, int i) {
    //TODO Auto-generated constructor stub
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
return "KTM";
}


@Override
public int getPrice() {
 return 1000;
}


}
