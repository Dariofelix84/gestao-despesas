package br.com.devfelix.gestao_despesas.controller;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.service.CadastroDespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

   private final CadastroDespesaService cadastroDespesaService;
    public GestaoDespesaController(CadastroDespesaService cadastroDespesaService) {
        this.cadastroDespesaService = cadastroDespesaService;
    }

    @PostMapping("/create")
    public void create(@RequestBody Despesa despesa) {
        cadastroDespesaService.execute(despesa);
    }
}
