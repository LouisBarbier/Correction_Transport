package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Etablissement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codeet")
    private Integer codeet;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "adresse")
    private String adresse;
    @OneToMany(mappedBy = "etablissementByCodeet")
    private Collection<Service> servicesByCodeet;

    public Integer getCodeet() {
        return codeet;
    }

    public void setCodeet(Integer codeet) {
        this.codeet = codeet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etablissement that = (Etablissement) o;
        return Objects.equals(codeet, that.codeet) && Objects.equals(nom, that.nom) && Objects.equals(adresse, that.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeet, nom, adresse);
    }

    public Collection<Service> getServicesByCodeet() {
        return servicesByCodeet;
    }

    public void setServicesByCodeet(Collection<Service> servicesByCodeet) {
        this.servicesByCodeet = servicesByCodeet;
    }
}
