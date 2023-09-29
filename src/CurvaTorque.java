class CurvaTorque {
    private double a;
    private double b;
    private double c;

    public CurvaTorque(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularTorque(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }
        return a * rotacao * rotacao + b * rotacao + c;
    }
}
