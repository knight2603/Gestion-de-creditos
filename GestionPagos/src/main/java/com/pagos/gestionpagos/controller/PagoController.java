package com.pagos.gestionpagos.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;
import modelo.Pago;
import modelo.PagoDAO;

@WebServlet("/PagoController")
public class PagoController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if ("registrar".equals(accion)) {
            try {
                int creditoId = Integer.parseInt(request.getParameter("creditoId"));
                double monto = Double.parseDouble(request.getParameter("monto"));
                String tipoPago = request.getParameter("tipoPago");

                Pago p = new Pago();
                p.setCreditoId(creditoId);
                p.setMontoPago(monto);
                p.setFechaPago(new Date());
                p.setTipoPago(tipoPago);

                PagoDAO dao = new PagoDAO();

                // ✅ Registrar pago y obtener el ID generado
                int pagoId = dao.registrarPago(p);

                // ✅ Actualizar saldo del crédito
                dao.actualizarSaldo(creditoId, monto, tipoPago);

                // ✅ Generar recibo de pago
                if (pagoId > 0) {
                    dao.generarRecibo(pagoId);
                }

                response.sendRedirect("registro_exitoso.jsp");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("error.jsp");
            }
        }
    }
}




