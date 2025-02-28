package database;

import model.SanPham;
import utils.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class SanPhamDAO implements DAOInterface<SanPham> {

    @Override
    public ArrayList<SanPham> selectAll() {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM sanpham";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            // Bước 1: Lấy Connection
            conn = JDBCUtil.getConnection();
            
            // Bước 2: Tạo PreparedStatement
            stmt = conn.prepareStatement(sql);
            
            // Bước 3: Thực thi truy vấn
            rs = stmt.executeQuery();
            
            // Bước 4: Xử lý dữ liệu
            while (rs.next()) {
                SanPham sp = new SanPham(
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
                );
                list.add(sp);
            }
            JDBCUtil.close(conn);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }

    @Override
    public SanPham selectById(SanPham sp) {
        SanPham sanPham = null;
        String sql = "SELECT * FROM sanpham WHERE masanpham=?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, sp.getMasanpham());
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                 sanPham =new SanPham(
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
                );
            }
            
            JDBCUtil.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return sanPham;
    }

    @Override
    public int insert(SanPham sp) {
        int ketQua = 0;
        String sql = "INSERT INTO sanpham VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, sp.getMasanpham());
            stmt.setString(2, sp.getTensanpham());
            stmt.setString(3, sp.getHinhanhsanpham());
            stmt.setString(4, sp.getMausac());
            stmt.setString(5, sp.getKichco());
            stmt.setInt(6, sp.getSoluong());
            stmt.setString(7, sp.getKieumau());
            stmt.setDouble(8, sp.getGianhap());
            stmt.setDouble(9, sp.getGiaban());
            stmt.setInt(10, sp.getGiamgia());
            stmt.setString(11, sp.getMota());

            ketQua = stmt.executeUpdate();
            JDBCUtil.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            
        }
        return ketQua;
    }

    @Override
    public int delete(SanPham sp) {
        int ketQua = 0;
        String sql = "DELETE FROM sanpham WHERE masanpham=?";
        
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, sp.getMasanpham());
            
            ketQua = stmt.executeUpdate();
            JDBCUtil.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            
        }
        return ketQua;
    }

    @Override
    public int update(SanPham sp) {
        int ketQua = 0;
        String sql = "UPDATE sanpham SET tensanpham=?, hinhanhsanpham=?, mausac=?, kichco=?, soluong=?, kieumau=?, gianhap=?, giaban=?, giamgia=?, mota=? WHERE masanpham=?";
        
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, sp.getTensanpham());
            stmt.setString(2, sp.getHinhanhsanpham());
            stmt.setString(3, sp.getMausac());
            stmt.setString(4, sp.getKichco());
            stmt.setInt(5, sp.getSoluong());
            stmt.setString(6, sp.getKieumau());
            stmt.setDouble(7, sp.getGianhap());
            stmt.setDouble(8, sp.getGiaban());
            stmt.setInt(9, sp.getGiamgia());
            stmt.setString(10, sp.getMota());
            stmt.setString(11, sp.getMasanpham());

            ketQua =  stmt.executeUpdate();
            
            JDBCUtil.close(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return ketQua;
    }

    @Override
    public int insertAll(ArrayList<SanPham> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteAll(ArrayList<SanPham> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
