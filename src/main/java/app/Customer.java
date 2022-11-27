package app;

public class Customer {

    private int carPlaque;
    private String name;
    private String surname;

    public Customer(int carPlaque, String name, String surname) {
        this.carPlaque = carPlaque;
        this.name = name;
        this.surname = surname;
    }

    public int getCarPlaque() {
        return carPlaque;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
