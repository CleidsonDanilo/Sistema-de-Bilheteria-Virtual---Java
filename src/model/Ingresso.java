package model;

public class Ingresso {
    private Evento evento;
    private int numeroAssento;
    private double preco;

    public Ingresso(Evento evento, int numeroAssento) {
        this.evento = evento;
        this.numeroAssento = numeroAssento;
        this.preco = evento.getPreco();
    }

    public void exibirIngresso() {
        System.out.printf("Ingresso para %s (%s) - Assento %d - R$%.2f%n",
            evento.getNome(), evento.getData(), numeroAssento, preco);
        gerarQRCode();
    }

    private void gerarQRCode() {
        String codigo = evento.getNome() + "-" + numeroAssento + "-" + System.currentTimeMillis();
        System.out.println("QR Code: [" + codigo.hashCode() + "]");
    }

    // ─── GETTERS ADICIONADOS ───────────────────────────────────────────

    public Evento getEvento() {
        return evento;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public double getPreco() {
        return preco;
    }
}