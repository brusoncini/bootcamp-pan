package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    // Retorna a lista de alunos matriculados residentes no bairro de parâmetro
    // List<Matricula> findByAlunoBairro(String bairro);

    // por Query
    // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
    // List<Matricula> findAlunosMatriculadosBairro(String bairro);

    // por Query nativa (como se fosse no DB
    @Query(value = "SELECT * FROM tb_matriculas m " +
            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
            "WHERE a.bairro = :bairro", nativeQuery = true)
    List<Matricula> findAlunosMatriculadosBairro(String bairro);


}
