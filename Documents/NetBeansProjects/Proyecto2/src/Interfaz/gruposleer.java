/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fcast
 */
public class gruposleer extends javax.swing.JFrame {

    /**
     * Creates new form gruposleer
     */
    public gruposleer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaver = new javax.swing.JTextArea();
        ver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Desea ver los grupos?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 100));

        areaver.setColumns(20);
        areaver.setRows(5);
        jScrollPane1.setViewportView(areaver);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 520, 330));

        ver.setBackground(new java.awt.Color(153, 255, 255));
        ver.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ver.setText("Ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 471, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
          JFileChooser fc=new  JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tex="";
            String line="";
            while(((line=br.readLine())!=null)){
                tex+=line+"\n";
                
            }
            areaver.setText(tex);
            JOptionPane.showMessageDialog(null,"su archivo ha sido correctamente leido");
        }
        catch(Exception e){
            
        }
            
        
        
        
        
    }//GEN-LAST:event_verActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AGRUPACIONES form=new AGRUPACIONES(); 
         form.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gruposleer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gruposleer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gruposleer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gruposleer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gruposleer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
