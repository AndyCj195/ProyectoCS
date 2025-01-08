/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Andre
 */
public class CustomMenu extends JMenuBar{
    private JMenu logo, direccion;
    private JTextField barraBusqueda;
    private JButton btnBuscar,btnPedidosCuenta, btnCarrito;
    private JComboBox<String> cmbCategoria;
    
    public CustomMenu(){
        MiMenu();
    }
    
    private void MiMenu(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado entre componentes
        gbc.fill = GridBagConstraints.BOTH; // Los componentes se expandirán
        
        logo = new JMenu("logo");
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        
        direccion = new JMenu("Direccion");
        direccion.setHorizontalAlignment(SwingConstants.CENTER);
       
        cmbCategoria = new JComboBox<>(new String[]{
            "Todos","Electrodomesticos","Ropa",
            "Hogar","Jardin","libros",
            "Entretenimiento","Computadora"
        });
        
        barraBusqueda = new JTextField();
        barraBusqueda.setPreferredSize(new Dimension(300,30));
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setPreferredSize(new Dimension(80,30));
        btnBuscar.addActionListener(e ->{
            String txt = barraBusqueda.getText();
            JOptionPane.showMessageDialog(this, "Buscando: " + txt, "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnPedidosCuenta = new JButton("Pedidos y cuenta");
        btnPedidosCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        
        btnCarrito = new JButton("Carrito");
        btnCarrito.setHorizontalAlignment(SwingConstants.CENTER);
        // Añadir componentes al menú usando GridBagLayout
        //columnas
        gbc.gridx = 0; // Columna 0: Logo
        gbc.weightx = 0.1; // Peso para que ocupe espacio proporcionalmente
        this.add(logo, gbc);

        gbc.gridx = 1; // Columna 1: Direccion
        gbc.weightx = 0.3; // Peso mayor para texto
        this.add(direccion, gbc);
        
         gbc.gridx = 2; // Columna 2: Panel de busqueda
        gbc.weightx = 0.3;
        JPanel panelBusqueda = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        panelBusqueda.add(cmbCategoria);
        panelBusqueda.add(barraBusqueda);
        panelBusqueda.add(btnBuscar);
        this.add(panelBusqueda, gbc);


        gbc.gridx = 5; // Columna 3: Pedidos y Cuentas
        gbc.weightx = 0.2;
        this.add(btnPedidosCuenta, gbc);

        gbc.gridx = 7; // Columna 4: Carritos
        gbc.weightx = 0.1;
        this.add(btnCarrito, gbc);
        
        // Ajustar el diseño al redimensionar la ventana
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarComponentes();
            }
        });
    }
    
    private void ajustarComponentes() {
        // Este método se puede usar para ajustar dinámicamente el tamaño de los componentes
        barraBusqueda.setColumns(getParent().getWidth() / 50); // Ajustar ancho de la barra de búsqueda
        revalidate(); // Recalcular el diseño
    }
}
