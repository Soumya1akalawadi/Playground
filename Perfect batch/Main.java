/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void branch_sum(int a[],int n);
int main()
{
  //Type your code here
  int n,a[50],i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  branch_sum(a,n);
  
  return 0;
}
void branch_sum(int a[],int n)
{
  int i,br1=0,br2=0;
  for(i=0;i<(n/2);i++)
  {
    br1=br1+a[i];
  }
   for(i=n/2;i<n;i++)
  {
    br2=br2+a[i];
  }
  if(br1==br2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
}