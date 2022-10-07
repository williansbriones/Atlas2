
package com.duocuc.atlas2.MTO;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Cliente{
    private int IdUsuario;
    private String Nombre;
    private int rut;
    private String Dv;
    private LocalDate FechaNacimiento;
    private String Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contraseña;
    private String ContraseñaTemporal;

    public Cliente(int IdUsuario, String Nombre, int rut, String Dv, LocalDate FechaNacimiento, String Telefono, String Email, String NombreUsuario, String Contraseña) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.rut = rut;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
    }
    
    public Cliente() {
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char Dv) {
        
        if (validaRut(rut, Dv)){
        this.rut = rut;
        this.Dv= Dv+"";
        }
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String Fechaingresado) {
        DateTimeFormatter HoraChile = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate EvaluadorFechaNacimiento = LocalDate.parse(Fechaingresado, HoraChile);
        LocalDate fechaNow = LocalDate.now();
        Period CaluloEntre = Period.between(EvaluadorFechaNacimiento, fechaNow);
        int Edad = CaluloEntre.getYears();
        if(Edad>17){
            this.FechaNacimiento = EvaluadorFechaNacimiento;
            System.out.println("Fecha ingresada correctamente");
        }else{
            System.out.println("No eres mayor de edad, no puedes registrarte");
        }
        
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        boolean EsUnaArroba = false;
        boolean EsComOrCl = false;
        String ValidadorCL = Email.substring(Email.length()-3, Email.length());
        String ValidadorCOM = Email.substring(Email.length()-4, Email.length());
        for(int i=0; i < Email.length(); i++){
           char c = Email.charAt(i);
           if (c == '@'){
               EsUnaArroba  = true;
           }else if(ValidadorCL.equals(".cl")){
                EsComOrCl= true;
           }else if(ValidadorCOM.equals(".com")){
               EsComOrCl = true;
           }
        }
        if((EsUnaArroba && EsComOrCl) || (EsUnaArroba && EsComOrCl) ){
            System.out.println("Email Correcto");
            this.Email = Email;
        }else{
            System.out.println("Email incorrecto");
        }
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length()>3 ){
            System.out.println("Usuario correcto");
        this.NombreUsuario = NombreUsuario;
        }else{
            System.out.println("Usuario erroneo");
        }
    }

    public String getContraseñaTemporal() {
        return ContraseñaTemporal;
    }

    public void setContraseñaTemporal(String Contraseña) {
        
        boolean EsMayuscula = false;
        boolean EsCaracter = false;
        boolean EsNumero = false;
        boolean EsMinuscula = false;
        for(int i=0; i < Contraseña.length(); i++){
           char c = Contraseña.charAt(i);
           if (Character.isUpperCase(c)){
               EsMayuscula  = true;
           }else if(Character.isDigit(c)){
               EsNumero  = true;
           
            }else if (Character.isLowerCase(c)){
                EsMinuscula = true;
            
            }else{
                EsCaracter = true; 
            }  
        }
        if (EsCaracter && EsNumero && EsMinuscula && EsMayuscula){
        this.ContraseñaTemporal = Contraseña;
        }else{
            System.out.println("La contraseña no es valida");
        }
        
        
    }
    
    
    
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        boolean EsMayuscula = false;
        boolean EsCaracter = false;
        boolean EsNumero = false;
        boolean EsMinuscula = false;
        for(int i=0; i < Contraseña.length(); i++){
           char c = Contraseña.charAt(i);
           if (Character.isUpperCase(c)){
               EsMayuscula  = true;
           }else if(Character.isDigit(c)){
               EsNumero  = true;
           
            }else if (Character.isLowerCase(c)){
                EsMinuscula = true;
            
            }else{
                EsCaracter = true; 
            }  
        }
        if (EsCaracter && EsNumero && EsMinuscula && EsMayuscula){
        this.Contraseña = Contraseña;
        }else{
            System.out.println("La contraseña no es valida");
        }
    }
    
    public boolean validaRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
                System.out.println("Rut valido");
            }else{
                System.out.println("Rut invalido");
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;    
    }
    
     public void validadorDeUsuarios(String NombreUsuario, String Contraseña){
        
        if ((Contraseña.equals(this.Contraseña) && NombreUsuario.equals(this.NombreUsuario))||(Contraseña.equals(this.ContraseñaTemporal) && NombreUsuario.equals(this.NombreUsuario))){
        
            System.out.println("Usuario correcto");
        }else{
        
            System.out.println("Usuario incorrecto ");
        }
     }
}
