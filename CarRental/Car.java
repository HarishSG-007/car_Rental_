package Model;
public class Car {
    private int ID;
    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;
    private boolean available;
    public Car(){}
        public int gerID(){
            return ID;
        }
        public void setID(int ID){
        this.ID = ID;
        }
        public String getBrand(){
            return brand;
        }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price =  price;
    }
    public boolean isAvailabele(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available =  available;
    }
    }

