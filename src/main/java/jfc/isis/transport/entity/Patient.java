package jfc.isis.transport.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ipp")
    private Integer ipp;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    @NotEmpty
    private String prenom;
    @Basic
    @Column(name = "datenaiss")
    private Date datenaiss;
    @OneToMany(mappedBy = "patientByIpp")
    private Collection<Examen> examenByIpp;
    @OneToMany(mappedBy = "patientByIpp")
    private Collection<Transportpersonne> transportpersonnesByIpp;

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
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

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(ipp, patient.ipp) && Objects.equals(nom, patient.nom) && Objects.equals(prenom, patient.prenom) && Objects.equals(datenaiss, patient.datenaiss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipp, nom, prenom, datenaiss);
    }

    public Collection<Examen> getExamenByIpp() {
        return examenByIpp;
    }

    public void setExamenByIpp(Collection<Examen> examenByIpp) {
        this.examenByIpp = examenByIpp;
    }

    public Collection<Transportpersonne> getTransportpersonnesByIpp() {
        return transportpersonnesByIpp;
    }

    public void setTransportpersonnesByIpp(Collection<Transportpersonne> transportpersonnesByIpp) {
        this.transportpersonnesByIpp = transportpersonnesByIpp;
    }
}
