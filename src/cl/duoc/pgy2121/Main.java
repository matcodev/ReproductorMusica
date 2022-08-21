/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.pgy2121;

/**
 *
 * @author matiasespinoza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancionUno = new Cancion("Is Wea", "Nachito", 200, true, false);
        Cancion cancionDos = new Cancion("Shaaa La mea volá", "Marihuanos Crew", 305, true, false);
        var resultAdelantar = cancionUno.adelantar(200, 20);
        
        cancionUno.imprimir();
        System.out.println(resultAdelantar == 0 ? "Canción terminada. Comenzando siguiente canción..." : "Adelantaste la cancion a " + resultAdelantar/60 + ":" + resultAdelantar % 60);
        
        //cancionDos.imprimir();
    }
    
}
