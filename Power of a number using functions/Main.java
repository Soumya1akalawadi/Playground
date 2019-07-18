#include<stdio.h>
int power(int x,int n)
{
  int s=1;
  while(n>=1)
  {
    s=s*x;
    n--;
  }
  return(s);
}
 
int main(){
    // Type your code here
  int x,n,pow;
  scanf("%d %d",&x,&n);
  pow=power(x,n);
  printf("%d",pow);
  	return 0;
}