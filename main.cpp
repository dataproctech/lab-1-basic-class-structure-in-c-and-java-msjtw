#include <iostream>
// include the necessary libraries

class Car {
    //attributes
    std::string make;
    std::string model;
    int year;
    int current_year;
    // Constructor
    public:
        Car(std::string make, std::string model, int year, int current_year){
            this->make = make;
            this->model = model;
            this->year = year;
            this->current_year = current_year;
        }
    // Method to display car information
   void displayInfo(){
    std::cout << make << " " << model << " " << year << std::endl;
   }

   int getCarAge(){
    return current_year - year;
   }

    bool isSameCar(Car otherCar){
        if(make == otherCar.make and year==otherCar.year and model==otherCar.model)
            return true;
        return false;
    }
};

int main() {
    // Create a Car object
    Car c("kia", "Picanto", 2010, 2024);
    Car d("kia", "Picanto", 2010, 2024);
    Car e("WV", "Golf", 2012, 2024);
    // Display car details
    c.displayInfo();    
    std::cout << c.getCarAge() << std::endl;
    std::cout << c.isSameCar(d) << " " << c.isSameCar(e) << std::endl;
    return 0;
}
