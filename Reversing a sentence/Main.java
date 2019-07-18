#include<stdio.h>
int main()
{
  // Type your code here
  char str[200],res[200];
  int i,s,e,l,x;

  gets(str);
  l=strlen(str);
    x=0;
  s=l-1;
  e=l-1;
  while(s>0)
  {
    if(str[s]==' ')
    {
      i=s+1;
      while(i<=e)
      {
        res[x]=str[i];
        i++;
        x++;
      }
      res[x++]=' ';
      e=s-1;
    }
    s--;
  }
  for(i=0;i<=e;i++)
  {
    res[x]=str[i];
    x++;
  }
  res[x]='\0';
  printf("%s",res);
  
    
  return 0;
}