package model;

public class Pagamento {
    private double valor;
    private String metodo;
    private boolean status;

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
        this.status = false;
    }

    public boolean processar() {
        System.out.println("Processando pagamento via " + metodo + "...");
        status = true;
        System.out.println("Pagamento aprovado!");
        return status;
    }

    public void emitirRecibo() {
        System.out.printf("Recibo: R$%.2f pago via %s\n", valor, metodo);
    }
}