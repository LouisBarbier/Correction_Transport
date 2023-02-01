package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Service {
    @Id
    @Column(name = "codeservice")
    private String codeservice;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "batiment")
    private String batiment;
    @Basic
    @Column(name = "codeet", insertable = false, updatable = false)
    private Integer codeet;
    @OneToMany(mappedBy = "serviceByCodeservice")
    private Collection<Gare> garesByCodeservice;
    @ManyToOne
    @JoinColumn(name = "codeet", referencedColumnName = "codeet", nullable = false)
    private Etablissement etablissementByCodeet;
    @OneToMany(mappedBy = "serviceByCodeserviceServiceDepart")
    private Collection<Transportpersonne> transportpersonnesByCodeservice;
    @OneToMany(mappedBy = "serviceByCodeserviceServiceArrivee")
    private Collection<Transportpersonne> transportpersonnesByCodeservice_0;

    public String getCodeservice() {
        return codeservice;
    }

    public void setCodeservice(String codeservice) {
        this.codeservice = codeservice;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public Integer getCodeet() {
        return codeet;
    }

    public void setCodeet(Integer codeet) {
        this.codeet = codeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(codeservice, service.codeservice) && Objects.equals(nom, service.nom) && Objects.equals(batiment, service.batiment) && Objects.equals(codeet, service.codeet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeservice, nom, batiment, codeet);
    }

    public Collection<Gare> getGaresByCodeservice() {
        return garesByCodeservice;
    }

    public void setGaresByCodeservice(Collection<Gare> garesByCodeservice) {
        this.garesByCodeservice = garesByCodeservice;
    }

    public Etablissement getEtablissementByCodeet() {
        return etablissementByCodeet;
    }

    public void setEtablissementByCodeet(Etablissement etablissementByCodeet) {
        this.etablissementByCodeet = etablissementByCodeet;
    }

    public Collection<Transportpersonne> getTransportpersonnesByCodeservice() {
        return transportpersonnesByCodeservice;
    }

    public void setTransportpersonnesByCodeservice(Collection<Transportpersonne> transportpersonnesByCodeservice) {
        this.transportpersonnesByCodeservice = transportpersonnesByCodeservice;
    }

    public Collection<Transportpersonne> getTransportpersonnesByCodeservice_0() {
        return transportpersonnesByCodeservice_0;
    }

    public void setTransportpersonnesByCodeservice_0(Collection<Transportpersonne> transportpersonnesByCodeservice_0) {
        this.transportpersonnesByCodeservice_0 = transportpersonnesByCodeservice_0;
    }
}
