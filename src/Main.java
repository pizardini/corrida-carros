public class Main {
    public static void main(String[] args) {
        Categoria P1 = new Categoria("P1", 1);
        Categoria P2 = new Categoria("P2", 2);
        Categoria GT3 = new Categoria("GT3", 3);
        Categoria GT4 = new Categoria("GT4", 4);

        CurvaTorque curvaT1 = new CurvaTorque(0.001, 0.1, 10);
        CurvaPotencia cP1 = new CurvaPotencia(1, 1);
        CurvaPotencia cP2 = new CurvaPotencia(2, 2);


        Carro carro1 = new Carro(1, "Ferrari", "testarossa", P1, 8000, curvaT1, cP1, cP2, 100);
        Carro carro2 = new Carro(10, "Porsche", "911", P2, 7500, curvaT1, cP1, cP2);
        Carro carro3 = new Carro(100, "Audi", "r8", GT3, 7000, curvaT1, cP1, cP2);
        Carro carro4 = new Carro(1000, "Mercedes-Benz", "amg gt", GT4, 6500, curvaT1, cP1, cP2);
        Carro carro5 = new Carro(1, "Lamborghini", "gallardo", P1, 6000, curvaT1, cP1, cP2, 50);

        System.out.println(carro1.getNumero());
        System.out.println(carro1.getMarcaModeloFormatado());
        System.out.println(carro1.apresentacaoCarro());
        System.out.println(carro1.calcularTorque(3000));
        System.out.println(carro1.calcularPotencia(3000));

        carro1.melhorQue(carro5);
        carro1.piorQue(carro5);
    }
}