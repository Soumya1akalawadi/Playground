#include<stdio.h>
int main()
{
  //fill the code
  int a[50],n,i;
  scanf("%d",&n);
 for(i=0;i<n;i++)
      scanf("%d",&a[i]);
  int ler=a[0];
 for(i=0;i<n;i++)
        {
          if(a[i]>ler)
            ler=a[i];
        }
   printf("%d",ler);
     
        return 0;
}