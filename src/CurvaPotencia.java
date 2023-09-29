class CurvaPotencia {
    private double m1;
    private double n1;

    public CurvaPotencia(double m1, double n1) {
        this.m1 = m1;
        this.n1 = n1;
    }

    public double calcularPotencia(int rpm) {
        if (rpm < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }
            return m1 * rpm + n1; // Equação antes da potência máxima
    }
}
