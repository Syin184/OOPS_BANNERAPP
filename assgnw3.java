#include <iostream>
using namespace std;

int main() {
    float base, height;
    float areaSqCm, areaSqIn;

    cout << "Enter base in cm: ";
    cin >> base;

    cout << "Enter height in cm: ";
    cin >> height;

    // Area in square centimeters
    areaSqCm = 0.5 * base * height;

    // Convert square cm to square inches
    areaSqIn = areaSqCm / (2.54 * 2.54);

    cout << "The Area of the triangle in sq in is " 
         << areaSqIn 
         << " and sq cm is " 
         << areaSqCm;

    return 0;
}