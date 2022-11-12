package BOOTCAMP.Ejemplos;

public class Coche {

    // 1. Atributos

    int modelo;
    String fabricante;
    int velocidad = 0;
    int NumPuertas;
    double sport;
    String clase;

    //2. Constructores

    public Coche (){}

    public Coche (int modelo, String fabricante, int velocidad, int NumPuertas, double sport,String clase){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.velocidad = velocidad;
        this.NumPuertas = NumPuertas;
        this.sport = sport;
        this.clase = clase;
    }

    //3. parametros


    //4. toString


    @Override
    public String toString() {
        return "Coche{" +
                "modelo=" + modelo +
                ", fabricante='" + fabricante + '\'' +
                ", velocidad=" + velocidad +
                ", NumPuertas=" + NumPuertas +
                ", sport=" + sport +
                ", clase='" + clase + '\'' +
                '}';
    }
}
