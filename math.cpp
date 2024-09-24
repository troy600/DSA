#include <iostream>
#include <string>
#include <fstream>

using namespace std;

class inf {
public:
    std::string ufirst, ulast, umiddle, uage;
    inf(string first, string last, string middle, string age){
        ufirst = first;
        ulast = last;
        umiddle = middle;
        uage = age;
    }
    void parse() {
        ofstream file("studentinfo.txt");
        if (file.is_open()) {
            file << "Name: " << ufirst << "Lastname" << ulast << "MiddleName: " << umiddle << "age: " << uage;
            file.close();
        } else {
            cout << "unable to open file";
            }
        
        cout << "\n hello " << ufirst; 


    }
};

int main(void) {
    return 0;
}
