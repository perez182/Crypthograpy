/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafirma;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author jafet
 */
public class CBC {

    private Cipher encryptCBCDES;
    private Cipher decryptCBCDES;
    private SecretKey key;
    private IvParameterSpec IV;

    

    public SecretKey generateKey(String stringKey, String cipher) throws Exception{
        SecretKeyFactory skf = SecretKeyFactory.getInstance(cipher);
        DESKeySpec kspec = new DESKeySpec(stringKey.getBytes());
        SecretKey ks = skf.generateSecret(kspec);
        return ks;
    }
    
    public static String encrypt(String text) throws Exception {
        String key = "secreto123456789";
        String iv = "0123456789ABCDEF";
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] encryptedBlock; // bytes que van a escribir
        encryptedBlock = cipher.doFinal(text.getBytes());
        Ruta.saveFile(key+"///"+iv, "AESKey.txt");
        return RSA.bytes_String(encryptedBlock);
    }
    
    public static String decrypt(String text) throws Exception {
        String key= "secreto123456789";
        String iv = "0123456789ABCDEF";
            byte[] decryptedBlock;
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
            decryptedBlock = cipher.doFinal(text.getBytes());
            return RSA.bytes_String(decryptedBlock);
            
        }


    
}
