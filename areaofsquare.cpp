#include <iostream>
using namespace std;

int main() {
    float side_lngth;

    cout << "enter the side length of a square: ";
    cin >> side_lngth;

    float area = side_lngth * side_lngth;

    cout << "\n the area of square is: " << area;

    return 0;
}
