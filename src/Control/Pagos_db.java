
package Control;

import Modelo.PagosM;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;


public class Pagos_db extends Conexion_db{
    
public boolean registrar(PagosM crear){
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Pagos (pago, total, estado, arrendador) VALUES(?,?,?,?)";

        try {
            
            ps = con.prepareStatement(sql);
         
            ps.setDouble(1, crear.getPago());
            ps.setDouble(2, crear.getTotal());
            ps.setString(3, crear.getEstado());
            ps.setInt(4, crear.getArrendador()); 
        
           
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

public DefaultListModel buscarInformacion() {
        DefaultListModel model =new DefaultListModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT nombre FROM Arrendador WHERE ID IN(SELECT arrendador FROM Pagos WHERE estado='validado')";
        try {
           
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){  
                System.out.println(rs.getString("nombre"));
                model.addElement(rs.getString("nombre"));
                
            }
            return model;
        } catch (SQLException e) {
            System.err.println(e);
            return model;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public String buscarPago() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String total="";
        Connection con = getConexion();
        String sql = "SELECT SUM(total) AS suma FROM Pagos WHERE estado='validado'";
        try {
           
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){   
                total=rs.getString("suma");
               
            }
            return total;
        } catch (SQLException e) {
            System.err.println(e);
            return total;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
     public String buscarhabitacion(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String tipo="";
        Connection con = getConexion();
        String sql = "SELECT tipo FROM Habitacion WHERE arrendador=?";

        try {
           
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){   
                tipo=rs.getString("tipo");      
            }
            return tipo;
        } catch (SQLException e) {
            System.err.println(e);
            return tipo;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}


    
