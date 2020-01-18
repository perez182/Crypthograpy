/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico Laptop
 */
public class Cesar_Algoritmo {
public static String Cifrado(String mensaje,int num_saltos,int num_letras){
String cifrado="";
int ascii;
int c;//
for(int i=0;i<mensaje.length();i++){
 ascii=(int)mensaje.charAt(i);//Guardamos el ascci de cada caracter
    if(ascii<97 || ascii>122){
    cifrado+="";
    }
    else{
       ascii=((int)mensaje.charAt(i))-97;//restamos 97 para que la letra "a" tenga el valor 0 b=1...
       c=((ascii+num_saltos)%num_letras)+97-32;//97 para obtener el valor de la nueva letra en ascii y -32 para que sea en mayusculas
       cifrado+=(char)c;//pasamos el simbolo cifrado
    }    
}
return cifrado;
}

public static int SaltoEquivalente(int num_saltos,int num_letras){
 int salto_eq;//Numero de saltos equivalentes
    if(num_saltos>=num_letras){
    salto_eq=num_saltos%num_letras;
    }else{
    salto_eq= num_saltos;
    }
    return salto_eq;
}

public static String Decifrado(String mensaje,int num_saltos,int num_letras){
String decifrado="";
int inverso_ad;//inverso aditivo
inverso_ad=num_letras-num_saltos;
int ascii;
int p;
int c;

for(int i=0;i<mensaje.length();i++){
 ascii=(int)mensaje.charAt(i)+32;//Guardamos el ascii de cada letra, +32 para que sea en miniscula
 c=ascii-97;//le restamos 97 para que a=0, b=1, c=2...
 p=((c+inverso_ad)%num_letras)+97;//97 para obtener el valor de la letra en ascii
 decifrado+=(char)p;
}
return decifrado;
}

}
