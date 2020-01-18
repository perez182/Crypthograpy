package practicafirma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static practicafirma.Mensaje.hash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jafet
 */
public class JFrame extends javax.swing.JFrame {
        JFileChooser seleccionar=new JFileChooser();
        File archivo;
        FileInputStream entrada;
        FileOutputStream salida;
    
        String PrivateKey = "";
        String PublicKey = "";
        String AESKey = "";
        String AESText = "";
        String Text = "";
        String unsecureRSAFinal = "";
        String hashFinal = "";
        RSA rsa = new RSA();
    public JFrame() {
        initComponents();
        jButtonPrivateKey.setVisible(false);
        jButtonPublicKey.setVisible(false);
        jTextFieldTexto.setVisible(false);
        jTextArea.setVisible(false);
        jButtonOkVerification.setVisible(false);
        jButtonOkSignature.setVisible(false);
        jButtonSave.setVisible(false);
        jButtonOpen.setVisible(false);
        jButtonAESKey.setVisible(false);
    }
    
    public String AbrirArchivo(File archivo){
    String documento="";
    try{
        entrada= new FileInputStream(archivo);
        int ascci;
        while((ascci=entrada.read())!=-1){
            char caracter=(char)ascci;
            documento+=caracter;
        }
    }catch(Exception e){
    }
    return documento;
    }   

public String GuardarArchivo(File archivo, String documento){
    String mensaje="";
    try{
        salida=new FileOutputStream(archivo);
        byte[] bytxt=documento.getBytes();
        salida.write(bytxt);
        mensaje+="Save File";
    }catch(Exception e){
        mensaje+="Save File Error";
   }
   return mensaje;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxOptions = new javax.swing.JComboBox<>();
        jButtonPrivateKey = new javax.swing.JButton();
        jButtonPublicKey = new javax.swing.JButton();
        jTextFieldTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonOkSignature = new javax.swing.JButton();
        jButtonOkVerification = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jButtonAESKey = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Signature / Verification");

        jComboBoxOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option..", "Signature", "Verification" }));
        jComboBoxOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOptionsActionPerformed(evt);
            }
        });

        jButtonPrivateKey.setText("Choose PrivateKey");
        jButtonPrivateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrivateKeyActionPerformed(evt);
            }
        });

        jButtonPublicKey.setText("Choose PublicKey");
        jButtonPublicKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPublicKeyActionPerformed(evt);
            }
        });

        jTextFieldTexto.setText("Text to Encrypt or Decrypt");
        jTextFieldTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTextoActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jButtonOkSignature.setText("Signature Message");
        jButtonOkSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkSignatureActionPerformed(evt);
            }
        });

        jButtonOkVerification.setText("Verification Message");
        jButtonOkVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkVerificationActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save encrypt/decrypt message");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonOpen.setText("Open Message");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });

        jButtonAESKey.setText("Choose AESKey");
        jButtonAESKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAESKeyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSave)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOkVerification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOkSignature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPrivateKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPublicKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAESKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrivateKey)
                    .addComponent(jButtonOpen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPublicKey)
                    .addComponent(jButtonOkSignature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOkVerification)
                    .addComponent(jButtonAESKey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSave)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOptionsActionPerformed
        // TODO add your handling code here:
        String opcion = (String) jComboBoxOptions.getSelectedItem();
            switch (opcion) {
                case "Signature":
                    jButtonPrivateKey.setVisible(true);
                    jButtonPublicKey.setVisible(true);
                    jTextFieldTexto.setVisible(true);
                    jButtonOkVerification.setVisible(false);
                    jButtonOkSignature.setVisible(true);
                    jButtonAESKey.setVisible(false);
                    jTextArea.setVisible(true);
                    jButtonSave.setVisible(true);
                    jButtonOpen.setVisible(true);
                    jButtonSave.setText("Save Signature Message");
                    break;
                case "Verification":
                    jButtonPrivateKey.setVisible(true);
                    jButtonPublicKey.setVisible(true);
                    jTextFieldTexto.setVisible(true);
                    jButtonOkVerification.setVisible(true);
                    jButtonOkSignature.setVisible(false);
                    jButtonAESKey.setVisible(true);
                    jTextArea.setVisible(true);
                    jButtonSave.setVisible(true);
                    jButtonOpen.setVisible(true);
                    jButtonSave.setText("Save Verification Message");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Select a correct option");
                    break;
            }
    }//GEN-LAST:event_jComboBoxOptionsActionPerformed

    private void jButtonPrivateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrivateKeyActionPerformed
        // TODO add your handling code here:
        PrivateKey = Ruta.ruta();
        JOptionPane.showMessageDialog(null, "The private key has been successfully opened");
    }//GEN-LAST:event_jButtonPrivateKeyActionPerformed

    private void jTextFieldTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTextoActionPerformed
      jTextFieldTexto.setText("");
    }//GEN-LAST:event_jTextFieldTextoActionPerformed

    private void jButtonPublicKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPublicKeyActionPerformed
        // TODO add your handling code here:
        PublicKey = Ruta.ruta();
        JOptionPane.showMessageDialog(null, "The public key has been successfully opened");
    }//GEN-LAST:event_jButtonPublicKeyActionPerformed

    private void jButtonOkSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkSignatureActionPerformed
        // TODO add your handling code here:
        String secureAES;
        String text = jTextFieldTexto.getText();
        String hashtext = hash(text);
            try {
                Ruta.saveFile(hashtext, "hash.txt");
                rsa.open_PrivateKey(PrivateKey); //Privada de Alicia
                rsa.open_PublicKey(PublicKey); //Publica de Betito
                secureAES = CFB.encryptAES(text);
                System.out.println("Texto cifrado:"+secureAES);
                String secureRSA = rsa.EncryptRSA(hashtext, "private");
                jTextArea.setText(secureAES+"///"+secureRSA);
               AESText = Ruta.readFile("C:\\Users\\Federico Laptop\\Desktop\\5semestre\\Crypthograpy\\Firma\\PracticaFirma\\AESKey.txt");
               String Ckey = rsa.EncryptRSA(AESText, "public");
               Ruta.saveFile(Ckey, "Ckey.txt");
            } catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchProviderException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonOkSignatureActionPerformed

    private void jButtonOkVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkVerificationActionPerformed
        // TODO add your handling code here:
        String text = jTextFieldTexto.getText();
        String unsecureAES = Mensaje.msjCifrado(text, 1);
        String unsecureRSA = Mensaje.msjCifrado(text, 2);
            try {
                rsa.open_PublicKey(PublicKey); //Publica de Alicia
                rsa.open_PrivateKey(PrivateKey); //Privada de betito  
                System.out.println("digesto:"+unsecureRSA); 
                unsecureRSAFinal = rsa.DecryptRSA(unsecureRSA,"public");
                System.out.println("Hash: "+unsecureRSAFinal);
               
                String unsecureKey = rsa.DecryptRSA(AESText, "private");
                String Key = Mensaje.msjCifrado(unsecureKey, 1);
                String IV = Mensaje.msjCifrado(unsecureKey, 2);
                System.out.println("Key: "+Key+"\nIV:"+IV);
                String unsecureText;
                unsecureText = CFB.decryptAES(unsecureAES, Key, IV);
                System.out.println("Texto descifrado: "+unsecureText);
                jTextArea.setText(unsecureText);
                hashFinal = Mensaje.hash(unsecureText);
              
              
            if(unsecureRSAFinal.equals(hashFinal))
                JOptionPane.showMessageDialog(null, "The message was verified correctly and is True!!"); 
            else
                 JOptionPane.showMessageDialog(null, "WARNING! \n The message has been modified!!"); 
            } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | InvalidKeySpecException | UnsupportedEncodingException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                    JOptionPane.showMessageDialog(null, "WARNING! \n The message is false!!"); 
            } catch (IOException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButtonOkVerificationActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
      if(seleccionar.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION){
       archivo=seleccionar.getSelectedFile();
       String documento="";
       if(archivo.getName().endsWith("txt")){ 
            documento=jTextArea.getText();
            
            String mensaje=GuardarArchivo(archivo,documento);
            if(mensaje!=null){
            JOptionPane.showMessageDialog(null, mensaje);
            }else{
            JOptionPane.showMessageDialog(null,"Archivo No Compatible");
            }
        }else{
        JOptionPane.showMessageDialog(null,"Guardar Documento de Texto");
       }  
    }
     
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenActionPerformed
      if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
       archivo=seleccionar.getSelectedFile();
       if(archivo.canRead()){
          if(archivo.getName().endsWith("txt")){
          String documento=AbrirArchivo(archivo);
          jTextFieldTexto.setText(documento);
          }
          else{
          JOptionPane.showMessageDialog(null,"Archivo No Compatible");
          }
        }
     }
    }//GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonAESKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAESKeyActionPerformed
        // TODO add your handling code here:
        AESKey = Ruta.ruta();
        JOptionPane.showMessageDialog(null, "The AES key has been successfully opened");
            try {
                AESText = Ruta.readFile(AESKey);
            } catch (IOException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonAESKeyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAESKey;
    private javax.swing.JButton jButtonOkSignature;
    private javax.swing.JButton jButtonOkVerification;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonPrivateKey;
    private javax.swing.JButton jButtonPublicKey;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldTexto;
    // End of variables declaration//GEN-END:variables
}
