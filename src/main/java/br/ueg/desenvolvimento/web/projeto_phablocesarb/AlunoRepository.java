package br.ueg.desenvolvimento.web.projeto_phablocesarb;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    List<Aluno> findByNomeContainingIgnoreCase(String nome);
}