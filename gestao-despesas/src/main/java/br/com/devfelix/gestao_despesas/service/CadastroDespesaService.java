package br.com.devfelix.gestao_despesas.service;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaService {

    private final DespesaRepository despesaRepository;

    public CadastroDespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public void execute(Despesa despesa) {
        despesaRepository.save(despesa);
        System.out.println(despesa);

    }
}
