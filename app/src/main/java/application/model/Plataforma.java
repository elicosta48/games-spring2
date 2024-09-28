package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarata.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import Jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataformas")
public class Plataforma {
    @Id
    @Generated.GeneratedValue(strategy = GeneratedType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private string nome;

    @ManyToMany(mappedBy = "plataformas")
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

public Set<Jogo> getJogos() {
    return jogos;
}

public void setJogos(Set<Jogo>) {
    this.jogos = jogos;
}
}

  