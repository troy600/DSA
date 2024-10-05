#include <iostream>
#include <string>
#include <cstdlib>

class myclass {
public:
    std::string name;
    myclass(std::string zname) {
        name = zname;
    }
    void kms() {
        std::cout << "hello " << name << " how's your day? hmm?";
    }
};

int main() {
    std::string myname;
    std::cout << "hello who r u? :";
    getline(std::cin, myname);
    std::cout << "\n";

    myclass oa(myname);
    oa.kms();
    return 1;
}