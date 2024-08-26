#include <cstdlib>
#include <iostream>
#include <string>

class bsdsa {
public:
    std::string dsas, ccsist;
    bsdsa(const std::string name, const std::string lastname) {
        dsas = name;
        ccsist = lastname;
    }
    void kms() {
        std::cout << "welcome. Firstname: " << dsas << " lastname: " << ccsist;
        //extract the info;
        std::string studentinfo = "echo 'firstname: " + dsas + " lastname: " + ccsist + "' >> studentinfo.txt";
        const char *data = studentinfo.c_str();
        system(data);
    }
};

int main(void){
    std::pmr::string Pangalan, apilyedo;

    std::cout << "hello type your Firstname \n >> ";

    std::getline(std::cin, Pangalan);

    std::cout << "type your lastname\n >> ";

    std::getline(std::cin, apilyedo);

    //fix the shit
    const char *first = Pangalan.c_str();
    const char *last = apilyedo.c_str();

    bsdsa object(first, last);

    object.kms();
    return 200;
}