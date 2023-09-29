class Carro {
    private int numero;
    private String marca;
    private String modelo;
    private Categoria categoria;
    private int rpmPotenciaMaxima;
    private CurvaTorque curvaTorque;
    private CurvaPotencia curvaPotencia;

    public Carro(int numero, String marca, String modelo, Categoria categoria, int rpmPotenciaMaxima) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.rpmPotenciaMaxima = rpmPotenciaMaxima;

        if (!validarNumero(categoria)) {
            throw new IllegalArgumentException("Número de carro inválido");
        }
    }


    public boolean validarNumero(Categoria categoria) {
        int numDigitos = String.valueOf(numero).length();
        return numDigitos == categoria.getDigitos();
    }

    public String getMarcaModeloFormatado() {
        return marca.toUpperCase() + " " + modelo.substring(0, 1).toUpperCase() + modelo.substring(1).toLowerCase();
    }

    public String apresentacaoCarro() {
        return String.format("%0" + categoria.getDigitos() + "d", numero) + " " + categoria.getNome();
    }

    public double calcularTorque(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }

        return curvaTorque.calcularTorque(rotacao);
    }

    public double calcularPotencia(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }

        return curvaPotencia.calcularPotencia(rotacao);
    }

    private boolean comparacaoMelhor(Carro carro2) {
        int[] rotacoes = {1000, 2000, 4000};
        for (int rotacao : rotacoes) {
            double torque1 = calcularTorque(rotacao);
            double potencia1 = calcularPotencia(rotacao);
            double torque2 = carro2.calcularTorque(rotacao);
            double potencia2 = carro2.calcularPotencia(rotacao);
            if (torque1 <= torque2 || potencia1 <= potencia2) {
                return false;
            }
        }
        return true;
    }

    public void melhorQue(Carro carro2) {
        if (comparacaoMelhor(carro2)) {
            System.out.println(getMarcaModeloFormatado() + " é melhor que " + carro2.getMarcaModeloFormatado());
        } else {
            System.out.println(getMarcaModeloFormatado() + " não é melhor que " + carro2.getMarcaModeloFormatado());
        }
    }

    private boolean comparacaoPior(Carro carro2) {
        int[] rotacoes = {1000, 2000, 4000};
        for (int rotacao : rotacoes) {
            double torque1 = calcularTorque(rotacao);
            double potencia1 = calcularPotencia(rotacao);
            double torque2 = carro2.calcularTorque(rotacao);
            double potencia2 = carro2.calcularPotencia(rotacao);
            if (torque1 >= torque2 || potencia1 >= potencia2) {
                return false;
            }
        }
        return true;
    }

    public void piorQue(Carro carro2) {
        if (comparacaoPior(carro2)) {
            System.out.println(getMarcaModeloFormatado() + " é pior que " + carro2.getMarcaModeloFormatado());
        } else {
            System.out.println(getMarcaModeloFormatado() + " não é pior que " + carro2.getMarcaModeloFormatado());
        }
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

    @Override
    public String toString() {
        return "Carro{" +
                "numero=" + numero +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", categoria=" + categoria +
                ", rpmPotenciaMaxima=" + rpmPotenciaMaxima +
                ", curvaTorque=" + curvaTorque +
                ", curvaPotencia=" + curvaPotencia +
                '}';
    }
}