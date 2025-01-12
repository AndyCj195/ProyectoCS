package Vista;
import java.awt.*;
import javax.swing.*;
import BDD.conexion;

public class ProductoPanel extends javax.swing.JPanel {
    private conexion con;
    
    public ProductoPanel() {
        initComponents();
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        CambiarFoto();
    }

    @SuppressWarnings("unchecked")
    private void CambiarFoto(){
        jlblFotoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblFotoProducto.setText("");
        jlblFotoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProductosImagenes/1pc-Juego-de-Palabras-de-Alfabeto-de-Pensamiento-Rápido.jpg")));
        jPFoto.add(jlblFotoProducto);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jPFoto = new javax.swing.JPanel();
        jlblFotoProducto = new javax.swing.JLabel();
        jPDetalles = new javax.swing.JPanel();
        jpDet = new javax.swing.JPanel();
        jlblNomProd = new javax.swing.JLabel();
        jlblPrecio = new javax.swing.JLabel();
        jpCarrito = new javax.swing.JPanel();
        btnCarrito = new javax.swing.JPanel();
        lblBtnCarrito = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(300, 300));

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setForeground(new java.awt.Color(255, 255, 255));

        jPFoto.setBackground(new java.awt.Color(255, 255, 255));
        jPFoto.setLayout(new java.awt.GridLayout(1, 0));

        jlblFotoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblFotoProducto.setText("foto");
        jPFoto.add(jlblFotoProducto);

        jlblNomProd.setText("_____________________");

        jlblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblPrecio.setText("_____________________");

        javax.swing.GroupLayout jpDetLayout = new javax.swing.GroupLayout(jpDet);
        jpDet.setLayout(jpDetLayout);
        jpDetLayout.setHorizontalGroup(
            jpDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNomProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jlblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpDetLayout.setVerticalGroup(
            jpDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCarrito.setPreferredSize(new java.awt.Dimension(48, 48));

        lblBtnCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCarrito.png"))); // NOI18N
        lblBtnCarrito.setToolTipText("");
        lblBtnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCarrito.setPreferredSize(new java.awt.Dimension(48, 48));
        lblBtnCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCarritoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBtnCarritoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnCarritoLayout = new javax.swing.GroupLayout(btnCarrito);
        btnCarrito.setLayout(btnCarritoLayout);
        btnCarritoLayout.setHorizontalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBtnCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCarritoLayout.setVerticalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblBtnCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCarritoLayout = new javax.swing.GroupLayout(jpCarrito);
        jpCarrito.setLayout(jpCarritoLayout);
        jpCarritoLayout.setHorizontalGroup(
            jpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCarritoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jpCarritoLayout.setVerticalGroup(
            jpCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCarritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPDetallesLayout = new javax.swing.GroupLayout(jPDetalles);
        jPDetalles.setLayout(jPDetallesLayout);
        jPDetallesLayout.setHorizontalGroup(
            jPDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetallesLayout.createSequentialGroup()
                .addComponent(jpDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPDetallesLayout.setVerticalGroup(
            jPDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPDetallesLayout.createSequentialGroup()
                .addComponent(jpDet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(jPFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnCarritoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCarritoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnCarritoMouseReleased

    private void lblBtnCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCarritoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnCarritoMouseClicked

    
    private void MultiplicarJPanel(){
        JPanel contenedorProducto = new JPanel();
        contenedorProducto.setLayout(new BoxLayout(contenedorProducto, BoxLayout.Y_AXIS));
        //contenedorProducto.setPreferredSize(new Dimension(296,320));
        
        JScrollPane scrollP = new JScrollPane(contenedorProducto);
        scrollP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        for (int i = 1; i <= 10; i++) {
        ProductoPanel productoPanel = new ProductoPanel(); // Instancia del JPanel
        contenedorProducto.add(productoPanel); // Agregar al contenedor principal
        }
        add(scrollP, BorderLayout.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel btnCarrito;
    private javax.swing.JPanel jPDetalles;
    private javax.swing.JPanel jPFoto;
    private javax.swing.JLabel jlblFotoProducto;
    private javax.swing.JLabel jlblNomProd;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JPanel jpCarrito;
    private javax.swing.JPanel jpDet;
    private javax.swing.JLabel lblBtnCarrito;
    // End of variables declaration//GEN-END:variables
}
