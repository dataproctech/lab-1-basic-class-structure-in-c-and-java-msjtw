#include <iostream>
// include the necessary libraries

class Car {
    //attributes
    std::string make;
    std::string model;
    int year;
    // Constructor
    public:
        Car(std::string make, std::string model, int year){
            this->make = make;
            this->model = model;
            this->year = year;
        }
    // Method to display car information
   void displayInfo(){
    std::cout << make << " " << model << " " << year;
   }
};

int main() {
    // Create a Car object
    Car c("kia", "Picanto", 2010);
    // Display car details
    c.displayInfo();    
    return 0;
}
