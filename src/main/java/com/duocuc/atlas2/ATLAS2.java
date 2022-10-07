
package com.duocuc.atlas2;
import com.duocuc.atlas2.MTO.Cliente;
import com.duocuc.atlas2.MTO.Club;
import com.duocuc.atlas2.MTO.Suscripcion;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class ATLAS2 {

    public static void main(String[] args) {
        Club club1 = new Club();
        
        club1.setColores("");
        club1.concatenadorDeColores("Rojo");
        club1.concatenadorDeColores("Azul");        
        club1.setNombreClub("hanball");
        club1.setIdClub("hah");
        club1.setValorSuscripcion(10000);
        System.out.println(club1.getIdClub());
        System.out.println(club1.getColores());
        Club club2 = new Club();
        
        club2.setNombreClub("fotball");
        club2.setIdClub("fof");
        System.out.println(club2.getIdClub());
        
        club2.setValorSuscripcion(12000);
        
        System.out.println(club2);
        
        Suscripcion sus1 = new Suscripcion();
        sus1.setEquipos("");
        sus1.agregarEquipos(club1);
        sus1.agregarEquipos(club2);
        sus1.setIdSuscripcion();
        System.out.println(sus1.getIdSuscripcion());
        System.out.println(sus1.getEquipos());
        System.out.println(sus1.getValorTotal());
        
        Cliente cli1 = new Cliente();
        cli1.setNombreUsuario("Chilli");
        cli1.setContraseña("holaMun3d#o");
        cli1.setFechaNacimiento("19/07/2001");
        cli1.setEmail("kfjalfkdj@gmail.cl");
        cli1.setRut(20811954,'0');
        cli1.validadorDeUsuarios("Chilli", "holaMun3d#o");
        cli1.setContraseñaTemporal("llaL5#");
        
       
        
        
////////////////////////////////////////////////////////////////////////////////
       /*
        DateTimeFormatter HoraChile = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate fechaNacimineto = LocalDate.parse("19/07/2001", HoraChile);
        LocalDate fechaNow = LocalDate.now();
       System.out.println(fechaNacimineto);
       System.out.println(fechaNow.format(HoraChile));
       Period años = Period.between(fechaNacimineto, fechaNow);


        String Email = "kfjalfkdj@gmail.com";
        System.out.println(Email.substring(Email.length()-4, Email.length()));




       */
       
    }
    
}   
    
    
    

