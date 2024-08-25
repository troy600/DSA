#include <iostream>
#include <cstdlib>
using namespace std;

int main(void) {
  int seggs = 9;
  char *ccsict;
  std::cout << "enter command to run \n >>";
  std::cin >> ccsict;

  system(ccsict);

  return seggs;
}