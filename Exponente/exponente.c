#include<stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
//Funciones
unsigned int bms(unsigned char e);

int main(int arg, char *argv[]){
unsigned char i,cont=0;
unsigned int e,bitms,x;
unsigned long long n,b;
b=(unsigned long long)atoi(argv[1]);
e=atoi(argv[2]);
n=(unsigned long long)atoi(argv[3]);
bitms=bms(e);

unsigned char *indices=(unsigned char *)malloc(sizeof(unsigned char)*((log(bitms)/log(2))*2));
unsigned long long *exponentes=(unsigned long long *)malloc(sizeof(unsigned long long)*((log(bitms)/log(2))*2));

x=1;
for(i=bitms;i>=1;i=i>>1,x*=2){
  *(indices+cont)=x;
    cont++;
     if((e&i) && i!=bitms){
     x++; 
     *(indices+cont)=x;
     cont++;
     } 
     if(i==1){
      break;
     }   
  }

 for (unsigned char j = 0; j<cont; j++){
   if(j==0){
   *(exponentes+j)=b%n;
      printf("(%d)",b);
      printf("^%d=%d mod",*(indices+j),b);
      printf("%d =",n);
      printf(" %d \n",*(exponentes+j));
   }
   else if(*(indices+j)%2==0){
   *(exponentes+j)=((*(exponentes+j-1)) * (*(exponentes+j-1))) % n;
      printf("(%d)",b);
      printf("^%d=(%d *",*(indices+j),*(exponentes+j-1));
      printf("%d)mod",*(exponentes+j-1));
      printf("%d =",n);
      printf(" %d \n",*(exponentes+j));
   }
   else if(*(indices+j)%2==1){
   *(exponentes+j)=((*(exponentes+j-1)) * (*(exponentes+0))) % n;
     printf("(%d)",b);
     printf("^%d=(%d *",*(indices+j),*(exponentes+j-1));
     printf("%d)mod",*(exponentes+0));
     printf("%d =",n);
      printf(" %d \n",*(exponentes+j));
   }
 }

  printf("\n\n(%d)",b);
  printf("^%d=",*(indices+cont-1));
  printf(" %d \n",*(exponentes+cont-1));
 
return 0;
}

//Regresa el bit mas significativo de un numero n
unsigned int bms(unsigned char n){
   unsigned int i;
   for(i=1;n>=i;i*=2){
   }

   i=i>>1;
   return i;
}