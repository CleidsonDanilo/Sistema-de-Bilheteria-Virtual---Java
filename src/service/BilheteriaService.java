package service;

import model.*;
import java.util.*;

public class BilheteriaService {
    private final List<Evento> eventos = new ArrayList<>();
    private final List<Ingresso> ingressosVendidos = new ArrayList<>();

    public BilheteriaService() {
        eventos.add(new Evento("Show Banda X", "10/09/2025", 50.0, 100));
        eventos.add(new Evento("Teatro Y",     "15/09/2025", 30.0,  50));
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public boolean comprarIngresso(int idx, Cliente cliente, String metodo) {
        if (idx < 0 || idx >= eventos.size()) return false;
        Evento e = eventos.get(idx);
        if (e.getIngressos() == 0) return false;

        Pagamento p = new Pagamento(e.getPreco(), metodo);
        if (!p.processar()) return false;

        p.emitirRecibo();
        int assento = 101 - e.getIngressos();
        Ingresso ing = new Ingresso(e, assento);
        ingressosVendidos.add(ing);

        e.setIngressos(e.getIngressos() - 1);
        ing.exibirIngresso();
        return true;
    }

    // Novo método
    public List<Ingresso> listarIngressosVendidos() {
        return ingressosVendidos;
    }
}