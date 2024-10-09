#include <stdio.h>
#include <string.h>

int main(int argc, char **argv) {
	printf("guess the number: ");
	int x;
	scanf("%d", &x);
	for ( x=x; x=69; scanf("%d", &x) ) {
		if ( x == 69 ) {
			printf("nice good job");
	        } else {
			printf("try again: ");
	        }
	}
	return 0;
}
