#include <iostream>
using namespace std;

int main() {
    float unitPrice;
    int quantity;
    float totalPrice;

    cout << "Enter unit price: ";
    cin >> unitPrice;

    cout << "Enter quantity: ";
    cin >> quantity;

    totalPrice = unitPrice * quantity;

    cout << "The total purchase price is INR " 
         << totalPrice 
         << " if the quantity " << quantity 
         << " and unit price is INR " << unitPrice;

    return 0;
}