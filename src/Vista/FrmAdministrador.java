/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Validacion;
import java.awt.Color;

/**
 *
 * @author Andre
 */
public class FrmAdministrador extends javax.swing.JFrame {

    private Validacion val = new Validacion();
    
    private Color CBarraHorizontal = new Color(242,163,0);
    private Color CMantener = new Color(219,148,0);
    private Color CPulsar = new Color(186,126,0);
    
    public FrmAdministrador() {
        initComponents();
        this.setTitle("Inicio - Administrador");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        BarraTop = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jblAdmin = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        jlblBtnUsuarios = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        jlblBtnProductos = new javax.swing.JLabel();
        bottomBarra = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JPanel();
        jblBtnCerrarSesion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAcercaDe = new javax.swing.JPanel();
        lblBtnAcercaDe = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(794, 650));
        setPreferredSize(new java.awt.Dimension(1159, 714));

        Content.setBackground(new java.awt.Color(240, 240, 201));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );

        BarraLateral.setBackground(new java.awt.Color(242, 163, 0));

        BarraTop.setBackground(new java.awt.Color(242, 163, 0));

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoMorita90x90.png"))); // NOI18N

        jlblNombre.setBackground(new java.awt.Color(255, 255, 255));
        jlblNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombre.setText("______");

        jblAdmin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblAdmin.setText("Administrador");

        javax.swing.GroupLayout BarraTopLayout = new javax.swing.GroupLayout(BarraTop);
        BarraTop.setLayout(BarraTopLayout);
        BarraTopLayout.setHorizontalGroup(
            BarraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraTopLayout.setVerticalGroup(
            BarraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraTopLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jblAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblNombre)
                .addGap(18, 18, 18))
        );

        btnUsuario.setBackground(new java.awt.Color(242, 163, 0));

        jlblBtnUsuarios.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlblBtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jlblBtnUsuarios.setText("Gestionar Usuarios");
        jlblBtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblBtnUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblBtnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblBtnUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUsuarioLayout = new javax.swing.GroupLayout(btnUsuario);
        btnUsuario.setLayout(btnUsuarioLayout);
        btnUsuarioLayout.setHorizontalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblBtnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnUsuarioLayout.setVerticalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblBtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnProductos.setBackground(new java.awt.Color(242, 163, 0));

        jlblBtnProductos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlblBtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        jlblBtnProductos.setText("Gestionar Productos");
        jlblBtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblBtnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblBtnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblBtnProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblBtnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblBtnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bottomBarra.setBackground(new java.awt.Color(242, 163, 0));

        btnCerrarSesion.setBackground(new java.awt.Color(242, 163, 0));

        jblBtnCerrarSesion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jblBtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jblBtnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblBtnCerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblBtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblBtnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jSeparator2.setBackground(new java.awt.Color(110, 14, 10));
        jSeparator2.setForeground(new java.awt.Color(110, 14, 10));

        btnAcercaDe.setBackground(new java.awt.Color(242, 163, 0));

        lblBtnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acercaDe.png"))); // NOI18N

        javax.swing.GroupLayout btnAcercaDeLayout = new javax.swing.GroupLayout(btnAcercaDe);
        btnAcercaDe.setLayout(btnAcercaDeLayout);
        btnAcercaDeLayout.setHorizontalGroup(
            btnAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAcercaDeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnAcercaDe)
                .addGap(0, 0, 0))
        );
        btnAcercaDeLayout.setVerticalGroup(
            btnAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAcercaDeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblBtnAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout bottomBarraLayout = new javax.swing.GroupLayout(bottomBarra);
        bottomBarra.setLayout(bottomBarraLayout);
        bottomBarraLayout.setHorizontalGroup(
            bottomBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomBarraLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        bottomBarraLayout.setVerticalGroup(
            bottomBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomBarraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jSeparator1.setBackground(new java.awt.Color(110, 14, 10));
        jSeparator1.setForeground(new java.awt.Color(110, 14, 10));

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addComponent(BarraTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216)
                .addComponent(bottomBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblBtnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnUsuariosMouseClicked
        val.ShowJPanel(new JPAdmUsuario(), Content, 937, 714);
        setTitle("Inicio - Gestión de Usuarios");
    }//GEN-LAST:event_jlblBtnUsuariosMouseClicked

    private void jlblBtnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnUsuariosMouseEntered
        btnUsuario.setBackground(CMantener);
    }//GEN-LAST:event_jlblBtnUsuariosMouseEntered

    private void jlblBtnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnUsuariosMouseExited
        btnUsuario.setBackground(CBarraHorizontal);
    }//GEN-LAST:event_jlblBtnUsuariosMouseExited

    private void jlblBtnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnProductosMouseClicked
        val.ShowJPanel(new JPAdmProducto(), Content, 937, 714);
        setTitle("Inicio - Gestión de Productos");
    }//GEN-LAST:event_jlblBtnProductosMouseClicked

    private void jlblBtnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnProductosMouseEntered
        btnProductos.setBackground(CMantener);
    }//GEN-LAST:event_jlblBtnProductosMouseEntered

    private void jlblBtnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBtnProductosMouseExited
        btnProductos.setBackground(CBarraHorizontal);
    }//GEN-LAST:event_jlblBtnProductosMouseExited

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
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel BarraTop;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel bottomBarra;
    private javax.swing.JPanel btnAcercaDe;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jblAdmin;
    private javax.swing.JLabel jblBtnCerrarSesion;
    private javax.swing.JLabel jlblBtnProductos;
    private javax.swing.JLabel jlblBtnUsuarios;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel lblBtnAcercaDe;
    // End of variables declaration//GEN-END:variables
}
