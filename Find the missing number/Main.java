#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],n;
  scanf("%d",&n);
  int i;
  for(i=0;i<n;i++)
  scanf("%d\n",&a[i]);
  int x=1;
  for(i=0;i<=n;i++)
  {
    if(a[i]!=x)
    {
      printf("%d",x);
      break;
    }
    x++;
  }
  return 0;
}