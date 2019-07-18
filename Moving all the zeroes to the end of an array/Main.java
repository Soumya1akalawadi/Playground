#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],n,i,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
   for(i=0;i<n;i++)
   {
     if(a[i]>0)
     {
       a[c++]=a[i];
     }
   }
  while(c<n)
  {
    a[c++]=0;
  }
  for(i=0;i<n;i++)
  printf("%d ",a[i]);
  return 0;
}