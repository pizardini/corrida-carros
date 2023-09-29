class CurvaDePotencia {
    private double m;
    private double n;

    public CurvaDePotencia(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public double calcularPotencia(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }
        return m * rotacao + n;
    }
}
