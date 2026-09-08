package edu.ucentral.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="eletronicos")
@Entity
public class Electronico extends PanacheEntity {

    @Column(name = "ele_serial")
    public long serial;
    @Column(name = "ele_marca")
    public String marca;
    @Column(name = "lote")
    public int lote;
}
