/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author USUARIO
 */
public class Departamento {
    //modelo del objeto usuario
    private int id_departamento;
    private String departamento;


    public Departamento() {
    }

    public Departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    public Departamento(String departamento) {
        this.departamento= departamento;
        
    }
    
    public Departamento(int id_departamento, String departamento) {
        this.id_departamento = id_departamento;
        this.departamento = departamento;
        
    }

    

  

  

    /**
     * @return the id_departamento
     */
    public int getId_departamento() {
        return id_departamento;
    }

    /**
     * @param id_departamento the id_departamento to set
     */
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     @Override
    public String toString() {
        return "Departamento{" + "id_departamento=" + id_departamento + ", departamento=" + departamento + '}';
    }

    public void setDepartamento(Departamento departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(Departamento departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
