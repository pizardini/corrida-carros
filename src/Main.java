public class Main {
    public static void main(String[] args) {
        Categoria categoriaP1 = new Categoria("P1", 1);
        Categoria categoriaP2 = new Categoria("P2", 2);
        Categoria categoriaGT3 = new Categoria("GT3", 3);
        Categoria categoriaGT4 = new Categoria("GT4", 4);

        CurvaTorque curvaT1 = new CurvaTorque(0.001, 0.1, 10);
        CurvaPotencia cP1 = new CurvaPotencia(1, 1);
        CurvaPotencia cP2 = new CurvaPotencia(2, 2);


        Carro carro1 = new Carro(1, "Ferrari", "testarossa", categoriaP1, 8000, curvaT1, cP1, cP2);
//        Carro carro2 = new Carro(10, "Porsche", "911", categoriaP2, 7500);
//        Carro carro3 = new Carro(100, "Audi", "R8", categoriaGT3, 7000);
//        Carro carro4 = new Carro(1000, "Mercedes-Benz", "AMG GT", categoriaGT4, 6500);

        System.out.println(carro1.calcularPotencia(500));
    }
}