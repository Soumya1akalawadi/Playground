#include<stdio.h>
int squre(int x)
{
  return (x*x);
}
int main() {
   // Type your code here
  int n,r;
  scanf("%d",&n);
  r=squre(n);
  printf("%d",r);
  
   return 0;
}