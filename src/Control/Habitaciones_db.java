
package Control;

import Modelo.HabitacionM;
import Modelo.Habitacion_Estado;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Habitaciones_db extends Conexion_db{
    
   public boolean registrar(HabitacionM crear){
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Habitacion (tipo, complemento, arrendador) VALUES(?,?,?)";

        try {
            
            ps = con.prepareStatement(sql);
       
            ps.setString(1, crear.getTipo());
            ps.setString(2, crear.getComplemento());
            ps.setInt(3, crear.getArrendador());
         
    
           
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
    
    public void buscarInformacion(Habitacion_Estado habitacion_Estado) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sqlG = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE tipo='grande'";
        String sqlE = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE tipo='estandar'";
        String sqlP = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE tipo='pequena'";

        try {
            ps = con.prepareStatement(sqlG);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setGrande(rs.getInt("tipo"));                
            }
            
            ps = con.prepareStatement(sqlE);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setEstandar(rs.getInt("tipo"));                
              
            }
            
            ps = con.prepareStatement(sqlP);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setPequena(rs.getInt("tipo"));                
            }
            
        } catch (SQLException e) {
            System.err.println(e);
            
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public void buscarInformacionPago(Habitacion_Estado habitacion_Estado) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sqlG = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE arrendador in(SELECT arrendador FROM Pagos WHERE estado='validado') AND tipo='grande'";
        String sqlE = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE arrendador in(SELECT arrendador FROM Pagos WHERE estado='validado') AND tipo='estandar'";
        String sqlP = "SELECT COUNT(tipo) AS tipo FROM Habitacion WHERE arrendador in(SELECT arrendador FROM Pagos WHERE estado='validado') AND tipo='pequena'";
        

        try {
            ps = con.prepareStatement(sqlG);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setGrande(rs.getInt("tipo"));                
            }
            
            ps = con.prepareStatement(sqlE);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setEstandar(rs.getInt("tipo"));                
              
            }
            
            ps = con.prepareStatement(sqlP);
            rs = ps.executeQuery();
            if(rs.next()){
                habitacion_Estado.setPequena(rs.getInt("tipo"));                
            }
            
        } catch (SQLException e) {
            System.err.println(e);
            
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public String buscarInformacionComplemento(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String complemento="";
        String sql = "SELECT complemento FROM Habitacion WHERE arrendador=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                complemento=rs.getString("complemento");   
            }
            return complemento;
        } catch (SQLException e) {
            System.err.println(e);
            return complemento;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
}
