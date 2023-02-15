package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias: repository, service etc.

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        email.executar(pedido);
        salvar.executar(pedido);

    }
}
