package carro;

import java.util.List;
import java.util.Objects;

public class Automovel {
    private Integer id;
    private String placa;
    private String cor;
    private String tipoCombustivel;
    private Double quilometragem;
    private String chassi;
    private Double valor;
    private List<Marca> marcas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovel automovel = (Automovel) o;
        return Objects.equals(id, automovel.id) && Objects.equals(placa, automovel.placa) && Objects.equals(cor, automovel.cor) && Objects.equals(tipoCombustivel, automovel.tipoCombustivel) && Objects.equals(quilometragem, automovel.quilometragem) && Objects.equals(chassi, automovel.chassi) && Objects.equals(valor, automovel.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, cor, tipoCombustivel, quilometragem, chassi, valor);
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor=" + valor +
                '}';
    }
}