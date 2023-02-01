package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Departements {
    @Id
    @Column(name = "idept")
    private String idept;
    @Basic
    @Column(name = "nomdept")
    private String nomdept;
    @Basic
    @Column(name = "nbhab")
    private Integer nbhab;
    @Basic
    @Column(name = "codereg", insertable = false, updatable = false)
    private String codereg;
    @ManyToOne
    @JoinColumn(name = "codereg", referencedColumnName = "codereg", nullable = false)
    private Regions regionsByCodereg;

    public String getIdept() {
        return idept;
    }

    public void setIdept(String idept) {
        this.idept = idept;
    }

    public String getNomdept() {
        return nomdept;
    }

    public void setNomdept(String nomdept) {
        this.nomdept = nomdept;
    }

    public Integer getNbhab() {
        return nbhab;
    }

    public void setNbhab(Integer nbhab) {
        this.nbhab = nbhab;
    }

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departements that = (Departements) o;
        return Objects.equals(idept, that.idept) && Objects.equals(nomdept, that.nomdept) && Objects.equals(nbhab, that.nbhab) && Objects.equals(codereg, that.codereg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idept, nomdept, nbhab, codereg);
    }

    public Regions getRegionsByCodereg() {
        return regionsByCodereg;
    }

    public void setRegionsByCodereg(Regions regionsByCodereg) {
        this.regionsByCodereg = regionsByCodereg;
    }
}
