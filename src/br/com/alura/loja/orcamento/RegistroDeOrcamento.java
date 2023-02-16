package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        // chamada HTTP para a API externa
        // URL Connection
        // Http Client
        // lib Rest
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");
        }
        String url = "http://api.exertna/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "qtdItens", orcamento.getQtdItens()
        );
        http.post(url, dados);
    }
}
