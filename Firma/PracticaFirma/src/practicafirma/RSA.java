package practicafirma;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jafet y Hommie
 */
public class RSA {
    public PrivateKey privatekey;
    public PublicKey publickey;
 
     public   void setPrivateKey(String key) throws NoSuchAlgorithmException, InvalidKeySpecException{
        byte[] encodedPrivateKey = string_Bytes(key);  
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
        privatekey = privateKey;
        
    }
 
    public void setPublicKeyString(String key) throws NoSuchAlgorithmException, InvalidKeySpecException{   
        byte[] encodedPublicKey = string_Bytes(key);  
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
        publickey = publicKey;
    }
 
    public String getPrivateKeyString(){
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privatekey.getEncoded());
        return bytes_String(pkcs8EncodedKeySpec.getEncoded());
    }
 
    public String getPublicKeyString(){
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publickey.getEncoded());
        return bytes_String(x509EncodedKeySpec.getEncoded());
    }
     
     
    public void genKeyPair(int size) throws NoSuchAlgorithmException,NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException  {
         
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(size);
        KeyPair kp = kpg.genKeyPair();
         
        PublicKey publicKey = kp.getPublic();
        PrivateKey privateKey = kp.getPrivate();
         
        privatekey = privateKey;
        publickey = publicKey;
      
        
        JOptionPane.showMessageDialog(null,"The Keys have been generated correctly.");
        
    }
 
    public String EncryptRSA(String plain, String key) throws NoSuchAlgorithmException,NoSuchPaddingException, InvalidKeyException,IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException, UnsupportedEncodingException, NoSuchProviderException, IOException {
        byte[] encryptedBytes; 
        Cipher cipher = Cipher.getInstance("RSA");
        if(key.equals("public")){
            cipher.init(Cipher.ENCRYPT_MODE, publickey);
        }else if(key.equals("private")){
            cipher.init(Cipher.ENCRYPT_MODE, privatekey);
        }
        encryptedBytes = cipher.doFinal(plain.getBytes());
        JOptionPane.showMessageDialog(null,"The text have been encrypted.");
       // System.out.println("Texto cifrado:\n"+bytes_String(encryptedBytes));
        return bytes_String(encryptedBytes);
    }
 
    public String DecryptRSA(String result, String key) throws NoSuchAlgorithmException,NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
        System.out.println(result);
   
   byte[] decryptedBytes;
        Cipher cipher = Cipher.getInstance("RSA");
        if(key.equals("private")){
            cipher.init(Cipher.DECRYPT_MODE, privatekey);
        }else if(key.equals("public")){
            cipher.init(Cipher.DECRYPT_MODE, publickey);
        }
        decryptedBytes = cipher.doFinal(string_Bytes(result));
        JOptionPane.showMessageDialog(null,"The text have been decrypted.");
        return new String(decryptedBytes);
    }
    
      public String DecryptRSA(String result) throws NoSuchAlgorithmException,NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        System.out.println(result);
        byte[] decryptedBytes;
 
        Cipher cipher = Cipher.getInstance("RSA");
      //  cipher.init(Cipher.DECRYPT_MODE, privatekey);
        cipher.init(Cipher.DECRYPT_MODE, publickey);
        decryptedBytes = cipher.doFinal(string_Bytes(result));
        JOptionPane.showMessageDialog(null,"The text have been decrypted.");
        System.out.println("Texto decifrado:\n"+decryptedBytes);
        return new String(decryptedBytes);
    }
    
      
 
    public static String bytes_String(byte[] b) {
        byte[] b2 = new byte[b.length + 1];
        b2[0] = 1;
        System.arraycopy(b, 0, b2, 1, b.length);
        return new BigInteger(b2).toString(36);
    }
 
    public static byte[] string_Bytes(String s) {
        byte[] b2 = new BigInteger(s, 36).toByteArray();
        return Arrays.copyOfRange(b2, 1, b2.length);
    }
 
 
    public void savePrivateKey(String path) throws IOException {
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            out.write(this.getPrivateKeyString());
            out.close();
        } catch (Exception e) {
        }
    }
     
    public void savePublicKey(String path) {
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            out.write(this.getPublicKeyString());
            out.close();
        } catch (Exception e) {
        
        }
    }
 
    public void open_PublicKey(String path) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFile(path);
        this.setPublicKeyString(content);
    }
     
    public void open_PrivateKey(String path) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFile(path);
        this.setPrivateKey(content);
    }
     
     
    private String readFile(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
    
}
