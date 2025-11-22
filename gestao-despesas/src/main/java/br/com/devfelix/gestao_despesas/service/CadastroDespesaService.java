package br.com.devfelix.gestao_despesas.service;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import br.com.devfelix.gestao_despesas.repository.DespesaRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaService {

    private final DespesaRepository despesaRepository;
    public CadastroDespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }
    public Despesa execute(Despesa despesa) {

        if (despesa.getDescricao() == null || despesa.getCategoria() == null ||
                despesa.getValor() == null || despesa.getEmail() == null) {

            throw new IllegalArgumentException("Preencha todos os campos");
        }
        despesa = despesaRepository.save(despesa);
        return despesa;
    }
}
