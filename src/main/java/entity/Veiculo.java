package entity;

public class Veiculo {

    private String modelo;
    private Integer estoque;
    private Double precoLocacao;

    public Veiculo() {}

    public Veiculo(String modelo, Integer estoque, Double precoLocacao) {
        this.modelo = modelo;
        this.estoque = estoque;
        this.precoLocacao = precoLocacao;
    }

    public String getModelo() {
        return modelo;
    }
    public void setNome(String modelo) {
        this.modelo = modelo;
    }

    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPrecoLocacao() {
        return precoLocacao;
    }
    public void setPrecoLocacao(Double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
