package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Many.ToOne;
import jakarta.persistence.Table;

@Entity
@Table ( name = "jogos")
public class jogo{
    @Id 
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private lng id;
    @Column(nullable = true)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
        name = "jogos_possuem_plataformas",
        JoinColumns = @JoinColumn(name = "id_jogos"),
        inversrJoinColumns = @JoinColumn( name = "id_plataformas"))
    private Set<Plataforma> plataformas = new HashSet<>();  
    
    public long getId() {
        return id;


    }
     public  void setId(long id) {
        this.id = id;
     
    }


}