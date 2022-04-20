 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Usuarios.Docente;
import Usuarios.Estudiante;
import UsuariosDao.DocenteDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ListaDocente extends javax.swing.JFrame {
        ArrayList<Docente> est = null;
    /**
     * Creates new form ListaDocente
     */
    public ListaDocente() {
        initComponents();
         setTitle("LISTA DOCENTE"); //titulo de la ventana
        setLocationRelativeTo(null);//ventana en el centro
        this.getContentPane().setBackground(new Color(152, 233, 184));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//LIBERA LA MEMORIA, CIEERRA LA OPERACION
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnayuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("C.C.:");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "C.C.", "NOMBRE(S)", "1er APELLIDO", "2do APELLIDO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnbuscar.setToolTipText("");
        btnbuscar.setMaximumSize(new java.awt.Dimension(524, 520));
        btnbuscar.setMinimumSize(new java.awt.Dimension(524, 520));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        btneditar.setText("ACTUALIZAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ayuda.png"))); // NOI18N
        btnayuda.setToolTipText("");
        btnayuda.setMaximumSize(new java.awt.Dimension(524, 520));
        btnayuda.setMinimumSize(new java.awt.Dimension(524, 520));
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      
        this.buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed
 private void buscar(){
            DocenteDao tdao = new DocenteDao();
                
                
                try {
                if(txtbuscar.getText().isEmpty()){
                    est = tdao.leerDocente();
                }else{
                    est = tdao.leerDocente(Integer.parseInt(txtbuscar.getText().toString()));
                    if(est.size()== 0){
                        JOptionPane.showMessageDialog(this, "NO EXISTE ESTE NÚMERO DE IDENTIFICACIÓN");
                    }
                }
                
                //Se modela la tabla  especificamente colummnas
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("C.C.");
                modelo.addColumn("NOMBRE(S)");
                modelo.addColumn("1er APELLIDO");
                modelo.addColumn("2do APELLIDO");
                modelo.addColumn("CORREO");
               
                for(Docente doc : est){
                    String[] fila = new String[5];// 7 campos
                    fila[0] = String.valueOf(doc.getIdD());
                    fila[1] = doc.getNombresD();
                    fila[2] = doc.getpApellidoD();
                    fila[3] = doc.getsApellidoD();
                    fila[4] = doc.getCorreoD();
                    
                    modelo.addRow(fila);//guarda la estrutura y añade al modelo
                }
                
                tabla.setModel(modelo);
                
                
                
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
            
        }

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

        int indice = tabla.getSelectedRow();
        DocenteDao edao = new DocenteDao();
        Docente doc = new Docente();

        try {
            System.out.println("C.C.: "+tabla.getValueAt(indice, 0).toString());
            doc.setIdD(Integer.parseInt(tabla.getValueAt(indice, 0).toString()));
            doc.setNombresD(tabla.getValueAt(indice, 1).toString());
            doc.setpApellidoD(tabla.getValueAt(indice, 2).toString());
            doc.setsApellidoD(tabla.getValueAt(indice, 3).toString());
            doc.setCorreoD(tabla.getValueAt(indice, 4).toString());


            if (edao.actualizarDocente(doc)){
                JOptionPane.showMessageDialog(this, "SE ACTUALIZÓ CORRECTAMENTE");
                this.buscar();

            }else{
                JOptionPane.showMessageDialog(this, "HA OCURRIDO UN ERROR");
            }

        }catch (Exception e){
            System.out.println("ERROR ACTUALIZANDO DOCENTE: " +e.getMessage() );
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int indice = tabla.getSelectedRow();

        DocenteDao edao = new DocenteDao();
        Docente doc = this.est.get(indice);

        try {
            int resp = JOptionPane.showConfirmDialog(this, "¿ELIMINARÁS AL DOCENTE: "+doc.getNombresD()+" "+doc.getpApellidoD()+"?");//se llama los nombres y apellido de la clase estudiate

            if(resp == JOptionPane.YES_OPTION){
                if(edao.eliminarDocente(doc.getIdD())){
                    JOptionPane.showMessageDialog(this, "SE ELIMINÓ CORRECTAMENTE");
                }else{
                    JOptionPane.showMessageDialog(this, "SE PRESENTÓ UN ERROR AL ELIMINAR A "+doc.getNombresD());
                }
            }else if(resp == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this, "NO SE ELIMINÓ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.buscar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
         JOptionPane.showMessageDialog(this, "RECUERDA LO SIGUIENTE:"
                 + "\nPara consultar a todos los docentes,"
                 + "\nsolo presiona el ícono BUSCAR."
                 +"\n"
                +"\nPara Actualizar debes darle doble clic"
                 + "\nal campo y luego de editarlo llevas el"
                 + "\npuntero a otro campo de la misma fila y"
                 + "\npresionas el botón ACTUALIZAR al final."
                +"\n"
                 +"\nPara Eliminar debes darle clic a la fila"
                 + "\ny presionar el botón ELIMINAR."
                 +"\n");
            
    }//GEN-LAST:event_btnayudaActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
