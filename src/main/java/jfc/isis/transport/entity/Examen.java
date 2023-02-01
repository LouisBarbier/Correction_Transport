package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Examen {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numexamen")
    private Integer numexamen;
    @Basic
    @Column(name = "ipp", insertable = false, updatable = false)
    private Integer ipp;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "natureacte")
    private String natureacte;
    @Basic
    @Column(name = "contagiosite")
    private Integer contagiosite;
    @Basic
    @Column(name = "date_e")
    private Date dateE;
    @Basic
    @Column(name = "heure")
    private Time heure;
    @Basic
    @Column(name = "commentaire")
    private String commentaire;
    @ManyToOne
    @JoinColumn(name = "ipp", referencedColumnName = "ipp", nullable = false)
    private Patient patientByIpp;
    @OneToMany(mappedBy = "examenByNumexamen")
    private Collection<Transportpersonne> transportpersonnesByNumexamen;

    public Integer getNumexamen() {
        return numexamen;
    }

    public void setNumexamen(Integer numexamen) {
        this.numexamen = numexamen;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNatureacte() {
        return natureacte;
    }

    public void setNatureacte(String natureacte) {
        this.natureacte = natureacte;
    }

    public Integer getContagiosite() {
        return contagiosite;
    }

    public void setContagiosite(Integer contagiosite) {
        this.contagiosite = contagiosite;
    }

    public Date getDateE() {
        return dateE;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examen examen = (Examen) o;
        return Objects.equals(numexamen, examen.numexamen) && Objects.equals(ipp, examen.ipp) && Objects.equals(type, examen.type) && Objects.equals(natureacte, examen.natureacte) && Objects.equals(contagiosite, examen.contagiosite) && Objects.equals(dateE, examen.dateE) && Objects.equals(heure, examen.heure) && Objects.equals(commentaire, examen.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numexamen, ipp, type, natureacte, contagiosite, dateE, heure, commentaire);
    }

    public Patient getPatientByIpp() {
        return patientByIpp;
    }

    public void setPatientByIpp(Patient patientByIpp) {
        this.patientByIpp = patientByIpp;
    }

    public Collection<Transportpersonne> getTransportpersonnesByNumexamen() {
        return transportpersonnesByNumexamen;
    }

    public void setTransportpersonnesByNumexamen(Collection<Transportpersonne> transportpersonnesByNumexamen) {
        this.transportpersonnesByNumexamen = transportpersonnesByNumexamen;
    }
}
