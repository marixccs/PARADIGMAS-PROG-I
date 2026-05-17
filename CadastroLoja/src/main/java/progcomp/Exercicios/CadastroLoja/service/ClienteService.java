package progcomp.Exercicios.CadastroLoja.service;

import progcomp.Exercicios.CadastroLoja.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    private long contador = 1;

    // LISTAR
    public ArrayList<Cliente> listar() {
        return this.clientes;
    }

    // CRIAR
    public Cliente criar(Cliente cliente) {

        cliente.setId(contador);

        this.clientes.add(cliente);

        contador++;

        return cliente;
    }

    // BUSCAR POR ID
    public Cliente buscarPorId(Long id) {

        for (Cliente c : clientes) {

            if (c.getId().equals(id)) {
                return c;
            }
        }

        return null;
    }

    // REMOVER
    public boolean remove(Long id) {

        return clientes.removeIf(c -> c.getId().equals(id));
    }

    // ATUALIZAR
    public Cliente atualiza(Long id, Cliente novo) {

        novo.setId(id);

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getId().equals(id)) {

                clientes.set(i, novo);

                return novo;
            }
        }

        return null;
    }
}