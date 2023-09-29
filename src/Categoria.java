class Categoria {
    private String nome;
    private int digitos;

    public Categoria(String nome, int digitos) {
        this.nome = nome;
        this.digitos = digitos;
    }

    public String getNome() {
        return nome;
    }

    public int getDigitos() {
        return digitos;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", nDigitos=" + digitos +
                '}';
    }
}