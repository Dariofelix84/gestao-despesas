package br.com.devfelix.gestao_despesas.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessagePreenchaTodosOsCampos {
    private String message;
    private String type;
}
