package jfc.isis.transport.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Transportmateriel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtransport")
    private Integer idtransport;
    @Basic
    @Column(name = "codet", insertable = false, updatable = false)
    private Integer codet;
    @Basic
    @Column(name = "codec", insertable = false, updatable = false)
    private Integer codec;
    @Basic
    @Column(name = "codeg_gare_depart", insertable = false, updatable = false)
    private String codegGareDepart;
    @Basic
    @Column(name = "codeg_gare_arrivee", insertable = false, updatable = false)
    private String codegGareArrivee;
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
    @JoinColumn(name = "codet", referencedColumnName = "codet", nullable = false)
    private Tortue tortueByCodet;
    @ManyToOne
    @JoinColumn(name = "codec", referencedColumnName = "codec", nullable = false)
    private Container containerByCodec;
    @ManyToOne
    @JoinColumn(name = "codeg_gare_depart", referencedColumnName = "codeg", nullable = false)
    private Gare gareByCodegGareDepart;
    @ManyToOne
    @JoinColumn(name = "codeg_gare_arrivee", referencedColumnName = "codeg", nullable = false)
    private Gare gareByCodegGareArrivee;

    public Integer getIdtransport() {
        return idtransport;
    }

    public void setIdtransport(Integer idtransport) {
        this.idtransport = idtransport;
    }

    public Integer getCodet() {
        return codet;
    }

    public void setCodet(Integer codet) {
        this.codet = codet;
    }

    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public String getCodegGareDepart() {
        return codegGareDepart;
    }

    public void setCodegGareDepart(String codegGareDepart) {
        this.codegGareDepart = codegGareDepart;
    }

    public String getCodegGareArrivee() {
        return codegGareArrivee;
    }

    public void setCodegGareArrivee(String codegGareArrivee) {
        this.codegGareArrivee = codegGareArrivee;
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
        Transportmateriel that = (Transportmateriel) o;
        return Objects.equals(idtransport, that.idtransport) && Objects.equals(codet, that.codet) && Objects.equals(codec, that.codec) && Objects.equals(codegGareDepart, that.codegGareDepart) && Objects.equals(codegGareArrivee, that.codegGareArrivee) && Objects.equals(dateT, that.dateT) && Objects.equals(heuredepart, that.heuredepart) && Objects.equals(heurearrivee, that.heurearrivee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtransport, codet, codec, codegGareDepart, codegGareArrivee, dateT, heuredepart, heurearrivee);
    }

    public Tortue getTortueByCodet() {
        return tortueByCodet;
    }

    public void setTortueByCodet(Tortue tortueByCodet) {
        this.tortueByCodet = tortueByCodet;
    }

    public Container getContainerByCodec() {
        return containerByCodec;
    }

    public void setContainerByCodec(Container containerByCodec) {
        this.containerByCodec = containerByCodec;
    }

    public Gare getGareByCodegGareDepart() {
        return gareByCodegGareDepart;
    }

    public void setGareByCodegGareDepart(Gare gareByCodegGareDepart) {
        this.gareByCodegGareDepart = gareByCodegGareDepart;
    }

    public Gare getGareByCodegGareArrivee() {
        return gareByCodegGareArrivee;
    }

    public void setGareByCodegGareArrivee(Gare gareByCodegGareArrivee) {
        this.gareByCodegGareArrivee = gareByCodegGareArrivee;
    }
}
