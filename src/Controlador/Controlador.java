
package Controlador;


import bbdd.Conexion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Controlador {
    
    //From Tienda
        
    public void cargarStock(DefaultTableModel modeloTabla){
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);
        }
        
        Conexion.conectar();
        
        String sentencia = "SELECT * FROM stock";
        ResultSet resultado = Conexion.ejecutarSentencia(sentencia);
        
        try{
            while(resultado.next()){
                int id = resultado.getInt("ID");
                String nombre = resultado.getString("Nombre");
                String heroe = resultado.getString("Heroe");
                String autores = resultado.getString("Autores");
                String editorial = resultado.getString("Editorial");
                double precio = resultado.getDouble("Precio");
                int cantidad = resultado.getInt("Cantidad");
                
                Object[] fila = {id, nombre, heroe, autores, editorial, precio, cantidad};
                modeloTabla.addRow(fila);   
            }
        } catch (SQLException e){
            
        }
    }
    
    public void vender(JTextField textID, JTextField textNombre, JTextField textPrecio){
        Conexion.conectar();
        
        String id=textID.getText();
        String nombre = textNombre.getText();
        String precio = textPrecio.getText();
                
        String sentencia = "UPDATE stock SET cantidad = cantidad-1 WHERE ID = "+id+";";
        String sentencia2 = "CREATE TABLE IF NOT EXISTS ventas ("
                + "ID int primary key not null auto_increment,"
                + "Nombre varchar(50) not null,"
                + "Precio double not null,"
                + "Vendido DATETIME DEFAULT CURRENT_TIMESTAMP);";
        String sentencia3 = "INSERT INTO ventas (nombre, precio)"
                + "VALUES ('"+nombre+"', "+precio+");";
                
        
        Conexion.ejecutarUpdate(sentencia);
        Conexion.ejecutarUpdate(sentencia2);
        Conexion.ejecutarUpdate(sentencia3);
    }
    
    public void pedir(JTextField textID, JTextField textNombre, JTextField textPrecio){
        Conexion.conectar();
        
        String id=textID.getText();
        String nombre = textNombre.getText();
        String precio = textPrecio.getText();
                
        String sentencia = "UPDATE stock SET cantidad = cantidad+1 WHERE ID = "+id+";";
        String sentencia2 = "CREATE TABLE IF NOT EXISTS pedidos ("
                + "ID int primary key not null auto_increment,"
                + "Nombre varchar(50) not null,"
                + "Precio double not null,"
                + "Vendido DATETIME DEFAULT CURRENT_TIMESTAMP);";
        String sentencia3 = "INSERT INTO pedidos (nombre, precio)"
                + "VALUES ('"+nombre+"', "+precio+");";
                
        
        Conexion.ejecutarUpdate(sentencia);
        Conexion.ejecutarUpdate(sentencia2);
        Conexion.ejecutarUpdate(sentencia3);
    }
    
    public void modificar(JTextField textID, JTextField textHeroe, JTextField textAutores, JTextField textEditorial, JTextField textNombre, JTextField textPrecio){
        Conexion.conectar();
         
        String id=textID.getText();
        String nombre = textNombre.getText();
        String heroe = textHeroe.getText();
        String autores = textAutores.getText();
        String editorial = textEditorial.getText();
        String precio = textPrecio.getText();
        
        String sentencia = "UPDATE stock "
                + "SET nombre = '"+nombre+"', "
                + "heroe = '"+heroe+"', "
                + "autores = '"+autores+"', "
                + "editorial = '"+editorial+"', "
                + "precio = "+precio+" "
                + "WHERE ID = "+id+";";
        
        Conexion.ejecutarUpdate(sentencia);
        
    }
    
    public void buscar(String buscar, DefaultTableModel modeloTabla, JComboBox<String> ElecionBuscar){
        Conexion.conectar();
        
        String sentencia = "SELECT * FROM stock where "+ElecionBuscar.getSelectedItem().toString()+" LIKE '%"+buscar+"%'";
        ResultSet resultado = Conexion.ejecutarSentencia(sentencia);
        
        try{
            while(resultado.next()){
                int id = resultado.getInt("ID");
                String nombre = resultado.getString("Nombre");
                String heroe = resultado.getString("Heroe");
                String autores = resultado.getString("Autores");
                String editorial = resultado.getString("Editorial");
                double precio = resultado.getDouble("Precio");
                int cantidad = resultado.getInt("Cantidad");
                
                Object[] fila = {id, nombre, heroe, autores, editorial, precio, cantidad};
                modeloTabla.addRow(fila);   
            }
        } catch (SQLException e){
            
        }
    }
    
    
    //From Ventas_pedidos
    
    public void cargarVentas(DefaultTableModel modeloTabla){
        Conexion.conectar();
        
        
        String sentencia = "SELECT * FROM ventas";
        ResultSet resultado = Conexion.ejecutarSentencia(sentencia);
        
        try{
            while(resultado.next()){
                int id = resultado.getInt("ID");
                String nombre = resultado.getString("Nombre");
                double precio = resultado.getDouble("Precio");
                java.util.Date vendido = resultado.getDate("Vendido");
                
                Object[] fila = {id, nombre, precio, vendido};
                modeloTabla.addRow(fila);   
            }
        } catch (SQLException e){
            
        }
    }
    
    public void cargarPedidos(DefaultTableModel modeloTabla){
        Conexion.conectar();
        
        
        String sentencia = "SELECT * FROM pedidos";
        ResultSet resultado = Conexion.ejecutarSentencia(sentencia);
        
        try{
            while(resultado.next()){
                int id = resultado.getInt("ID");
                String nombre = resultado.getString("Nombre");
                double precio = resultado.getDouble("Precio");
                java.util.Date pedido = resultado.getDate("Vendido");
                
                Object[] fila = {id, nombre, precio, pedido};
                modeloTabla.addRow(fila);   
            }
        } catch (SQLException e){
            
        }
    }
    
    public void crearInforme(JTable modeloTabla){
        JFileChooser selector = new JFileChooser();
        int result = selector.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File archivoSeleccionado = selector.getSelectedFile();
            String filePath = (archivoSeleccionado.getAbsolutePath() + ".txt");
        
            try{
                FileWriter escribir = new FileWriter(new File(filePath));

            for(int i = 0; i<modeloTabla.getColumnCount(); i++){
                escribir.append(modeloTabla.getColumnName(i));
                if(i < modeloTabla.getColumnCount() - 1){
                    escribir.append(",");
                }
            }

            escribir.append("\n");

            for(int i=0; i<modeloTabla.getRowCount(); i++){
                for(int j=0; j<modeloTabla.getColumnCount(); j++){
                    escribir.append(modeloTabla.getValueAt(i, j).toString());
                    if(j<modeloTabla.getColumnCount()-1){
                        escribir.append(",");
                    }
                }
                escribir.append("\n");
            }

            escribir.flush();
            escribir.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public void leerInforme(JTable modeloTabla){
        
        DefaultTableModel modelo = (DefaultTableModel) modeloTabla.getModel();
        JFileChooser selector = new JFileChooser();
        int result = selector.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File archivoSeleccionado = selector.getSelectedFile();
            String filePath = archivoSeleccionado.getAbsolutePath();
        
            try{
                BufferedReader lector=new BufferedReader(new FileReader(new File(filePath)));

                String linea;
                while((linea = (lector.readLine())) != null){
                    String[] datos = linea.split(",");
                    modelo.addRow(datos);
                }

                lector.close();
            }catch(IOException e){
                e.printStackTrace();
            }              
        }
    }
    
    public void borrarTabla(){
        String sentencia = "DROP TABLE ventas, pedidos;";
        Conexion.ejecutarUpdate(sentencia);
    }
    
    
    
    //From AñadirC
    
    public void crear(JTextField nombreText, JTextField heroeText, JTextField autoresText, JTextField editorialText, JTextField precioText, JTextField cantidadText){
        Conexion.conectar();
         
        String nombre = nombreText.getText();
        String heroe = heroeText.getText();
        String autores = autoresText.getText();
        String editorial = editorialText.getText();
        String precio = precioText.getText();
        String cantidad = cantidadText.getText();
        
        String sentencia = "INSERT INTO stock (nombre, heroe, autores, editorial, precio, cantidad)"
                + "VALUES ('"+nombre+"', '"+heroe+"', '"+autores+"', '"+editorial+"', "+precio+", "+cantidad+");";
        
        Conexion.ejecutarUpdate(sentencia);
    }
    
    public void pedirAñadir(JTextField nombreText, JTextField precioText){
        Conexion.conectar();
        

        String nombre = nombreText.getText();
        String precio = precioText.getText();
                

        String sentencia2 = "CREATE TABLE IF NOT EXISTS pedidos ("
                + "ID int primary key not null auto_increment,"
                + "Nombre varchar(50) not null,"
                + "Precio double not null,"
                + "Vendido DATETIME DEFAULT CURRENT_TIMESTAMP);";
        String sentencia3 = "INSERT INTO pedidos (nombre, precio)"
                + "VALUES ('"+nombre+"', "+precio+");";
                
        
        Conexion.ejecutarUpdate(sentencia2);
        Conexion.ejecutarUpdate(sentencia3);
    }
}
