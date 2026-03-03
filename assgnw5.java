#include <iostream>
using namespace std;

int main() {
    int number;

    cout << "Enter a positive integer: ";
    cin >> number;

    if (number <= 0) {
        cout << "Please enter a positive integer.";
    } else {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                cout << "FizzBuzz" << endl;
            }
            else if (i % 3 == 0) {
                cout << "Fizz" << endl;
            }
            else if (i % 5 == 0) {
                cout << "Buzz" << endl;
            }
            else {
                cout << i << endl;
            }
        }
    }

    return 0;
}