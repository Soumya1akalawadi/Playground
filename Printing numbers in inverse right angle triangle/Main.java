#include <stdio.h>
int main() {
    // Type your code here
  int n,num;
  scanf("%d",&n);
  for( int i=1; i<=n; i++)
  {
    num=n-(i-1);
    for(int j=1;j<=n-(i-1);j++)
    {
      printf("%d",num);
      num--;
    }
    printf("\n");
  }
	return 0;
}