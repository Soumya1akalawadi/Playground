#include <stdio.h>
int main() {
	//Type your code
 int n,i,f,r,sum=0,temp;
  scanf("%d",&n);
        temp=n;
        while(n)
        {
          i=1;f=1;
          r=n%10;
          while(i<=r)
          {
            f=f*i;
            i++;
          }
          sum=sum+f;
          n=n/10;
        }
         if(sum==temp)
        printf("Yes");
        else
        printf("No");
        return 0;
        
          
}