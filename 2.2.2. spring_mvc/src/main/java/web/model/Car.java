package web.model;

public class Car {
    String model;
    String colour;
    int number;

    public Car(String model, String colour, int number) {
        this.model = model;
        this.colour=colour;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String year) {
        this.colour = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int price) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour=" + colour +
                ", number=" + number +
                '}';
    }
}