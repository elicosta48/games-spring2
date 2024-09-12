package application.model;
 
import java.util.HashSet;
import java.util.Set;

import jakarta.persintence.Column;
import jakarta.persintence.Entity;
import jakarta.persintence.GeneratedValue;
import jakarta.persintence.GenerateType;
import jakarta.persintence.Id;
import jakarta.persintence.OneToMany;
import Jakarata.persintence.Table;

@Entity
@Table(name: "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<jogo> jogos = new HashSet<>();

    public long getId() {
        retun id;
    }

    public void setId(long id) {
        this.id = id; 
    }  

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
        this.nome;
    }

    public Set<jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<Jogos> jogos) {
        this.jogos = jogos;
    }
}
