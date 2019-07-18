#include<stdio.h>
int main()
{
//Type your code here
         int i, j, a, n, number[30];
        scanf("%d", &n);
        for (i = 0; i < n; ++i)
            scanf("%d", &number[i]);
        int k;
        scanf("%d",&k);
 
        for (i = 0; i < n; ++i) 
        {
 
            for (j = i + 1; j < n; ++j)
            {
 
                if (number[i] > number[j]) 
                {
 
                    a =  number[i];
                    number[i] = number[j];
                    number[j] = a;
 
                }
 
            }
 
        }
  printf("%d",number[n-k]);
return 0;
}