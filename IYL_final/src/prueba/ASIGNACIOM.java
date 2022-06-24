package prueba;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Info. Industrial
 */
public class ASIGNACIOM extends javax.swing.JFrame {

    /**
     * Creates new form ASIGNACIOM
     */
    public ASIGNACIOM() {
        initComponents();
    }
    // DEFINICION DE VARIABLES
    String t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;

    //PROCEDIMIENTO DE REGISTRO
    public void Registrar() {
        int sw = 0;
        DataOutputStream fosar = null;
        try {
            while (sw == 0) {
                fosar = new DataOutputStream(new FileOutputStream("D:\\asignacion_est.dat", true));
                fosar.writeUTF(Text.getText());
                fosar.writeUTF(Text1.getText());
                fosar.writeUTF(Text2.getText());
                fosar.writeUTF(Text3.getText());
                fosar.writeUTF(Text4.getText());
                fosar.writeUTF(Text5.getText());
                fosar.writeUTF(Text6.getText());
                fosar.writeUTF(Text7.getText());
                fosar.writeUTF(Text8.getText());
                fosar.writeUTF(Text9.getText());
                fosar.writeUTF(Text10.getText());
                fosar.writeUTF(Text11.getText());
                fosar.writeUTF(Text12.getText());
                fosar.writeUTF(Text13.getText());
                fosar.close();
                sw = 1;
                limpiar();
            }
        } catch (FileNotFoundException fnfe) {
            TextArea.setText("Archivo no encontrado");
        } catch (IOException ioe) {
            TextArea.setText("Error al grabar");
        }
    }
    // LIMPIAR LA PANTALLA    

    public void limpiar() {
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
        Text6.setText("");
        Text7.setText("");
        Text8.setText("");
        Text9.setText("");
        Text10.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        TextArea.setText("");
    }

    public void Ver_registrado() {
        TextArea.setText(" ");
        DataInputStream fis = null;
        String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t;
        try {
            fis = new DataInputStream(new FileInputStream("D:\\asignacion_est.dat"));
            while (true) {
                t = fis.readUTF();
                t1 = fis.readUTF();
                t2 = fis.readUTF();
                t3 = fis.readUTF();
                t4 = fis.readUTF();
                t5 = fis.readUTF();
                t6 = fis.readUTF();
                t7 = fis.readUTF();
                t8 = fis.readUTF();
                t9 = fis.readUTF();
                t10 = fis.readUTF();
                t11 = fis.readUTF();
                t12 = fis.readUTF();
                t13 = fis.readUTF();

                TextArea.append("COD. DE ASIGANCION       :" + "\t" + t);
                TextArea.append("\nPARALELO DE ASIGNACION :" + "\t" + t1);
                TextArea.append("\nCOD. MATERIA 1         :" + "\t" + t2);
                TextArea.append("\nCOD. MATERIA 2         :" + "\t" + t3);
                TextArea.append("\nCOD. MATERIA 3         :" + "\t" + t4);
                TextArea.append("\nCOD. MATERIA 4         :" + "\t" + t5);
                TextArea.append("\nCOD. MATERIA 5         :" + "\t" + t6);
                TextArea.append("\nCOD. MATERIA 6         :" + "\t" + t7);
                TextArea.append("\nCOD. MATERIA 7         :" + "\t" + t8);
                TextArea.append("\nCOD. MATERIA 8         :" + "\t" + t9);
                TextArea.append("\nSEMESTRE               :" + "\t" + t10);
                TextArea.append("\nGESTION                :" + "\t" + t11);
                TextArea.append("\nCOD. AULA              :" + "\t" + t12);
                TextArea.append("\nCOD. DOCENTE           :" + "\t" + t13 + " \n\n");
            }
        } catch (FileNotFoundException fnfe) {
            TextArea.append("Ningun archivo registrado");
        } catch (IOException ioe) {
        }
        try {
            fis.close();
        } catch (IOException ioe) {
            TextArea.append("Error al grabar");
        }
    }
    // ELIMINA UN REGISTRO

