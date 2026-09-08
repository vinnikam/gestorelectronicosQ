package edu.ucentral.infraestructura;

import jakarta.persistence.Column;

public class ElectronicoDto {
    private long serial;
    private String marca;
    private int lote;

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
}
