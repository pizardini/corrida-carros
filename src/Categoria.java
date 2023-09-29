class Categoria {
    private String nome;
    private int nDigitos;

    public Categoria(String nome, int nDigitos) {
        this.nome = nome;
        this.nDigitos = nDigitos;
    }

    public String getNome() {
        return nome;
    }

    public int getNDigitos() {
        return nDigitos;
    }
}