package modelo;

import java.util.Date;

public class ReciboPago {
    private int id;
    private int pagoId;
    private String numeroRecibo;
    private Date fechaEmision;

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPagoId() { return pagoId; }
    public void setPagoId(int pagoId) { this.pagoId = pagoId; }

    public String getNumeroRecibo() { return numeroRecibo; }
    public void setNumeroRecibo(String numeroRecibo) { this.numeroRecibo = numeroRecibo; }

    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }
}

