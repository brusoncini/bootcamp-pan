package me.dio.academia.digital.repository;


import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Filtra os alunos com base na data de nascimento
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
