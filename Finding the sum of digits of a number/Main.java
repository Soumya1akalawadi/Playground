#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,rem;
  scanf("%d",&n);
  while(n>0)
  {
    rem=n % 10;
    sum=sum+rem;
    n/=10;
  }
  printf("%d",sum);
	return 0;
}