    public void Eliminar(String t16) {
        String aux = "";
        DataInputStream wcc = null;
        DataOutputStream Archtemp = null;
        char opcion = 'n';
        int sw = 0;
        try {
            Archtemp = new DataOutputStream(new FileOutputStream("D:\\noe.dat"));
            wcc = new DataInputStream(new FileInputStream("D:\\asignacion_est.dat"));
            aux = Text15.getText();
            sw = 0;
            while (true) {
                t1 = wcc.readUTF();
                t2 = wcc.readUTF();
                t3 = wcc.readUTF();
                t4 = wcc.readUTF();
                t5 = wcc.readUTF();
                t6 = wcc.readUTF();
                t7 = wcc.readUTF();
                t8 = wcc.readUTF();
                t9 = wcc.readUTF();
                t10 = wcc.readUTF();
                t11 = wcc.readUTF();
                t12 = wcc.readUTF();
                t13 = wcc.readUTF();
                t14 = wcc.readUTF();

                if (aux.compareTo(t1) != 0) {
                    Archtemp.writeUTF(t1);
                    Archtemp.writeUTF(t2);
                    Archtemp.writeUTF(t3);
                    Archtemp.writeUTF(t4);
                    Archtemp.writeUTF(t5);
                    Archtemp.writeUTF(t6);
                    Archtemp.writeUTF(t7);
                    Archtemp.writeUTF(t8);
                    Archtemp.writeUTF(t9);
                    Archtemp.writeUTF(t10);
                    Archtemp.writeUTF(t11);
                    Archtemp.writeUTF(t12);
                    Archtemp.writeUTF(t13);
                    Archtemp.writeUTF(t14);

                } else {
                    sw = 1;
                }
            }
        } catch (IOException variablerror) {
        }
        try {
            wcc.close();
            Archtemp.close();
            if (sw == 1) {
                File file1 = new File("D:\\asignacion_est.dat");
                File file2 = new File("D:\\noe.dat");
                if (file1.exists()) {
                    file1.delete();
                }
                file2.renameTo(file1);
            }
            TextArea.setText("Eliminado el Registro:  " + aux);
        } catch (IOException variablerror) {
            TextArea.setText("Error!");
        }
    }
    // MODIFICAR LOS DATOS

    public void Modificar() {
        String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t;
        int sw = 0;
        char opcion = 'n';
        DataInputStream wcc = null;
        DataOutputStream Archtemp = null;
        try {
            Archtemp = new DataOutputStream(new FileOutputStream("D:\\no.dat"));
            wcc = new DataInputStream(new FileInputStream("D:\\asignacion_est.dat"));
            String codi = Text14.getText();
            sw = 0;
            while (true) {
                t = wcc.readUTF();
                t1 = wcc.readUTF();
                t2 = wcc.readUTF();
                t3 = wcc.readUTF();
                t4 = wcc.readUTF();
                t5 = wcc.readUTF();
                t6 = wcc.readUTF();
                t7 = wcc.readUTF();
                t8 = wcc.readUTF();
                t9 = wcc.readUTF();
                t10 = wcc.readUTF();
                t11 = wcc.readUTF();
                t12 = wcc.readUTF();
                t13 = wcc.readUTF();

                if (codi.compareTo(t) == 0) {
                    t = Text.getText();
                    t1 = Text1.getText();
                    t2 = Text2.getText();
                    t3 = Text3.getText();
                    t4 = Text4.getText();
                    t5 = Text5.getText();
                    t6 = Text6.getText();
                    t7 = Text7.getText();
                    t8 = Text8.getText();
                    t9 = Text9.getText();
                    t10 = Text10.getText();
                    t11 = Text11.getText();
                    t12 = Text12.getText();
                    t13 = Text13.getText();
                }
                Archtemp.writeUTF(t);
                Archtemp.writeUTF(t1);
                Archtemp.writeUTF(t2);
                Archtemp.writeUTF(t3);
                Archtemp.writeUTF(t4);
                Archtemp.writeUTF(t5);
                Archtemp.writeUTF(t6);
                Archtemp.writeUTF(t7);
                Archtemp.writeUTF(t8);
                Archtemp.writeUTF(t9);
                Archtemp.writeUTF(t10);
                Archtemp.writeUTF(t11);
                Archtemp.writeUTF(t12);
                Archtemp.writeUTF(t13);

            }
        } catch (IOException variablerror) {
        }
        try {
            wcc.close();
            Archtemp.close();
            File file1 = new File("D:\\asignacion_est.dat");
            File file2 = new File("D:\\no.dat");
            if (file1.exists()) {
                file1.delete();
            }
            file2.renameTo(file1);
        } catch (IOException varablerror) {
            TextArea.setText("Error!");
        }
    }
    //  BUSCAR UN REGISTRO

