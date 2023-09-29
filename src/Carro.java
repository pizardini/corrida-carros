import java.util.Objects;

class Carro {
    private int numero;
    private String marca;
    private String modelo;
    private Categoria categoria;
    private int rpmPotenciaMaxima;

    public Carro(int numero, String marca, String modelo, Categoria categoria, int rpmPotenciaMaxima) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.rpmPotenciaMaxima = rpmPotenciaMaxima;
    }

}