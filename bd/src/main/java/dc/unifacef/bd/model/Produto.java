package dc.unifacef.bd.model;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //cada registro tem sua própria identidade no bd
    private Long id;  //long é um número inteiro muito grande
    @Column (nullable = false)   //não pode ser falso
    private String nome;
    @Column (nullable = false)
    private Double preco;
    @Column (length = 500)
    private String descricao;

}
