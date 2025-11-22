package br.com.devfelix.gestao_despesas.controller;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.service.CadastroDespesaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

   private final CadastroDespesaService cadastroDespesaService;
    public GestaoDespesaController(CadastroDespesaService cadastroDespesaService) {
        this.cadastroDespesaService = cadastroDespesaService;
    }

    @PostMapping("/create")
    public Despesa create(@RequestBody Despesa despesa) {
        return cadastroDespesaService.execute(despesa);
    }


}
