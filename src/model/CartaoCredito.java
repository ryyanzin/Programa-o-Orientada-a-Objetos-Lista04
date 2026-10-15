package model;

public class CartaoCredito extends Pagamento {

    @Override
    public void processar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;

        System.out.println("=== Cartão de Crédito Medieval ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa (5%%): R$ %.2f%n", taxa);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

    }

}
