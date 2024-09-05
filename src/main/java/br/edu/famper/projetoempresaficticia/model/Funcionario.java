package br.edu.famper.projetoempresaficticia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cargo", length = 50)
    private String cargo;

    @Column(name = "departamento", length = 50)
    private String departamento;

    @Column(name = "dataAdmissao")
    private Date dataAdmissao;

    @Column(name = "email", length = 50)
    private String email;

   @Column(name = "telefone", length = 11)
    private String telefone;
}
