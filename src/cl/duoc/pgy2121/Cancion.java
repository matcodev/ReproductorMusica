/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121;

/**
 *
 * @author matiasespinoza
 */
public class Cancion {
    
    private String titulo, artista;
    private int duracion;
    private Boolean favorite, descargado;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int duracion, Boolean favorite, Boolean descargado) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorite = favorite;
        this.descargado = descargado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getDescargado() {
        return descargado;
    }

    public void setDescargado(Boolean descargado) {
        this.descargado = descargado;
    }
    
    
    //Métodos Customer
    public int adelantar(int segActuales, int segAdelantar){
        
        int segFinal;
        
        segFinal = segActuales + segAdelantar;
        
        if(segFinal > this.duracion)
        {
            return 0;
        }
        else
        {
            return segFinal;
        }
       
    }    
    
        
    public void imprimir(){
        
        int minutos = 0, segundos = 0;
        
        minutos = this.duracion / 60;
        segundos = this.duracion % 60;
        
        
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + minutos + ":" + segundos);
        System.out.println("Favorito: " + (this.favorite ? "Agregado a Favoritos" : "No"));
        System.out.println("Descargado en dispositivo: " + (this.descargado ? "En Dispositivo" : "No"));
        System.out.println(tipoCancion());
    }
    
    public String tipoCancion()
    {   
        if(this.duracion >= 300)
        {
            return "La canción es de larga duración.";
        } 
        else 
        {
            return "La canción es normal.";
        }
    }
    
}
