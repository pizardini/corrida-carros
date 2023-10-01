public enum CategoriaEnum {
    P1("P1", 1),
    P2("P2", 2),
    GT3("GT3", 3),
    GT4("GT4", 4);

    private final String nome;
    private final int digitos;

    CategoriaEnum(String nome, int digitos) {
        this.nome = nome;
        this.digitos = digitos;
    }

    public String getNome() {
        return nome;
    }

    public int getDigitos() {
        return digitos;
    }
}
