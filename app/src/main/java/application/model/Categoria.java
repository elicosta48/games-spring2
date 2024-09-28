package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Taple;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id; 
    }  

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<Jogos> jogos) {
        this.jogos = jogos;
    }
}