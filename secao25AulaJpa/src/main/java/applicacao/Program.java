package applicacao;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "Carlos@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joaquim Torres", "Joaquim@gmail.com");
        Pessoa p3 = new Pessoa(3, "Carlos da Silva", "Carlos@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
