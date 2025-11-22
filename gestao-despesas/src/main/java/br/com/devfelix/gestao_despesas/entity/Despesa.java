package br.com.devfelix.gestao_despesas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "despesa")

public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(length = 100, nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDate data;

    @CreationTimestamp
    private LocalDate data_criacao;

}
