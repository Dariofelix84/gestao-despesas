package br.com.devfelix.gestao_despesas.service;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BuscarDespesaService {

    private final DespesaRepository despesaRepository;
    public BuscarDespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }
    public List<Despesa> execute(String email, LocalDate data) {

        List<Despesa> despesas;
        if(data != null) {
            despesas = despesaRepository.findByEmailAndData(email, data);
        }else {
            despesas = despesaRepository.findByEmail(email);
        }
        return despesas;
    }
}
