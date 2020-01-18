/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafirma;
import java.math.BigInteger;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author jafet
 */
public class CFB {
    
    public SecretKey generateKey(String stringKey) throws Exception{
            SecretKeyFactory skf = SecretKeyFactory.getInstance("AES");
            DESKeySpec kspec = new DESKeySpec(stringKey.getBytes());
            SecretKey ks = skf.generateSecret(kspec);
            return ks;
    }
    
    public static String encryptAES(String  inFile) throws Exception {
        String key= CFB.generateRandomText();
        String iv = "0123456789ABCDEF";
        SecretKey skeySpec = new SecretKeySpec(key.getBytes(),"AES");
        IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
        Cipher ci = Cipher.getInstance("AES/CFB/PKCS5Padding");
        ci.init(Cipher.ENCRYPT_MODE, skeySpec, ivspec);
        byte[] cifrado = ci.doFinal(inFile.getBytes());
        Ruta.saveFile(key+"///"+iv, "AESKey.txt");
       
        return RSA.bytes_String(cifrado);
    }
    
    
   public static String decryptAES(String inFile, String key, String iv) throws Exception {
        byte[] decryptedBytes;
        SecretKey skeySpec = new SecretKeySpec(key.getBytes(),"AES");
        IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
        Cipher ci = Cipher.getInstance("AES/CFB/PKCS5Padding");
        ci.init(Cipher.DECRYPT_MODE, skeySpec, ivspec);        
        decryptedBytes = ci.doFinal(RSA.string_Bytes(inFile));
        
        return new String(decryptedBytes);
    
    }
   
   public static String generateRandomText() {
    SecureRandom random = new SecureRandom();
    String text = new BigInteger(64, random).toString(16);
    return text;
    }
    
}

