
package com.duocuc.atlas2.MTO;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Suscripcion {
    private int idSuscripcion;
    private int ValorTotal;
    private LocalDate FechaInscripcion;
    private String Equipos;
    private String Usuario;
    private static int FolioSuscripcion=1000;
    
    public Suscripcion(int idSuscripcion, int ValorTotal, LocalDate FechaInscripcion, String Equipos, String Usuario) {
        this.idSuscripcion = idSuscripcion;
        this.ValorTotal = ValorTotal;
        this.FechaInscripcion = FechaInscripcion;
        this.Equipos = Equipos;
        this.Usuario = Usuario;
    }

    public Suscripcion() {
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion() {
        int Folio=FolioSuscripcion;
        FolioSuscripcion = FolioSuscripcion + 10;
        this.idSuscripcion = Folio;
    }

    public String getValorTotal() {
        Locale locale = new Locale ("es", "CL");
        NumberFormat formateado = NumberFormat.getInstance (locale);
        String ValorFormateado = formateado.format(this.ValorTotal);
        return ValorFormateado;
    }

    public void setValorTotal(int ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public LocalDate getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate FechaInscripcion) {
        this.FechaInscripcion = FechaInscripcion;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public void agregarEquipos(Club cl){
        this.ValorTotal= this.ValorTotal+cl.getValorSuscripcion();
        if(!this.Equipos.isEmpty()){
        this.Equipos += "; ";
        }
        this.Equipos += cl.toString();
    }
    
    
    
}
