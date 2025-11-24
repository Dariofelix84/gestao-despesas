package br.com.devfelix.gestao_despesas.repository;

import br.com.devfelix.gestao_despesas.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

     List<Despesa> findByEmail(String email);
     List<Despesa> findByEmailAndData(String email, LocalDate data);
}
