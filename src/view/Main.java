import model.*;

void main() {


    double valor = 100.00;

    List<Pagamento> pagamentos = List.of(
            new CartaoCredito(),
            new Boleto(),
            new Pix()
    );

    for (Pagamento pagamento : pagamentos) {
        pagamento.processar(valor);
        System.out.println();
    }

}
