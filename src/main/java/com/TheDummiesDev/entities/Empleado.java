package com.TheDummiesDev.entities;


import javax.persistence.*;

//Clase Empleado
    @Entity
    @Table(name = "empleado")
public class Empleado {
    @Id
    private Long idCedula;
    @Column(name = "NombreEmpleado")
    private String NombreEmpleado;
    @Column(name = "emailEmpleado")
    public String emailEmpleado;

    @ManyToOne(optional = true)
    @JoinColumn(name = "nitJac")
    private  Jac juntaAccionComunalPertenece;
    @Column(name = "RolJuntaAccionComuna")
    private String RolJuntaAccionComuna;

    public Empleado(){

    }

    public Empleado(Long idCedula, String NombreEmpleado, String emailEmpleado, Jac juntaAccionComunalPertenece, String RolJuntaAccionComuna) {
        this.idCedula = idCedula;
        this.NombreEmpleado = NombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
        this.setRolJuntaAccionComuna(RolJuntaAccionComuna);
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public Jac getJuntaAccionComunalPertenece() {
        return this.juntaAccionComunalPertenece;
    }

    public void setjuntaAccionComunalPertenece(Jac juntaAccionComunalPertenece) {
        this.juntaAccionComunalPertenece = juntaAccionComunalPertenece;
    }



    public String getemailEmpleado() {
        return emailEmpleado;
    }

    public void setemailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }


    public Long getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(Long idCedula) {
        this.idCedula = idCedula;
    }

    public String getRolJuntaAccionComuna() {
        return RolJuntaAccionComuna;
    }

    public void setRolJuntaAccionComuna(String rolJuntaAccionComuna) {
        RolJuntaAccionComuna = rolJuntaAccionComuna;
    }
}
