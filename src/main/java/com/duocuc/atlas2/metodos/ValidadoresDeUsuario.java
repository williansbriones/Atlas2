
package com.duocuc.atlas2.metodos;
import com.duocuc.atlas2.MTO.Cliente;

public class ValidadoresDeUsuario {

    public ValidadoresDeUsuario() {
    }
    
    
    
    public void validadorDeUsuarios(String NombreUsuario, String Contraseña,Cliente cli){
        
        if (Contraseña.equals(cli.getContraseña()) && NombreUsuario.equals(cli.getNombreUsuario())){
        
            System.out.println("Usuario correcto");
        }else{
        
            System.out.println("Usuario incorrecto ");
        }
    
    
    }
    
    
}
