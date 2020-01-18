/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafirma;


import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

/**
 *
 * @author jafet
 */
public class Mensaje {
    
    
    public static String msjCifrado(String mensaje, int parte){
        String partes[];
        partes = mensaje.split("///");
        if(parte == 1)
            return partes[0];
        else
            return partes[1];
    }
    
    public static String hash(String mensaje){
        String hash;
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-1"); 
            byte[] messageDigest = md.digest(mensaje.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            hash = no.toString(16); 
            while (hash.length() < 32) { 
                hash = "0" + hash; 
            } 
            return hash; 
        } catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        }
    }
    
}
