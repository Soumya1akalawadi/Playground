#include<stdio.h>
int main()
{
  //Type your code here
  int a[50][50],n,m,i,j,k,c=0;
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
  scanf("%d",&a[i][j]);
  }
  scanf("%d",&k);
   for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
       if (a[i][j] == k)
      {  printf("(%d, %d)",i,j);
      c++;
      }
    }
   }
  if(c==0)
    printf("(-1, -1)");
  return 0;
}