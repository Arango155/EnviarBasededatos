
package Clases;

public class Object {
    private int codigo;
    private String marca;
    private String modelo;
    private String pantalla;
    private String anio_fabricacion;

    
    public Object(int uno, String dos, String tres, String cuatro, String cinco){
        this.codigo=uno;
        this.marca=dos;
        this.modelo=tres;
        this.pantalla=cuatro;     
        this.anio_fabricacion=cinco;   
    }
    
    

    public int getUno() {
        return codigo;
    }

    public void setUno(int uno) {
        this.codigo = uno;
    }

    public String getDos() {
        return marca;
    }

    public void setDos(String dos) {
        this.marca = dos;
    }

    public String getTres() {
        return modelo;
    }

    public void setTres(String tres) {
        this.modelo = tres;
    }

    public String getCuatro() {
        return pantalla;
    }

    public void setCuatro(String cuatro) {
        this.pantalla = cuatro;
    }

    public String getCinco() {
        return anio_fabricacion;
    }

    public void setCinco(String cinco) {
        this.anio_fabricacion = cinco;
    }

    
    
}
