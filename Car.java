public class Car {
    // Attributes
    String make_, model_;
    int year_;

    // Constructor
    public Car(String make, String model, int year) {
        make_ = make;
        model_ = model;
        year_ = year;
    }
    // Method to display car information
    
    public void displayInfo(){
        System.out.println(make_ + " " + model_ + " " + year_);
    }

    public static void main(String[] args) {
        // Create a Car object
        Car myObj = new Car("Kia", "Picanto", 2012);
        // Display car details
        myObj.displayInfo();
    }
}
