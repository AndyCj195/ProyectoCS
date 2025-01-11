/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import Controlador.CtrlProducto;

public class PanelProducto extends JPanel {

    private CtrlProducto ctrlProd;
    private String nombreProducto = "";
    
    public PanelProducto() {
        setLayout(new BorderLayout());
        componentes();
    }

    public void componentes() {
        JPanel panelP = new JPanel();
        panelP.setLayout(new BoxLayout(panelP, BoxLayout.Y_AXIS));
        
        JScrollPane scrollP = new JScrollPane(panelP);
        scrollP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Crear un máximo de 10 paneles de productos
        for (int i = 1; i <= 10; i++) {
            String rutaImagen = "/ProductosImagenes/producto" + i + ".jpg"; // Ruta de la imagen
            JPanel productoPanel = CrearPanelProducto(i, rutaImagen);
            panelP.add(productoPanel);
        }
        
        add(scrollP, BorderLayout.CENTER);
    }

    private JPanel CrearPanelProducto(int idProducto, String rutaImagen) {
        // Crear panel individual del producto
        JPanel panelP = new JPanel();
        panelP.setLayout(new BorderLayout());
        panelP.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borde del panel
        panelP.setPreferredSize(new Dimension(600, 150));
        
        // Etiqueta para la imagen
        JLabel productoImg = new JLabel();
        productoImg.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borde del panel
        productoImg.setPreferredSize(new Dimension(150, 150));
        
        // Cargar la imagen desde la ruta establecida
        File img = new File(rutaImagen);
        if (img.exists()) {
            ImageIcon icono = new ImageIcon(rutaImagen);
            Image imagenEscalable = icono.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            productoImg.setIcon(new ImageIcon(imagenEscalable));
        } else {
            // Si la imagen no existe, mostrará un texto de marcador de posición
            productoImg.setText("Sin imagen");
            productoImg.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        // Etiquetas para nombre y precio
        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new GridLayout(2, 1)); // 2 filas para nombre y precio
        JLabel nombreProd = new JLabel("Cargando nombre...");
        JLabel precioProd = new JLabel("Cargando precio...");
        panelDetalles.add(nombreProd);
        panelDetalles.add(precioProd);
        
        // Llamar a la función para obtener nombre y precio del producto
        new Thread(() -> {
            ctrlProd.presentNameAndPrice(String.valueOf(idProducto), nombreProd, precioProd);
        }).start();
        
        // Botón de carrito
        JLabel lblCarrito = new JLabel();
        lblCarrito.setPreferredSize(new Dimension(50, 50));
        
        String rutaCarrito = "/img/iconCarrito.png";
        File docImgCarrito = new File(rutaCarrito);
        
        if (docImgCarrito.exists()) {
            ImageIcon carritoIcon = new ImageIcon(rutaCarrito);
            Image scaledCarritoImage = carritoIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            lblCarrito.setIcon(new ImageIcon(getClass().getResource(rutaCarrito)));
        } else {
            lblCarrito.setText("Carrito");
            lblCarrito.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        lblCarrito.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, nombreProd.getText() + " \nagregado al carrito.", "Carrito", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        panelP.add(productoImg, BorderLayout.WEST);
        panelP.add(panelDetalles, BorderLayout.CENTER);
        panelP.add(lblCarrito, BorderLayout.EAST);
        
        return panelP;
    }
}
