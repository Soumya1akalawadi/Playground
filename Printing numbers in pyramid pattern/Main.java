#include <stdio.h>
int main() {
	// Type your code here
  int n,num=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {  
    for(int sp=1;sp<=(n-i);sp++)
    {
      printf(" ");
    }
    for(int j=1;j<=i;j++)
    {
      printf("%d ",num);
      num++;
    }
    printf("\n");
  }
	return 0;
}