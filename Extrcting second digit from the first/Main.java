#include <stdio.h>
int main() {
	//Type your code
  int n,n1;
  scanf("%d",&n);
  while(n>100)
  {
    n/=10;
  }
  n1=n%10;
  printf("%d",n1);
  
	return 0;
}