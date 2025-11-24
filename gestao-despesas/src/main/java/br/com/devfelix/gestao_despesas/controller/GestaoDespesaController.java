package br.com.devfelix.gestao_despesas.controller;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.service.BuscarDespesaService;
import br.com.devfelix.gestao_despesas.service.CadastroDespesaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

    private final CadastroDespesaService cadastroDespesaService;
    private final BuscarDespesaService buscarDespesaService;

    public GestaoDespesaController(CadastroDespesaService cadastroDespesaService, BuscarDespesaService buscarDespesaService) {
        this.cadastroDespesaService = cadastroDespesaService;
        this.buscarDespesaService = buscarDespesaService;
    }


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Despesa despesa) {

        try {
            var result =  cadastroDespesaService.execute(despesa);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @GetMapping("/{email}")
    public List<Despesa> findByEmailAndDate(@PathVariable String email,
                                            @RequestParam(required = false)LocalDate data) {
        return buscarDespesaService.execute(email, data);
    }
}
