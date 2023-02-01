package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Regions {
    @Id
    @Column(name = "codereg")
    private String codereg;
    @Basic
    @Column(name = "nomreg")
    private String nomreg;
    @OneToMany(mappedBy = "regionsByCodereg")
    private Collection<Departements> departementsByCodereg;

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    public String getNomreg() {
        return nomreg;
    }

    public void setNomreg(String nomreg) {
        this.nomreg = nomreg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regions regions = (Regions) o;
        return Objects.equals(codereg, regions.codereg) && Objects.equals(nomreg, regions.nomreg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codereg, nomreg);
    }

    public Collection<Departements> getDepartementsByCodereg() {
        return departementsByCodereg;
    }

    public void setDepartementsByCodereg(Collection<Departements> departementsByCodereg) {
        this.departementsByCodereg = departementsByCodereg;
    }
}
