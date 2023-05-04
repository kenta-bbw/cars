/**
 * Car
 * @author Kenta
 * @version 16.09.2022
 */
public class Car {
    //Attributes
    private String model;
    private double velocity;
    private double cost;
    private String color;

    public Car(String model, double velocity, double cost, String color) {
        this.model = model;
        this.velocity = velocity;
        this.cost = cost;
        this.color = color;
    }
    public Car(){
        model = "unknown";
        velocity = 0;
        cost = 0;
        color = "unknown";
    }

    public String getModel() {
        return model;
    }

    public double getVelocity() {
        return velocity;
    }
    public double getCost() {
        return cost;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + '\'' + ", velocity=" + velocity + '\'' + "cost=" + cost + '\'' + "color" + color +'}';
    }
    public void accelerate() {
        System.out.println("Car.accelerate(): is called, but no implementation available");
    }
}





