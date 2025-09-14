package model;

public class Evento {
    private String nome;
    private String data;
    private double preco;
    private int ingressos;

    public Evento(String nome, String data, double preco, int ingressos) {
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.ingressos = ingressos;
    }

    public String getNome() { return nome; }
    public String getData() { return data; }
    public double getPreco() { return preco; }
    public int getIngressos() { return ingressos; }
    public void setIngressos(int ingressos) { this.ingressos = ingressos; }
}