#include <iostream>
using namespace std;

int main() {
    float weightInPound, weightInKg;

    cout << "Enter weight in pounds: ";
    cin >> weightInPound;

    // Convert pounds to kilograms
    weightInKg = weightInPound / 2.2;

    cout << "The weight of the person in pound is "
         << weightInPound
         << " and in kg is "
         << weightInKg;

    return 0;
}