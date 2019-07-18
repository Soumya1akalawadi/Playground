#include <stdio.h>
int main() {
	//Type your code
 int n,sum=0,rem=0,cube=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    cube=rem*rem*rem;
    sum=sum+cube;
    n=n/10;
  }
  if(sum==temp)
      printf("Armstrong Number");
  else
      printf("Not an Armstrong Number"); 
  return 0;
}