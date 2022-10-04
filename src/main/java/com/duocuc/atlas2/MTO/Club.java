
package com.duocuc.atlas2.MTO;
import java.text.NumberFormat;
import java.time.LocalDate;

public class Club {
    private String IdClub;
    private String NombreClub;
    private String NombreFundador;
    private LocalDate AñoFundado;
    private String PaisOrigen;
    private String Lema;
    private String colores;
    private int valorSuscripcion;
    private static int numeroCorrelativoId=10;
     
    public Club(String IdClub, String NombreClub, String NombreFundador, LocalDate AñoFundado, String PaisOrigen, String Lema, String colores, int valorSuscripcion) {
        this.IdClub = IdClub;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AñoFundado = AñoFundado;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.colores = colores;
        this.valorSuscripcion = valorSuscripcion;
    }

    public Club() {
    }

    public String getIdClub() {
        return IdClub;
    }

    public void setIdClub(String IdClub) {
        String numeroCorrelativoId1 = numeroCorrelativoId+"";
        String ValidadorClub = IdClub.substring(0,3);
        String PrimerasLetras = this.NombreClub.substring(0, 2) + this.NombreClub.substring(0, 1);
        if (ValidadorClub.equals(PrimerasLetras)){
            numeroCorrelativoId ++;
            String nombre = ValidadorClub+numeroCorrelativoId1.toUpperCase();
          this.IdClub = nombre.toUpperCase();
        }else{
            System.out.println("Id no coincide con el nombre del equipo");
        }
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public LocalDate getAñoFundado() {
        return AñoFundado;
    }

    public void setAñoFundado(LocalDate AñoFundado) {
        this.AñoFundado = AñoFundado;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = valorSuscripcion;
    }
    
    @Override
    
    public String toString(){
    NumberFormat valorFormateado = NumberFormat.getCurrencyInstance();
    return this.IdClub +" "+ valorFormateado.format(this.valorSuscripcion);
    }
    
    
    
}
