public class Main {
    public static void main(String[] args) {
        Categoria categoriaP1 = new Categoria("P1", 1);
        Categoria categoriaP2 = new Categoria("P2", 2);
        Categoria categoriaGT3 = new Categoria("GT3", 3);
        Categoria categoriaGT4 = new Categoria("GT4", 4);


        Carro carro1 = new Carro(1, "Ferrari", "Testarossa", categoriaP1, 8000);
        Carro carro2 = new Carro(10, "Porsche", "911", categoriaP2, 7500);
        Carro carro3 = new Carro(100, "Audi", "R8", categoriaGT3, 7000);
        Carro carro4 = new Carro(1000, "Mercedes-Benz", "AMG GT", categoriaGT4, 6500);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);

    }
}