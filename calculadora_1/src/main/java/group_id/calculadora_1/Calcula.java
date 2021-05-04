/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group_id.calculadora_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gualv
 */
public class Calcula extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        DecimalFormat dezForm = new DecimalFormat("00.0");
        DecimalFormat cemForm = new DecimalFormat("000.0");
        
        try (PrintWriter out = response.getWriter()) {
            
            float dist = Float.parseFloat(request.getParameter("dist"));
            float time = Float.parseFloat(request.getParameter("time"));
            float cons = Float.parseFloat(request.getParameter("cons"));
            
            float velMedia = dist/time;
            float rendMedio = dist/cons;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcula</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Resultados: </h1>");
            out.println("<br> Velocidade média: " + cemForm.format(velMedia)+" Km/H <br>");
            if(velMedia >= 100)
                out.println("<br> Você corre muito!<br>");
            
            out.println("<br> Rendimento médio: " + dezForm.format(rendMedio)+" Km/L <br>");   
            if(rendMedio < 10)
                out.println("<br>Seu carro consome muito!<br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}