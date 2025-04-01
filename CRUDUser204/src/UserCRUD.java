/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author stuar
 */
public class UserCRUD {
 private Connection conexion;
 
//Constructor de la clase arranca la conexion a BD.

 public UserCRUD(){
     conexion=ConexionMySQL.conectar(); 
 }
 public boolean InsertUsuario(String nombre, String correo, String contrasena){
     String insertSQL= "INSERT INTO usuarios(nombre,correo,contrasena) VALUES (?,?,?)";
     try { 
         PreparedStatement ps= conexion.prepareStatement(insertSQL);
         ps.setString(1, nombre);
         ps.setString(2, correo);
         ps.setString(3, contrasena);
         return ps.executeUpdate()>0;
     }
     catch (SQLException e){
         System.out.println("Error al crear el usuario"+ e.getMessage());
         return false;
     }
 }
 //consultar por id
    public ResultSet buscarPorID(int id){
        String sqlBuscar="SELECT * FROM usuarios WHERE id=?";
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }catch(SQLException e){
            System.out.println("Error al buscar por id"+e.getMessage());
            return null;
        }
    }//fin de la consulta
    public ResultSet obtenerTodos(){
        String sqlTodos="SELECT * FROM usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
        System.out.println("Error al consultar todos "+ s.getMessage());
        return null;
        }
    }
    
    public boolean actualizarUsuario(int id, String nombre, String correo, String contrasena) {
    String sql = "UPDATE usuarios SET nombre = ?, correo = ?, contrasena = ? WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, correo);
        stmt.setString(3, contrasena);
        stmt.setInt(4, id);
        
        int filasActualizadas = stmt.executeUpdate();
        return filasActualizadas > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar usuario: " + e.getMessage());
        return false;
    }
        }
    
    public boolean eliminarUsuario(int id) {
    String sql = "DELETE FROM usuarios WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
        stmt.setInt(1, id);
        
        int filasEliminadas = stmt.executeUpdate();
        return filasEliminadas > 0;
    } catch (SQLException e) {
        System.out.println("Error al eliminar usuario: " + e.getMessage());
        return false;
    }
}

}

