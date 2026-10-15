package model;

public class Boleto extends Pagamento {

    @Override
    public void processar(double valor) {
        double desconto = valor * 0.03;
        double total = valor - desconto;

        System.out.println("=== Boleto Medieval ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (3%%): R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

    }

}
