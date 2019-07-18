#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],n,i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(j=n-1;j>=0;j--)
  {
    for(i=0;i<j;i++)
    {
      if(a[i]>a[i+1])
      {
        int temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
    printf("%d\n",a[i]);
  return 0;
}