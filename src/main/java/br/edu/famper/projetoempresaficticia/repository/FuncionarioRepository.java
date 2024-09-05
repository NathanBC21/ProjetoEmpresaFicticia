package br.edu.famper.projetoempresaficticia.repository;

import br.edu.famper.projetoempresaficticia.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
}
