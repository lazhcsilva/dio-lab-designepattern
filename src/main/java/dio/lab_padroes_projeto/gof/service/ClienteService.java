package dio.lab_padroes_projeto.gof.service;

import dio.lab_padroes_projeto.gof.model.Cliente;

/***
 * Interface que define o padrão <b>Strategy</b> do domínio de cliente.
 *
 * @author lazhcsilva
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
