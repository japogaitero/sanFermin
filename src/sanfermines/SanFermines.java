/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanfermines;


import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Victor
 */
public class SanFermines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado = new Scanner(System.in);
    int Vtoros,Ntoros,carreras;
    int Vcorredor=0;
    System.out.println ("Dime cuantas carreras vamos a analizar");
    carreras = teclado.nextInt();
    for (int i=1; i<=carreras; i++){    
        if (carreras>=1){
            System.out.println ("Dime cuantos toros corren esta vez");
            Ntoros = teclado.nextInt();
            System.out.println ("Dime la velocidad de todos los toros separadas por espacio");
            for (int i2=0; i2<Ntoros; i2++){         
                if (Ntoros>=1){
                    Vtoros = teclado.nextInt();
                    if (Vtoros>Vcorredor){
                        Vcorredor=Vtoros;
                    }   
                }
            }
            System.out.println ("En el caso " + i +" la velocidad del corredor debera ser al menos de "+ Vcorredor);
            Vcorredor=0;
            }    
    }
    }
}

