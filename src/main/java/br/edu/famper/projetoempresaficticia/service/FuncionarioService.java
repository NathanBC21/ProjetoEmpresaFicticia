package br.edu.famper.projetoempresaficticia.service;

import br.edu.famper.projetoempresaficticia.model.Funcionario;
import br.edu.famper.projetoempresaficticia.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario update(Funcionario funcionario) {
        Funcionario salvo = funcionarioRepository.findById(funcionario.getCodigo()).
                orElseThrow(() ->
                        new RuntimeException("Funcionário não encontrado!")
                );
        salvo.setNome(funcionario.getNome());
        salvo.setCargo(funcionario.getCargo());
        salvo.setDepartamento(funcionario.getDepartamento());
        salvo.setDataAdmissao(funcionario.getDataAdmissao());
        salvo.setEmail(funcionario.getEmail());
        salvo.setTelefone(funcionario.getTelefone());
        return funcionarioRepository.save(salvo);
    }

   public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
   }

}
