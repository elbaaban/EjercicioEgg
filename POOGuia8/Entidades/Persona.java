package Guia8Ejercicio3.Entidades;

public class Persona {
    private String nombre, sexo;
    private int edad;
    private double altura, peso;
    
    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + ", peso="
                + peso + "]";
    }

    
}
