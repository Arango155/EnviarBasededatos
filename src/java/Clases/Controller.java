
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JP
 */
public class Controller {
      Object[] tablaLibro;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public Controller(){
        this.tablaLibro = new Object[100];
        this.indiceArray=0;
    }
    
     public void guardarObject(Object object){
        this.tablaLibro[this.indiceArray]=object;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public Object[] getObject(){
        return this.tablaLibro;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }
    
    public boolean getObject2(Object object){        
        String sql = "INSERT INTO tienda.producto(codigo, marca, modelo, pantalla, anio_fabricacion) ";
             sql += " VALUES( ?,?,?,?,?)"; 
        try{
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, object.getUno());
            statement.setString(2, object.getDos());
            statement.setString(3, object.getTres());
            statement.setString(4, object.getCuatro());
            statement.setString(5, object.getCinco());
             int resultado = statement.executeUpdate(); 
                if(resultado > 0){
                    return true;
                }else{
                    return false;
                }
        }catch(SQLException e){
            String error = e.getMessage();  
            return false;
        }    
    }
    
    
}

