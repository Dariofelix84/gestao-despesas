package br.com.devfelix.gestao_despesas.controller;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.service.CadastroDespesaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

    @PostMapping("/create")
    public void create(Despesa despesa) {
        CadastroDespesaService cadastroDespesaService = new CadastroDespesaService();
        cadastroDespesaService.execute(despesa);
    }
}
