#include<stdio.h>
void prime( int n)
{ 
  int i,j,fact;
  for(i=2; i<=n; i++)
    {
        fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
            printf("%d\n" ,i);
    }
}
  
void main()
{
    int n;
   
    scanf("%d",&n);
  prime(n);
  return 0;
}
 
