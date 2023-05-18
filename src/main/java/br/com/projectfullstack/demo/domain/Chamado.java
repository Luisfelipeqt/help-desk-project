package br.com.projectfullstack.demo.domain;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Chamado {

    @NonNull
    @EqualsAndHashCode.Include
    private Long id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;

    @NonNull
    private Prioridade prioridade;
    @NonNull
    private Status status;

    @NonNull
    private String titulo;

    @NonNull
    private String observacoes;

    @NonNull
    private Tecnico tecnico;


    @NonNull
    private Cliente cliente;
}
