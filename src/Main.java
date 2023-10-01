public class Main {
    public static void main(String[] args) {

        CurvaTorque curvaT1 = new CurvaTorque(0.001, 0.1, 10);
        CurvaPotencia cP1 = new CurvaPotencia(1, 1);
        CurvaPotencia cP2 = new CurvaPotencia(2, 2);


        Carro carro1 = new Carro(1, "Ferrari", "testarossa", CategoriaEnum.P1, 8000, curvaT1, cP1, cP2, 100);
        Carro carro2 = new Carro(10, "Porsche", "911", CategoriaEnum.P2, 7500, curvaT1, cP1, cP2);
        Carro carro3 = new Carro(100, "Audi", "r8", CategoriaEnum.GT3, 7000, curvaT1, cP1, cP2);
        Carro carro4 = new Carro(1000, "Mercedes-Benz", "amg gt", CategoriaEnum.GT4, 6500, curvaT1, cP1, cP2);
        Carro carro5 = new Carro(1, "Lamborghini", "gallardo", CategoriaEnum.P1, 6000, curvaT1, cP1, cP2, 50);

        System.out.println(carro1.getNumero());
        System.out.println(carro1.getMarcaModeloFormatado());
        System.out.println(carro1.apresentacaoCarro());
        System.out.println(carro1.calcularTorque(3000));
        System.out.println(carro1.calcularPotencia(3000));

        carro1.melhorQue(carro5);
        carro1.piorQue(carro5);
    }
}