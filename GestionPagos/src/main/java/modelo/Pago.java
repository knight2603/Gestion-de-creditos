package modelo;

import java.util.Date;

public class Pago {
    private int id; // representa el campo "id" en la tabla
    private int creditoId; // representa "credito_id"
    private double montoPago; // representa "monto_pago"
    private Date fechaPago; // representa "fecha_pago"
    private String tipoPago; // representa "tipo_pago"

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCreditoId() { return creditoId; }
    public void setCreditoId(int creditoId) { this.creditoId = creditoId; }

    public double getMontoPago() { return montoPago; }
    public void setMontoPago(double montoPago) { this.montoPago = montoPago; }

    public Date getFechaPago() { return fechaPago; }
    public void setFechaPago(Date fechaPago) { this.fechaPago = fechaPago; }

    public String getTipoPago() { return tipoPago; }
    public void setTipoPago(String tipoPago) { this.tipoPago = tipoPago; }
}

