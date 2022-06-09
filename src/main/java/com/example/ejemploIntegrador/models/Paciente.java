package com.example.ejemploIntegrador.models;

import java.time.LocalDate;

public class Paciente {
    private Integer id;
    private String nombre;
    private String apellido;
    private String mail;
    private String dni;
    private LocalDate fechaIngreso;
    private Odontologo odontologo;

    public Paciente(Integer id, String nombre, String apellido, String mail, String dni, LocalDate fechaIngreso, Odontologo odontologo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.odontologo = odontologo;
    }

    public Paciente(String nombre, String apellido, String mail, String dni, LocalDate fechaIngreso, Odontologo odontologo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.odontologo = odontologo;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", odontologo=" + odontologo +
                '}';
    }
}
