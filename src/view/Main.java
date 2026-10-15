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

    List<Personagem> personagens = List.of(
            new Guerreiro("Meliodas", 100),
            new Mago("Merlin", 80),
            new Arqueiro("Gowther", 90)
    );

    System.out.println("=== TURNO DE COMBATE ===\n");

    for (Personagem personagem : personagens) {
        personagem.atacar();
    }

    System.out.println("\n=== FIM DO TURNO ===");

}
