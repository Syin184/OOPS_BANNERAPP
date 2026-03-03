#include <iostream>
using namespace std;

int main() {
    int number, counter = 1;

    cout << "Enter a positive integer: ";
    cin >> number;

    if (number <= 0) {
        cout << "Please enter a positive integer.";
    } 
    else {
        cout << "The factors of " << number << " are:" << endl;

        while (counter <= number) {
            if (number % counter == 0) {
                cout << counter << endl;
            }
            counter++;
        }
    }

    return 0;
}