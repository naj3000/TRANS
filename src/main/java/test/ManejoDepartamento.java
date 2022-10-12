/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.Conexion;
import datos.DepartamentoJDBC;
import datos.UsuarioJDBC;
import domain.Departamento;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class ManejoDepartamento {
    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            DepartamentoJDBC departamentoJdbc = new DepartamentoJDBC(conexion);

            Departamento cambioDepartamento = new Departamento();
            cambioDepartamento.setId_departamento(1);
            cambioDepartamento.setDepartamento("contabilidad");
           
            departamentoJdbc.update(cambioDepartamento);

            Departamento nuevoDepartamento = new Departamento();
            nuevoDepartamento.setDepartamento("redes sociales");
            //nuevoUsuario.setPassword("estaesunaclavedelargaduracionparaproteccion");
           
            departamentoJdbc.insert(nuevoDepartamento);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}


