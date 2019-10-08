/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yuly
 */
public class Consultas extends Conexion {

    public boolean autenticacion(String identificacion, String password) {
        PreparedStatement pst = null;
        ResultSet rs = null; //para guaradar el resultado

        try {
            String consulta = "select * from usuarios where cc = ? and contraseña = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, identificacion);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("ERROR" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();// Cerrar la conexion 
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.out.println("ERROR" + e);
            }
        }

        return false;
    }

    public boolean registrar(String nombre, String apellido, String cc, String telefono, String correo, String contraseña) {
        PreparedStatement pst = null;

        try {
            String consulta = "insert into usuarios (nombre, apellido, cc, telefono, correo, contraseña) values(?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, cc);
            pst.setString(4, telefono);
            pst.setString(5, correo);
            pst.setString(6, contraseña);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close(); //Cerrar las conexiones
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }
        return false;
    }

    public boolean eliminar(String identificacion) {
        PreparedStatement pst = null;

        try {
            String consulta = "DELETE FROM usuarios where cc = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, identificacion);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close(); //Cerrar las conexiones
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }
        return false;
    }

    public boolean actualizar(String nombre, String apellido, String telefono, String correo, String contraseña, String cc) {
        PreparedStatement pst = null;

        try {
            String consulta = "UPDATE usuarios SET nombre=?, apellido=?, telefono=?, correo=? WHERE contraseña=? AND cc=? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, telefono);
            pst.setString(4, correo);
            pst.setString(5, contraseña);
            pst.setString(6, cc);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close(); //Cerrar las conexiones
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Consultas co = new Consultas();
        //System.out.println(co.actualizar("yuly","alvear","2445","yuly@@","1212","1122"));
        //System.out.println(co.eliminar("1128"));
    }

}
