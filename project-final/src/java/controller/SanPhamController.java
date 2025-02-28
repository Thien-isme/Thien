/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.SanPhamDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SanPham;
import utils.JDBCUtil;

/**
 *
 * @author Thien
 */
@WebServlet(name = "SanPhamController", urlPatterns = {"/san-pham"})
public class SanPhamController extends HttpServlet {

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
        String hanhdong = request.getParameter("hanhdong");

        if (hanhdong.equals("searchByConditions")) {
            searchByConditions(request, response);
        }

    }

    private void searchByConditions(HttpServletRequest request, HttpServletResponse response) {
        try {

            String types = request.getParameter("types");
            String color = request.getParameter("color");

            String size = request.getParameter("size");
            String price = request.getParameter("price");

            String sql = "SELECT * FROM sanpham WHERE 1=1";

// Lọc theo loại mũ (Fullface, Half-Helmet, Three-Quarter)
            if (request.getParameter("types") != null && !request.getParameter("types").isEmpty()) {
                sql += " AND kieumau = ?";
            }

            if (request.getParameter("color") != null && !request.getParameter("color").isEmpty()) {
                sql += " AND mausac = ?";
            }

// Lọc theo size (S, M, L, XL)
            if (request.getParameter("size") != null && !request.getParameter("size").isEmpty()) {
                sql += " AND kichco = ?";
            }

// Lọc theo khoảng giá (200000-500000, 500000-1000000, ...)
            if (request.getParameter("price") != null && !request.getParameter("price").isEmpty()) {
                String priceRange = request.getParameter("price");
                String[] prices = priceRange.split("-");
                sql += " AND giaban BETWEEN ? AND ?";
            }

// Thêm điều kiện sắp xếp
            String sort = request.getParameter("sort-filter");
            if (sort != null && !sort.isEmpty()) {
                switch (sort) {
                    case "price-asc":
                        sql += " ORDER BY giaban ASC";
                        break;
                    case "price-desc":
                        sql += " ORDER BY giaban DESC";
                        break;
                    case "newest":
                        sql += " ORDER BY masanpham DESC"; // Giả sử mã sản phẩm tăng dần theo thời gian
                        break;
                }
            }
            Connection conn = JDBCUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            int index = 1;

// Gán giá trị cho câu SQL
            if (request.getParameter("types") != null && !request.getParameter("types").isEmpty()) {
                ps.setString(index++, request.getParameter("types"));
            }

            if (request.getParameter("color") != null && !request.getParameter("color").isEmpty()) {
                ps.setString(index++, request.getParameter("color"));
            }

            if (request.getParameter("size") != null && !request.getParameter("size").isEmpty()) {
                ps.setString(index++, request.getParameter("size"));
            }

            if (request.getParameter("price") != null && !request.getParameter("price").isEmpty()) {
                String[] prices = request.getParameter("price").split("-");
                ps.setInt(index++, Integer.parseInt(prices[0]));
                ps.setInt(index++, Integer.parseInt(prices[1]));
            }

// Thực thi truy vấn
            ResultSet rs = ps.executeQuery();
            ArrayList<SanPham> list = new ArrayList<SanPham>();
            while (rs.next()) {
                list.add(new SanPham(
                        rs.getString("masanpham"),
                        rs.getString("tensanpham"),
                        rs.getString("hinhanhsanpham"),
                        rs.getString("mausac"),
                        rs.getString("kichco"),
                        rs.getInt("soluong"),
                        rs.getString("kieumau"),
                        rs.getDouble("gianhap"),
                        rs.getDouble("giaban"),
                        rs.getInt("giamgia"),
                        rs.getString("mota")
                ));
            }
            conn.close();

            HttpSession session = request.getSession(false);
            request.setAttribute("types", types);
            request.setAttribute("color", color);

            request.setAttribute("size", size);

            request.setAttribute("price", price);
            String nextaction ="hanhdong=searchByConditions&types="+types+"&color="+color+"&size="+ size+"&price="+price;
            request.setAttribute("nextaction", nextaction);
            
            session.setAttribute("list", list);

            request.getRequestDispatcher("/GUI/shop.jsp").forward(request, response);
        } catch (Exception e) {
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
