#include <iostream>
#include <cstdlib>
#include <string>
using namespace std;
//assume
int main(void) {
  int seggs = 9;
  string ccsict;
  std::cout << "enter command to run \n >>";
  getline(cin, ccsict);

  string newcccsict = ccsict;
  cout << ccsict << "\n";
  const char *newerccsict = newcccsict.c_str();
  system(newerccsict);

  return seggs;
}