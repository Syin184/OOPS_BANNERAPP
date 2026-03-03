#include <iostream>
using namespace std;

int main() {
    float fahrenheit, celsiusResult;

    cout << "Enter temperature in Fahrenheit: ";
    cin >> fahrenheit;

    celsiusResult = (fahrenheit - 32) * 5 / 9;

    cout << "The " << fahrenheit 
         << " fahrenheit is " 
         << celsiusResult 
         << " celsius";

    return 0;
}