    public void Buscar(String t16) {
        limpiar();
        int sw = 0;
        DataInputStream fis = null;
        try {
            fis = new DataInputStream(new FileInputStream("D:\\asignacion_est.dat"));
            String codigo = t16;
            while (true && sw == 0) {
                t1 = fis.readUTF();
                t2 = fis.readUTF();
                t3 = fis.readUTF();
                t4 = fis.readUTF();
                t5 = fis.readUTF();
                t6 = fis.readUTF();
                t7 = fis.readUTF();
                t8 = fis.readUTF();
                t9 = fis.readUTF();
                t10 = fis.readUTF();
                t11 = fis.readUTF();
                t12 = fis.readUTF();
                t13 = fis.readUTF();
                t14 = fis.readUTF();

                if (t1.compareTo(codigo) == 0) {
                    TextArea.append("COD. DE ASIGANCION       :" + "\t" + t1);
                    TextArea.append("\nPARALELO DE ASIGNACION :" + "\t" + t2);
                    TextArea.append("\nCOD. MATERIA 1         :" + "\t" + t3);
                    TextArea.append("\nCOD. MATERIA 2         :" + "\t" + t4);
                    TextArea.append("\nCOD. MATERIA 3         :" + "\t" + t5);
                    TextArea.append("\nCOD. MATERIA 4         :" + "\t" + t6);
                    TextArea.append("\nCOD. MATERIA 5         :" + "\t" + t7);
                    TextArea.append("\nCOD. MATERIA 6         :" + "\t" + t8);
                    TextArea.append("\nCOD. MATERIA 7         :" + "\t" + t9);
                    TextArea.append("\nCOD. MATERIA 8         :" + "\t" + t10);
                    TextArea.append("\nSEMESTRE               :" + "\t" + t11);
                    TextArea.append("\nGESTION                :" + "\t" + t12);
                    TextArea.append("\nCOD. AULA              :" + "\t" + t13);
                    TextArea.append("\nCOD. DOCENTE           :" + "\t" + t14 + " \n\n");
                    sw = 1;
                }
            }
        } catch (FileNotFoundException fnfe) {
            TextArea.append("Archivo no encontrado");
        } catch (IOException ioe) {
        }
        try {
            fis.close();
        } catch (IOException ioe) {
        }
        if (sw == 0) {
            TextArea.setText("El Registro con este codigo no existe:  " + t16);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();
        Text1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Text2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        Text5 = new javax.swing.JTextField();
        Text6 = new javax.swing.JTextField();
        Text7 = new javax.swing.JTextField();
        Text8 = new javax.swing.JTextField();
        Text9 = new javax.swing.JTextField();
        Text10 = new javax.swing.JTextField();
        Text11 = new javax.swing.JTextField();
        Text12 = new javax.swing.JTextField();
        Text13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Text14 = new javax.swing.JTextField();
        Text15 = new javax.swing.JTextField();
        Text16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("COD_ MATERIA 5");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 269, -1, -1));

        jLabel9.setText("COD_ MATERIA 6");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 269, -1, -1));

        jLabel10.setText("COD_ MATERIA 7");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 269, -1, -1));

        jLabel11.setText("COD. MATERIA 8");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 350, -1, -1));

        jLabel12.setText("SEMESTRE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 350, -1, -1));

        jLabel13.setText("GESTION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 350, -1, -1));

        jLabel14.setText("COD. AULA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 442, -1, -1));

        jLabel15.setText("COD. DOCENTE");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 442, -1, -1));
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 131, 181, -1));

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });
        getContentPane().add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 131, 101, -1));

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setText("ASIGNACION DE MATERIAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel2.setText("COD. AST. ASIGNACION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 96, -1, -1));

        jLabel3.setLabelFor(this);
        jLabel3.setText("PARALELO ASIGNACION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 96, -1, -1));

        jLabel4.setText("COD_ MATERIA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 30));

        jLabel5.setText("COD_MATTERIA 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 173, -1, -1));

        jLabel6.setText("COD_ MATERIA 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 173, -1, -1));

        jLabel7.setText("COD_ MATERIA 4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 173, -1, -1));
        getContentPane().add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 131, 93, -1));
        getContentPane().add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 225, 181, -1));
        getContentPane().add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 225, 93, -1));
        getContentPane().add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 225, 101, -1));
        getContentPane().add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 307, 101, -1));
        getContentPane().add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 307, 101, -1));
        getContentPane().add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 307, 95, -1));
        getContentPane().add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 398, 119, -1));
        getContentPane().add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 398, 119, -1));
        getContentPane().add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 398, 119, -1));
        getContentPane().add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 493, 101, -1));
        getContentPane().add(Text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 493, 93, -1));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 148, 384, 324));

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 490, -1, -1));

        jButton2.setText("VER REGISTRO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 490, -1, -1));

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 646, -1, -1));

        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 548, -1, -1));

        jButton6.setText("LIMPIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 608, -1, -1));

        jButton7.setText("SALIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 608, -1, -1));
        getContentPane().add(Text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 93, -1));
        getContentPane().add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 100, -1));
        getContentPane().add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 90, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FB_IMG_1648774423890.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ver_registrado();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String t14 = Text14.getText();
        Modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String t15 = Text16.getText();
        Buscar(t15);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String t16 = Text15.getText();
        Eliminar(t16);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        hide();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ASIGNACIOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASIGNACIOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASIGNACIOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASIGNACIOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASIGNACIOM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text10;
    private javax.swing.JTextField Text11;
    private javax.swing.JTextField Text12;
    private javax.swing.JTextField Text13;
    private javax.swing.JTextField Text14;
    private javax.swing.JTextField Text15;
    private javax.swing.JTextField Text16;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JTextField Text5;
    private javax.swing.JTextField Text6;
    private javax.swing.JTextField Text7;
    private javax.swing.JTextField Text8;
    private javax.swing.JTextField Text9;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
