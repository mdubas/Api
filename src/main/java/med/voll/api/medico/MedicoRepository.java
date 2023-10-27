package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//abaixo extende a interface com respository, com o tipo de entidade e o tipo do tributo da primary key.
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
