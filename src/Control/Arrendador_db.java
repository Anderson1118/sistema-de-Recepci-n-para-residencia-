
package Control;

import Modelo.ArrendadorM;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Arrendador_db extends Conexion_db{
    
    public boolean registrar(ArrendadorM crear){
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Arrendador (ID, nombre, apellido, celular, estado_laboral, cargo) VALUES(?,?,?,?,?,?)";

        try {
            
            ps = con.prepareStatement(sql);
         
            ps.setInt(1, crear.getID());
            ps.setString(2, crear.getNombre()); 
            ps.setString(3, crear.getApellido());
            ps.setString(4, crear.getCelular()); 
            ps.setString(5, crear.getEstado_laboral()); 
            ps.setString(6, crear.getCargo());
           
            
           ps.execute();
            
            return true;
        } catch (SQLException e)  {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(int borrar) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM Arrendador WHERE ID=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscarInformacion(ArrendadorM buscar) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM Arrendador WHERE ID=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, buscar.getID());
            rs = ps.executeQuery();
            
            if(rs.next()){           
               buscar.setNombre(rs.getString("nombre"));
               buscar.setApellido(rs.getString("apellido"));
               buscar.setCelular(rs.getString("celular"));
               buscar.setEstado_laboral(rs.getString("estado_laboral"));
               buscar.setCargo(rs.getString("cargo"));
               return true;
            }else{
               return false; 
            }
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    
}
