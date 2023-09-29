class Carro {
    private int numero;
    private String marca;
    private String modelo;
    private Categoria categoria;
    private int rpmPotenciaMaxima;
    private CurvaTorque curvaTorque;
    private CurvaPotencia curvaPotencia;

    public Carro(int numero, String marca, String modelo, Categoria categoria, int rpmPotenciaMaxima, CurvaTorque curvaTorque, CurvaPotencia curvaPotencia) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.rpmPotenciaMaxima = rpmPotenciaMaxima;
        this.curvaTorque = curvaTorque;
        this.curvaPotencia = curvaPotencia;
    }

}