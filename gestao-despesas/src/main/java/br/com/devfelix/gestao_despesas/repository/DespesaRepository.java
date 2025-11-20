package br.com.devfelix.gestao_despesas.repository;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

}
