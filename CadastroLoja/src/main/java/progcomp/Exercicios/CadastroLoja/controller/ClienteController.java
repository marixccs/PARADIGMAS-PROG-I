package progcomp.Exercicios.CadastroLoja.controller;

import progcomp.Exercicios.CadastroLoja.model.Cliente;
import progcomp.Exercicios.CadastroLoja.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService service;

    // GET
    @GetMapping
    public ResponseEntity<ArrayList<Cliente>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    // POST
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente novo = service.criar(cliente);
        URI uri = URI.create("/clientes/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        if (service.remove(id)) {
            return ResponseEntity.noContent().build();
        }
        else{
        return ResponseEntity.notFound().build();
        }
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualiza(@PathVariable Long id,
                                            @RequestBody Cliente novo){
        Cliente resposta = service.atualiza(id, novo);
        return (resposta != null) ? ResponseEntity.ok(resposta) : ResponseEntity.notFound().build();
    }
}