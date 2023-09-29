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

    public boolean validarNumero() {
        int numDigitos = String.valueOf(numero).length();
        return numDigitos == categoria.getNDigitos() && numDigitos > 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getRpmPotenciaMaxima() {
        return rpmPotenciaMaxima;
    }

    public CurvaTorque getCurvaTorque() {
        return curvaTorque;
    }

    public CurvaPotencia getCurvaPotencia() {
        return curvaPotencia;
    }
}