
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico Laptop
 */
public class Menu extends javax.swing.JFrame {
JFileChooser seleccionar=new JFileChooser();
File archivo;
FileInputStream entrada;
FileOutputStream salida;
String Mensaje;
String Cifrado;
String Decifrado;
int num_saltos;//corrimiento
   
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 public void Resetear(){
 Mensaje=null;
 Cifrado=null;
 Decifrado=null;
 num_saltos=0;
 }
 
 public void Set_num_saltos(){
 int corrimiento=Integer.parseInt(jcorrimiento.getText());
 if(corrimiento>=26){
 JOptionPane.showMessageDialog(null,"Shift equals to: "+Cesar_Algoritmo.SaltoEquivalente(corrimiento,26)+" shifts");
 num_saltos=Cesar_Algoritmo.SaltoEquivalente(corrimiento,26);
 }
 else{
 num_saltos=corrimiento;
 }
}
 
 public int Get_num_saltos(){
 return num_saltos;
 }
 public void SetMensaje(){
  Mensaje=jTextArea2.getText();
 }
 public String GetMensaje(){
 return Mensaje;
 }
 
 public void SetCifrado(){
 Cifrado=Cesar_Algoritmo.Cifrado(Mensaje,num_saltos, 26);
 }
 
public String GetCifrado(){
return Cifrado;
}

 public void SetDecifrado(){
 Decifrado=Cesar_Algoritmo.Decifrado(Mensaje,num_saltos, 26);
 }
 
 public String GetDecifrado(){
 return Decifrado;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jbtnabrir = new javax.swing.JButton();
        jbtnguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jcifrar = new javax.swing.JRadioButton();
        jdecifrar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jcorrimiento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnabrir.setText("OPEN FILE");
        jbtnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnabrirActionPerformed(evt);
            }
        });

        jbtnguardar.setText("Save file Encrypt/Decrypt");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jcifrar.setText("Encrypt");
        jcifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcifrarActionPerformed(evt);
            }
        });

        jdecifrar.setText("Decrypt");
        jdecifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdecifrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Shift");

        jcorrimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcorrimientoActionPerformed(evt);
            }
        });

        jLabel2.setText("CESAR ALGORITHM");

        jButton2.setText("DEBUG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcifrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jdecifrar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcorrimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jbtnguardar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnabrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnabrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcorrimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jcifrar)
                        .addGap(18, 18, 18)
                        .addComponent(jdecifrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbtnguardar)
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String AbrirArchivo(File archivo){
  String documento="";
  try{
   entrada= new FileInputStream(archivo);
   int ascci;
   while((ascci=entrada.read())!=-1){
     char caracter=(char)ascci;
     documento+=caracter;
   }
  }
  catch(Exception e){
  }
  return documento;
}

public String GuardarArchivo(File archivo, String documento){
String mensaje="";
  try{
  salida=new FileOutputStream(archivo);
  byte[] bytxt=documento.getBytes();
  salida.write(bytxt);
  mensaje+="Archivo guardado";
   }catch(Exception e){
   mensaje+="Error no se pudo guardar el archivo";
   }
   return mensaje;
}
    
    
    private void jbtnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnabrirActionPerformed
     if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
       archivo=seleccionar.getSelectedFile();
         System.out.println(archivo);
       if(archivo.canRead()){
          if(archivo.getName().endsWith("txt")){
          String documento=AbrirArchivo(archivo);
          jTextArea2.setText(documento);
          }
          else{
          JOptionPane.showMessageDialog(null,"Archivo No Compatible");
          }
        }
     }
    }//GEN-LAST:event_jbtnabrirActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
    if(seleccionar.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION){
       archivo=seleccionar.getSelectedFile();
       String documento="";
       if(archivo.getName().endsWith("txt")){
            if(jcifrar.isSelected()){
             documento=GetCifrado();
            }
            else if(jdecifrar.isSelected()){
             documento=GetDecifrado();
            }
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

    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jcifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcifrarActionPerformed
    SetMensaje();
    Set_num_saltos();
    SetCifrado();
    }//GEN-LAST:event_jcifrarActionPerformed

    private void jdecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdecifrarActionPerformed
    SetMensaje();
    Set_num_saltos();
    SetDecifrado();
    
    }//GEN-LAST:event_jdecifrarActionPerformed

    private void jcorrimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcorrimientoActionPerformed
     
    }//GEN-LAST:event_jcorrimientoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     jTextArea2.setText("");
     jcorrimiento.setText("");
     jcifrar.setSelected(false);
     jdecifrar.setSelected(false);
     Resetear();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton jbtnabrir;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JRadioButton jcifrar;
    private javax.swing.JTextField jcorrimiento;
    private javax.swing.JRadioButton jdecifrar;
    // End of variables declaration//GEN-END:variables
}
