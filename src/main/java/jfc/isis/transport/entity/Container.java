package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Container {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codec")
    private Integer codec;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "etat")
    private String etat;
    @Basic
    @Column(name = "contenu")
    private String contenu;
    @OneToMany(mappedBy = "containerByCodec")
    private Collection<Transportmateriel> transportmaterielsByCodec;

    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Objects.equals(codec, container.codec) && Objects.equals(type, container.type) && Objects.equals(etat, container.etat) && Objects.equals(contenu, container.contenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codec, type, etat, contenu);
    }

    public Collection<Transportmateriel> getTransportmaterielsByCodec() {
        return transportmaterielsByCodec;
    }

    public void setTransportmaterielsByCodec(Collection<Transportmateriel> transportmaterielsByCodec) {
        this.transportmaterielsByCodec = transportmaterielsByCodec;
    }
}
