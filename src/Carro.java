class Carro {
    private int numero;
    private String marca;
    private String modelo;
    private Categoria categoria;
    private int rpmPMax;
    private CurvaTorque curvaTorque;
    private CurvaPotencia curvaPAntesMax;
    private CurvaPotencia curvaPDepoisMax;

    public Carro(int numero, String marca, String modelo, Categoria categoria, int rpmPMax, CurvaTorque curvaTorque,
                 CurvaPotencia curvaPAntesMax, CurvaPotencia curvaPDepoisMax) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.rpmPMax = rpmPMax;
        this.curvaTorque = curvaTorque;
        this.curvaPAntesMax = curvaPAntesMax;
        this.curvaPDepoisMax = curvaPDepoisMax;

//        try {
            if (!validarNumero(categoria) || rpmPMax <= 0) {
                throw new IllegalArgumentException("Número de carro ou RPM de potência máxima inválidos");
            }
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//            //Informando ao método que chamou a função (Main) sobre o erro
//        }
    }


    public boolean validarNumero(Categoria categoria) {
        int numDigitos = String.valueOf(numero).length();
        return numDigitos == categoria.getDigitos();
    }

    public String getMarcaModeloFormatado() { //método para retornar a marca do carro (em caixa alta), seguida de um espaço
        // em branco, seguido do modelo do carro, com apenas a primeira letra em caixa alta e as demais em caixa baixa.
        return marca.toUpperCase() + " " + modelo.substring(0, 1).toUpperCase() + modelo.substring(1).toLowerCase();
    }

    public String apresentacaoCarro() { //método para retornar uma apresentação do carro, definido como o seu número
        // (com 1, 2, 3 ou 4 dígitos, de acordo com a sua categoria), seguido da sigla da categoria (P1, P2, P3 ou P4)
        return numero + " " + categoria.getNome();
    }

    public double calcularTorque(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }
        double resultado = curvaTorque.calcularTorque(rotacao);
        if (resultado < 0) {
            throw new IllegalArgumentException("O valor de torque não pode ser negativo");
        }
        return resultado;
    }


    public double calcularPotencia(int rotacao) {
        if (rotacao < 0) {
            throw new IllegalArgumentException("Rotação não pode ser negativa.");
        }
        if (rotacao <= rpmPMax) {
            System.out.println("Rotação abaixo da ponto para potência máxima");
            return curvaPAntesMax.calcularPotencia(rotacao);
        } else {
            System.out.println("Rotação acima do ponto para potência máxima");
            return curvaPDepoisMax.calcularPotencia(rotacao);
        }
    }

//    private boolean comparacaoMelhor(Carro carro2) {
//        int[] rotacoes = {1000, 2000, 4000};
//        for (int rotacao : rotacoes) {
//            double torque1 = calcularTorque(rotacao);
//            double potencia1 = calcularPotencia(rotacao);
//            double torque2 = carro2.calcularTorque(rotacao);
//            double potencia2 = carro2.calcularPotencia(rotacao);
//            if (torque1 <= torque2 || potencia1 <= potencia2) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public void melhorQue(Carro carro2) {
//        if (comparacaoMelhor(carro2)) {
//            System.out.println(getMarcaModeloFormatado() + " é melhor que " + carro2.getMarcaModeloFormatado());
//        } else {
//            System.out.println(getMarcaModeloFormatado() + " não é melhor que " + carro2.getMarcaModeloFormatado());
//        }
//    }

//    private boolean comparacaoPior(Carro carro2) {
//        int[] rotacoes = {1000, 2000, 4000};
//        for (int rotacao : rotacoes) {
//            double torque1 = calcularTorque(rotacao);
//            double potencia1 = calcularPotencia(rotacao);
//            double torque2 = carro2.calcularTorque(rotacao);
//            double potencia2 = carro2.calcularPotencia(rotacao);
//            if (torque1 >= torque2 || potencia1 >= potencia2) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public void piorQue(Carro carro2) {
//        if (comparacaoPior(carro2)) {
//            System.out.println(getMarcaModeloFormatado() + " é pior que " + carro2.getMarcaModeloFormatado());
//        } else {
//            System.out.println(getMarcaModeloFormatado() + " não é pior que " + carro2.getMarcaModeloFormatado());
//        }
//    }

    public int getNumero() { //Método para leitura, de forma indireta, do número do carro.
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

    public int getRpmPMax() {
        return rpmPMax;
    }

    public CurvaTorque getCurvaTorque() {
        return curvaTorque;
    }

    public CurvaPotencia getCurvaPAntesMax() {
        return curvaPAntesMax;
    }

    public CurvaPotencia getCurvaPDepoisMax() {
        return curvaPDepoisMax;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numero=" + numero +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", categoria=" + categoria +
                ", rpmPMax=" + rpmPMax +
                ", curvaTorque=" + curvaTorque +
                ", curvaPotencia1=" + curvaPAntesMax +
                ", curvaPotencia2=" + curvaPDepoisMax +
                '}';
    }
}