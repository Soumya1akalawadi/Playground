#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for( int sp=1;sp<=(n-i);sp++)
    {
      printf(" ");
    }
    for(int j=1;j<=(2*i-1);j++)
    {
      printf("*");
    }
    printf("\n");
  }
  
	return 0;
}