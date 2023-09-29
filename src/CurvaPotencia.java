class CurvaPotencia {
    private double m1;
    private double n1;
    private int rpmPMax;
    private double m2;
    private double n2;

    public CurvaPotencia(double m1, double n1, int rpmPMax, double m2, double n2) {
        this.m1 = m1;
        this.n1 = n1;
        this.rpmPMax = rpmPMax;
        this.m2 = m2;
        this.n2 = n2;
    }

    public double calcularPotencia(int rpm) {
        if (rpm < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }

        if (rpm <= rpmPMax) {
            return m1 * rpm + n1; // Equação antes da potência máxima
        } else {
            return m2 * rpm + n2; // Equação após a potência máxima
        }
    }
}
