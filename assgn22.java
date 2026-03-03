#include <iostream>
using namespace std;

int main() {
    int number1, number2;
    int quotient, remainder;

    cout << "Enter first number: ";
    cin >> number1;

    cout << "Enter second number: ";
    cin >> number2;

    quotient = number1 / number2;
    remainder = number1 % number2;

    cout << "The Quotient is " << quotient 
         << " and Remainder is " << remainder 
         << " of two numbers " << number1 
         << " and " << number2;

    return 0;
}