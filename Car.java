public class Car {
    // Attributes
    String make_, model_;
    int year_, currentYear_;

    // Constructor
    public Car(String make, String model, int year, int currentYear) {
        make_ = make;
        model_ = model;
        year_ = year;
        currentYear_ = currentYear;
    }
    // Method to display car information
    
    public void displayInfo(){
        System.out.println(make_ + " " + model_ + " " + year_);
    }

    public int getCarAge(){
        return currentYear_-year_;
    }

    public boolean isSameCar(Car otherCar){
        if(otherCar.make_ == make_ && otherCar.model_ == model_ && otherCar.year_ == year_){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a Car object
        Car myObjA = new Car("Kia", "Picanto", 2012, 2024);
        Car myObjB = new Car("Kia", "Picanto", 2012, 2024);
        Car myObjC = new Car("Kia", "Picanto", 2010, 2024);
        // Display car details
        myObjA.displayInfo();
        System.out.println(myObjA.getCarAge());
        System.out.println(myObjA.isSameCar(myObjB));
        System.out.println(myObjA.isSameCar(myObjC));
    }
}
