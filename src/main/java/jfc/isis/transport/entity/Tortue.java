package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Tortue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codet")
    private Integer codet;
    @Basic
    @Column(name = "nom")
    private String nom;
    @OneToMany(mappedBy = "tortueByCodet")
    private Collection<Transportmateriel> transportmaterielsByCodet;

    public Integer getCodet() {
        return codet;
    }

    public void setCodet(Integer codet) {
        this.codet = codet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tortue tortue = (Tortue) o;
        return Objects.equals(codet, tortue.codet) && Objects.equals(nom, tortue.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codet, nom);
    }

    public Collection<Transportmateriel> getTransportmaterielsByCodet() {
        return transportmaterielsByCodet;
    }

    public void setTransportmaterielsByCodet(Collection<Transportmateriel> transportmaterielsByCodet) {
        this.transportmaterielsByCodet = transportmaterielsByCodet;
    }
}
