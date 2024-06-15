package dio.lab_padroes_projeto.gof.repository;

import dio.lab_padroes_projeto.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
