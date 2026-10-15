package model;

public class Pix extends Pagamento {

    @Override
    public void processar(double valor) {
        double desconto = valor * 0.05;
        double total = valor - desconto;

        System.out.println("=== Pix Medieval ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (5%%): R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

    }

}
