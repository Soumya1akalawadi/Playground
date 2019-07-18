#include<stdio.h>
int natural_sum(int x)
{
  int s=0;
  for(int i=1;i<=x;i++)
  {
   s=s+i;
  }
  return(s);
}
int main() {
    // Type your code here
  int n,re;
  scanf("%d",&n);
  re=natural_sum(n);
  printf("%d",re);
  	return 0;
}