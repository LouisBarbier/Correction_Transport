package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Gare {
    @Id
    @Column(name = "codeg")
    private String codeg;
    @Basic
    @Column(name = "codeservice", insertable = false, updatable = false)
    private String codeservice;
    @Basic
    @Column(name = "nomgare")
    private String nomgare;
    @Basic
    @Column(name = "type")
    private String type;
    @ManyToOne
    @JoinColumn(name = "codeservice", referencedColumnName = "codeservice", nullable = false)
    private Service serviceByCodeservice;
    @OneToMany(mappedBy = "gareByCodegGareDepart")
    private Collection<Transportmateriel> transportmaterielsByCodeg;
    @OneToMany(mappedBy = "gareByCodegGareArrivee")
    private Collection<Transportmateriel> transportmaterielsByCodeg_0;

    public String getCodeg() {
        return codeg;
    }

    public void setCodeg(String codeg) {
        this.codeg = codeg;
    }

    public String getCodeservice() {
        return codeservice;
    }

    public void setCodeservice(String codeservice) {
        this.codeservice = codeservice;
    }

    public String getNomgare() {
        return nomgare;
    }

    public void setNomgare(String nomgare) {
        this.nomgare = nomgare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gare gare = (Gare) o;
        return Objects.equals(codeg, gare.codeg) && Objects.equals(codeservice, gare.codeservice) && Objects.equals(nomgare, gare.nomgare) && Objects.equals(type, gare.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeg, codeservice, nomgare, type);
    }

    public Service getServiceByCodeservice() {
        return serviceByCodeservice;
    }

    public void setServiceByCodeservice(Service serviceByCodeservice) {
        this.serviceByCodeservice = serviceByCodeservice;
    }

    public Collection<Transportmateriel> getTransportmaterielsByCodeg() {
        return transportmaterielsByCodeg;
    }

    public void setTransportmaterielsByCodeg(Collection<Transportmateriel> transportmaterielsByCodeg) {
        this.transportmaterielsByCodeg = transportmaterielsByCodeg;
    }

    public Collection<Transportmateriel> getTransportmaterielsByCodeg_0() {
        return transportmaterielsByCodeg_0;
    }

    public void setTransportmaterielsByCodeg_0(Collection<Transportmateriel> transportmaterielsByCodeg_0) {
        this.transportmaterielsByCodeg_0 = transportmaterielsByCodeg_0;
    }
}
