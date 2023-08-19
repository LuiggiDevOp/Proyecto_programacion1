
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.SwingUtilities;


  public class  ConexionMYSQL {
  public static Connection conectar (){
    
    Connection cn = null;
    
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:33065/pruebaproyecto","root","");
        System.out.println("Conectado");
        
    }catch (Exception e){
        System.out.println("Error "+e);
    }
    return cn;  
}
      public static void main(String[] args) {
        Connection conexion = conectar();
            };

}

