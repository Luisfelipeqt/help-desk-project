package br.com.projectfullstack.demo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_chamado")
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Chamado implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @NonNull
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
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
    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
