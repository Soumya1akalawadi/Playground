#include <stdio.h>
int greatest(int a, int b, int c){
    if(a>=b && a>=c){
        return a;
    }
 
    else if(b>=a && b>=c){
        return b;
    }
 
    else if(c>=a && c>=b){
        return c;
    }
}
 
void main(){
 
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    int gcd;
    
    for(gcd=greatest(x,y,z); gcd>=1; gcd--){
        if(x%gcd==0 && y%gcd==0 && z%gcd==0){
            break;
        }
    }
    printf("%d\n",gcd);
    
}