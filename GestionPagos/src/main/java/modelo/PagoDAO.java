package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PagoDAO {

    // Registra el pago y retorna el ID generado
    public int registrarPago(Pago p) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO pagos (credito_id, monto_pago, fecha_pago, tipo_pago) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p.getCreditoId());
            ps.setDouble(2, p.getMontoPago());
            ps.setDate(3, new java.sql.Date(p.getFechaPago().getTime()));
            ps.setString(4, p.getTipoPago());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int pagoId = rs.getInt(1);
                System.out.println("✅ Pago registrado correctamente con ID: " + pagoId);
                return pagoId;
            }

        } catch (Exception e) {
            System.out.println("❌ Error al registrar el pago: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return -1;
    }

    // Actualiza el saldo del crédito
    public void actualizarSaldo(int creditoId, double montoPagado, String tipoPago) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexion.getConnection();
            String sql;

            if ("parcial".equalsIgnoreCase(tipoPago)) {
                sql = "UPDATE creditos SET monto = monto - ? WHERE id = ?";
                ps = con.prepareStatement(sql);
                ps.setDouble(1, montoPagado);
                ps.setInt(2, creditoId);
            } else if ("total".equalsIgnoreCase(tipoPago)) {
                sql = "UPDATE creditos SET monto = 0 WHERE id = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, creditoId);
            } else {
                System.out.println("⚠️ Tipo de pago no reconocido.");
                return;
            }

            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("✅ Saldo actualizado correctamente");
            } else {
                System.out.println("⚠️ No se encontró crédito con ese ID");
            }

        } catch (Exception e) {
            System.out.println("❌ Error al actualizar el saldo: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // Genera el recibo de pago automáticamente
    public void generarRecibo(int pagoId) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexion.getConnection();
            String numeroRecibo = "RCP-" + System.currentTimeMillis(); // valor único

            String sql = "INSERT INTO recibos_pago (pago_id, numero_recibo, fecha_emision) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, pagoId);
            ps.setString(2, numeroRecibo);
            ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));

            ps.executeUpdate();
            System.out.println("✅ Recibo generado correctamente: " + numeroRecibo);
        } catch (Exception e) {
            System.out.println("❌ Error al generar el recibo: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}



