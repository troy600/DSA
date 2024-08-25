#include <iostream>
#include <string>


using namespace std;

int main(void) {
    string answer;
    bool mean = true;

    while (mean == true) {
        cout << "are you depressed?  (y/n)\n >> ";
        cin >> answer;
        if (answer == "y" | answer == "Y"){
            cout << "poor guy LOL\n";
            mean = false;
        } else if (answer == "n" | answer == "N" ) {
            cout << "stay like that okay? \n";
            mean = false;
        } else {
            cout << "follow the instruction dumbass \n";
        }

    }
    return 0;
}