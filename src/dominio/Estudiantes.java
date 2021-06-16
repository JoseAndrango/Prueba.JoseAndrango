
package dominio;

public class Estudiantes {
    public String nombre;
    public char genero;
    public double nota;

    public Estudiantes(String nombre, char genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }
    @Override
    public  String toString(){
        return this.nombre+" "+this.genero+" "+this.nota;
    }
    public double getporcentaje(){
        double porcentaje;
        porcentaje = nombre/4 * 100;
        return porcentaje; 
    }
    public double getCalifiacionalta(){
        for(int i=0;i<10;i++){
            System.out.println(nombre);
        }
        return 0;
    }
    
}
