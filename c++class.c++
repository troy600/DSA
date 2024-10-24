#include <iostream>
#include <string>
#include <cstdlib>



class nothing {
private:
    void nothinghere() {
        std::cout << "";
    }
};

class getanswer {
public:
    int user_number;
    int answer;

    std::string static hello() {
        return "hello";
    }

    getanswer(int number) {
        user_number = number;
        answer = user_number * user_number;
    }

    void thisvoid() {
        std::cout << "the area of square of " << user_number << " is " << answer;
    }
};


int main() {
    int* usermod = new int;
    *usermod = 10;
    int user;
    std::cout << "hello type the area of square you want to entr>>";
    std::cin >> user;
    std::cout << "\n";
    getanswer(user).thisvoid();
    std::cout << "\n" << getanswer::hello();
    delete usermod;
    return 0;
}