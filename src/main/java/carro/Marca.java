package carro;

import java.util.Objects;

public class Marca {
    private Integer id;
    private String nome;
    private String modelo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return id == marca.id && Objects.equals(nome, marca.nome) && Objects.equals(modelo, marca.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, modelo);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}