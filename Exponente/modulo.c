#include<stdio.h>

int main(int arg, char *argv[]){
double x,y,modn;
x=10;
y=4;
modn=(x&(bms(y)-1))-(y&(bms(y)-1)) ;
printf("%d mod %d =%d\n",x,y,modn);
return 0;
}

double bms(double n){
   double i;
   for(i=1;n>=i;i*=2){
   }

   i=i>>1;
   return i;
}