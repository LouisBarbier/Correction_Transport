package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Personnel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private Integer code;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;

    public Collection<Transportpersonne> getTransportPersonnes() {
        return transportPersonnes;
    }

    public void setTransportPersonnes(Collection<Transportpersonne> transportPersonnes) {
        this.transportPersonnes = transportPersonnes;
    }

    @ManyToMany
    @JoinTable(name = "effectuer",
        joinColumns =
            @JoinColumn(name = "code", referencedColumnName = "code", nullable = false),
        inverseJoinColumns =
            @JoinColumn(name = "idtransport", referencedColumnName = "idtransport", nullable = false)
    )
    private Collection<Transportpersonne> transportPersonnes;
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return Objects.equals(code, personnel.code) && Objects.equals(nom, personnel.nom) && Objects.equals(prenom, personnel.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nom, prenom);
    }

}
