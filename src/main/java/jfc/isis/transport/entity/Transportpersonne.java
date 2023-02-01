package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Transportpersonne {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtransport")
    private Integer idtransport;
    @Basic
    @Column(name = "codeservice_service_depart", insertable = false, updatable = false)
    private String codeserviceServiceDepart;
    @Basic
    @Column(name = "ipp", insertable = false, updatable = false)
    private Integer ipp;
    @Basic
    @Column(name = "numexamen", insertable = false, updatable = false)
    private Integer numexamen;
    @Basic
    @Column(name = "codeservice_service_arrivee", insertable = false, updatable = false)
    private String codeserviceServiceArrivee;
    @Basic
    @Column(name = "date_t")
    private Date dateT;
    @Basic
    @Column(name = "heuredepart")
    private Time heuredepart;
    @Basic
    @Column(name = "heurearrivee")
    private Time heurearrivee;

    @ManyToOne
    @JoinColumn(name = "codeservice_service_depart", referencedColumnName = "codeservice", nullable = false)
    private Service serviceByCodeserviceServiceDepart;
    @ManyToOne
    @JoinColumn(name = "ipp", referencedColumnName = "ipp", nullable = false)
    private Patient patientByIpp;
    @ManyToOne
    @JoinColumn(name = "numexamen", referencedColumnName = "numexamen", nullable = false)
    private Examen examenByNumexamen;
    @ManyToOne
    @JoinColumn(name = "codeservice_service_arrivee", referencedColumnName = "codeservice", nullable = false)
    private Service serviceByCodeserviceServiceArrivee;

    public Collection<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(Collection<Personnel> personnels) {
        this.personnels = personnels;
    }

    @ManyToMany
    @JoinTable(name = "effectuer",
        joinColumns =
            @JoinColumn(name = "idtransport", referencedColumnName = "idtransport", nullable = false),
        inverseJoinColumns =
            @JoinColumn(name = "code", referencedColumnName = "code", nullable = false)
    )
    private Collection<Personnel> personnels;
    public Integer getIdtransport() {
        return idtransport;
    }

    public void setIdtransport(Integer idtransport) {
        this.idtransport = idtransport;
    }

    public String getCodeserviceServiceDepart() {
        return codeserviceServiceDepart;
    }

    public void setCodeserviceServiceDepart(String codeserviceServiceDepart) {
        this.codeserviceServiceDepart = codeserviceServiceDepart;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public Integer getNumexamen() {
        return numexamen;
    }

    public void setNumexamen(Integer numexamen) {
        this.numexamen = numexamen;
    }

    public String getCodeserviceServiceArrivee() {
        return codeserviceServiceArrivee;
    }

    public void setCodeserviceServiceArrivee(String codeserviceServiceArrivee) {
        this.codeserviceServiceArrivee = codeserviceServiceArrivee;
    }

    public Date getDateT() {
        return dateT;
    }

    public void setDateT(Date dateT) {
        this.dateT = dateT;
    }

    public Time getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(Time heuredepart) {
        this.heuredepart = heuredepart;
    }

    public Time getHeurearrivee() {
        return heurearrivee;
    }

    public void setHeurearrivee(Time heurearrivee) {
        this.heurearrivee = heurearrivee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transportpersonne that = (Transportpersonne) o;
        return Objects.equals(idtransport, that.idtransport) && Objects.equals(codeserviceServiceDepart, that.codeserviceServiceDepart) && Objects.equals(ipp, that.ipp) && Objects.equals(numexamen, that.numexamen) && Objects.equals(codeserviceServiceArrivee, that.codeserviceServiceArrivee) && Objects.equals(dateT, that.dateT) && Objects.equals(heuredepart, that.heuredepart) && Objects.equals(heurearrivee, that.heurearrivee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtransport, codeserviceServiceDepart, ipp, numexamen, codeserviceServiceArrivee, dateT, heuredepart, heurearrivee);
    }

    public Service getServiceByCodeserviceServiceDepart() {
        return serviceByCodeserviceServiceDepart;
    }

    public void setServiceByCodeserviceServiceDepart(Service serviceByCodeserviceServiceDepart) {
        this.serviceByCodeserviceServiceDepart = serviceByCodeserviceServiceDepart;
    }

    public Patient getPatientByIpp() {
        return patientByIpp;
    }

    public void setPatientByIpp(Patient patientByIpp) {
        this.patientByIpp = patientByIpp;
    }

    public Examen getExamenByNumexamen() {
        return examenByNumexamen;
    }

    public void setExamenByNumexamen(Examen examenByNumexamen) {
        this.examenByNumexamen = examenByNumexamen;
    }

    public Service getServiceByCodeserviceServiceArrivee() {
        return serviceByCodeserviceServiceArrivee;
    }

    public void setServiceByCodeserviceServiceArrivee(Service serviceByCodeserviceServiceArrivee) {
        this.serviceByCodeserviceServiceArrivee = serviceByCodeserviceServiceArrivee;
    }
}
