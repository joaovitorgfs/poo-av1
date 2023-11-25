package ui;

import carro.Automovel;
import carro.Marca;

import java.util.ArrayList;
import java.util.List;

public class CarroUI {
    public static void main(String[] args) {

        Marca marca1 = new Marca();
        marca1.setId(1);
        marca1.setNome("Fiat");
        marca1.setModelo("Cronos");
        Marca marca2 = new Marca();
        marca2.setId(2);
        marca2.setNome("Chevrolet");
        marca2.setModelo("Onix");

        List<Marca> marcas = new ArrayList<>();
        marcas.add(marca1);
        marcas.add(marca2);

        Automovel automovel1 = new Automovel();
        automovel1.setId(1);
        automovel1.setPlaca("JJQ-1G33");
        automovel1.setCor("Vermelho");
        automovel1.setTipoCombustivel("Flex");
        automovel1.setQuilometragem(Double.valueOf("0"));
        automovel1.setChassi("12JJ3456789");
        automovel1.setValor(Double.valueOf("80000"));

        Automovel automovel2 = new Automovel();
        automovel2.setId(2);
        automovel2.setPlaca("JJQ-1633");
        automovel2.setCor("Azul");
        automovel2.setTipoCombustivel("Flex");
        automovel2.setQuilometragem(Double.valueOf("0"));
        automovel2.setChassi("98JJ7654321");
        automovel2.setValor(Double.valueOf("102350"));

        System.out.println(marca1);
        System.out.println(automovel1);
        System.out.println(marca2);
        System.out.println(automovel2);
    }
}
