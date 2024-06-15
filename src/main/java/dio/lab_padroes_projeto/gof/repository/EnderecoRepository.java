package dio.lab_padroes_projeto.gof.repository;

import dio.lab_padroes_projeto.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
