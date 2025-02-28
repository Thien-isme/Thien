package controller;

import database.KhachHangDAO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.KhachHang;
import utils.Email;
import utils.OTP;
import utils.Time;

@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50 // 50MB
)

@WebServlet(name = "KhachHangController", urlPatterns = {"/khach-hang"})
public class KhachHangController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hanhdong = request.getParameter("hanhdong");
        System.out.println(hanhdong);
        if (hanhdong.equals("register")) {
            register(request, response);
        } else if (hanhdong.equals("login")) {
            login(request, response);
        } else if (hanhdong.equals("updateProfile")) {
            updateProfile(request, response);
        } else if (hanhdong.equals("logout")) {
            logout(request, response);
        } else if (hanhdong.equals("resetpassword")) {
            resetPassword(request, response);
        } else if (hanhdong.equals("viaemailbeforeresetpassword")) {
            viaemailbeforeresetpassword(request, response);
        } else if(hanhdong.equals("updateavatar")){
            updateavatar(request,response);
        }

    }
    
    

    private void register(HttpServletRequest request, HttpServletResponse response) {
        String error = "";

        String url = "";
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String confirmpassword = request.getParameter("confirmpassword");
            String email = request.getParameter("email");

            // set attribute trả về để không phải nhập lại từng cái nếu sai
            request.setAttribute("username", username);
            request.setAttribute("email", email);

            // Kiểm tra khách hàng có nhập thông tin hay chưa
            if (username.length() == 0) {
                error += "Tên đăng nhập không được để trống";
            }
            if (password.length() == 0) {
                error += "Password không được để trống";
            }
            if (confirmpassword.length() == 0) {
                error += "Confirm Password không được để trống";
            }
            if (email.length() == 0) {
                error += "Email không được để trống";
            }

            // Nếu tên đăng nhập bị trùng (chưa làm)
            // Nếu email bị trùng (chưa làm)
            // Kiểm tra regex coi có phải là dạng email hay không (chưa làm)
            // Kiểm tra password và confirmpassword 
            if (password.equals(confirmpassword) == false) {
                error += "Mật khẩu và mật khẩu nhập lại KHÔNG TRÙNG KHỚP. Vui lòng kiểm tra lại!";
            }

            // mã hóa mật khẩu (chưa làm)
            //Trả về báo lỗi nếu có
            if (error.length() > 0) {
                request.setAttribute("error", error);
                // Quay lại trang đăng nhập
                url = "/khachhang/register.jsp";
            } else { // nếu không có lỗi thì tạo đối tượng Khách Hàng lưu xuống
                // Tạo ra mã khách hàng
                Random rd = new Random();
                String maKhachHang = System.currentTimeMillis() + rd.nextInt(1000) + "";
                KhachHang kh = new KhachHang(maKhachHang, username, password, email);

                KhachHangDAO khachHangDao = new KhachHangDAO();
                khachHangDao.insert(kh);
                url = "/khachhang/registersuccess.jsp";

            }

            // Tạo KhachHang lưu xuống CSDL
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            System.out.println(url);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void login(HttpServletRequest request, HttpServletResponse response) {
        String error = "";

        String url = "";
        try {
            String username_or_email = request.getParameter("username_or_email");
            String password = request.getParameter("password");

            // set attribute trả về để không phải nhập lại từng cái nếu sai
            request.setAttribute("username_or_email", username_or_email);

            // Kiểm tra khách hàng có nhập thông tin hay chưa
            if (username_or_email.length() == 0) {
                error += "Bạn chưa nhập tên đăng nhập";
            }
            if (password.length() == 0) {
                error += "Bạn chưa nhập Password";
            }

            // mã hóa mật khẩu (chưa làm)
            //Trả về báo lỗi nếu có
            if (error.length() > 0) {
                request.setAttribute("error", error);
                // Quay lại trang đăng nhập
                url = "/khachhang/loginsuccess.jsp";
            } else { // nếu không có lỗi thì Chuyển sang trang chính              
                KhachHang khachHang = new KhachHang(username_or_email, password);
                KhachHangDAO khachHangDAO = new KhachHangDAO();
                khachHang = khachHangDAO.selectByUsernameAndPassword(khachHang);

                // Kiểm tra kh được lấy lên từ CSDL có đúng hay không
                if (khachHang != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("khachHang", khachHang);
                    url = "/index.jsp";
                } else {
                    url = "/khachhang/login.jsp";
                }

            }

            // Tạo KhachHang lưu xuống CSDL
        } catch (Exception e) {

            e.printStackTrace();
        }

        // Điều hướng chương trình đừng sửa gì phần này
        System.out.println("url=" + url);
        try {
            RequestDispatcher rdd = getServletContext().getRequestDispatcher(url);
            rdd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void updateProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maKhachHang = request.getParameter("maKhachHang");
        try {
            if (maKhachHang == null || maKhachHang.isEmpty()) {
                request.getRequestDispatcher("khachhang/updateprofile.jsp").forward(request, response);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ghi log lỗi để kiểm tra nếu cần
        }

        String hoVaTen = request.getParameter("hoVaTen");
        String gioiTinh = request.getParameter("gioiTinh");
        String ngaySinhStr = request.getParameter("ngaySinh");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChiKhachHang = request.getParameter("diaChiKhachHang");
        String diaChiNhanHang = request.getParameter("diaChiNhanHang");
        String dangKyNhanBangTinStr = request.getParameter("dangKyNhanBangTin");

        boolean dangKyNhanBangTin = "on".equals(dangKyNhanBangTinStr) || "yes".equals(dangKyNhanBangTinStr);
        Date ngaySinh = null;
        try {
            ngaySinh = Date.valueOf(ngaySinhStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String quocGia = request.getParameter("quocGia");
        request.setAttribute("hoVaTen", hoVaTen);
        request.setAttribute("gioiTinh", gioiTinh);
        request.setAttribute("ngaySinh", ngaySinh);
        request.setAttribute("soDienThoai", soDienThoai);
        request.setAttribute("email", email);
        request.setAttribute("diaChiKhachHang", diaChiKhachHang);
        request.setAttribute("diaChiNhanHang", diaChiNhanHang);
        request.setAttribute("dangKyNhanBangTin", dangKyNhanBangTin);
        request.setAttribute("quocGia", quocGia);
        System.out.println(gioiTinh);
        KhachHang kh = new KhachHang(maKhachHang, hoVaTen, gioiTinh, ngaySinh, soDienThoai, email, quocGia, diaChiKhachHang, diaChiNhanHang, dangKyNhanBangTin);
        KhachHangDAO khachHangDao = new KhachHangDAO();
        int isUpdate = khachHangDao.update(kh);

        String url = "./khachhang/registersuccess.jsp";
        try {
            response.sendRedirect(url);
        } catch (IOException ex) {

        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();

            // Hủy bỏ session
            session.invalidate();

            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" + request.getContextPath();

            response.sendRedirect(url + "/index.jsp");
        } catch (Exception e) {
            System.out.println("Log-out thất bại");
            e.printStackTrace();
        }
    }

    private void resetPassword(HttpServletRequest request, HttpServletResponse response) {
        try {
            String password = request.getParameter("password");
            String newPassword = request.getParameter("newPassword");
            String newPasswordConfirm = request.getParameter("newPasswordConfirm");

            String error = "";
            String url = "";

            HttpSession session = request.getSession();
            Object obj = session.getAttribute("khachHang");
            KhachHang khachHang = null;
            if (obj != null) {
                khachHang = (KhachHang) obj;
            }

            if (password.length() == 0) {
                error += "password không được để trống";
            }

            if (!password.equals(khachHang.getMatKhau())) {
                error += "password hiện tại không đúng";
            }

            if (newPassword.length() == 0) {
                error += "NewPassword không được để trống";
            }

            if (newPasswordConfirm.length() == 0) {
                error += "NewPassword không được để trống";
            }

            if (!newPassword.equals(newPasswordConfirm)) {
                error += "NewPassword và NewPasswordConfirm KHÔNG KHỚP";
            }

            request.setAttribute("error", error);

            if (error.length() > 0) {
                url = "/khachhang/resetpassword.jsp";
            } else {
                url = "/khachhang/viaemailbeforeresetpassword.jsp";
                
                // Cập nhật newPassword để qua viaemailbeforeresetpassword có thể lưu xuống
                khachHang.setMatKhau(newPassword);
                
                // Gửi mail để khách hàng nhận OTP

            
                // Cập nhật OTP và thời gian xác thực xuống CSDL để qua trang VIA check
                String maXacThuc = OTP.getOTP();
                String timeLate = Time.timeNowPlus_X_minutes(10);
                
                khachHang.setMaXacThuc(maXacThuc);
                khachHang.setThoiGianHieuLucMaXacThuc(timeLate);
                khachHang.setTrangThaiXacThuc("0");
                
                

                KhachHangDAO dao = new KhachHangDAO();
                if (dao.updateMaXacThuc(khachHang) > 0) {
                    System.out.println("Cập nhật OTP thành công");
                    
                    // gửi OTP đến mail
                    Email.sendEmailTo(khachHang.getEmail(), khachHang.getMaXacThuc());
                }
            }

            System.out.println("error=" + error);
            System.out.println("url=" + url);

//            request.setAttribute("khachHang", khachHang);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);

        } catch (Exception e) {
            System.out.println("Lỗi ở resetPassword");
            e.printStackTrace();
        }
    }

    private void viaemailbeforeresetpassword(HttpServletRequest request, HttpServletResponse response) {
        try {
            String sortOTP = request.getParameter("sortOTP");

            HttpSession session = request.getSession();
            Object obj = session.getAttribute("khachHang");
            KhachHang khachHang = null;
            if (obj != null) {
                khachHang = (KhachHang) obj;
            }
            
            String url = "";
            String error = "";
            
            
//            String timeNowPlus15Minutes = Time.timeNowPlus_X_minutes(15);
//            System.out.println("Timenow: " +timeNow);
//            System.out.println("TimeKahchHnag: " +khachHang.getThoiGianHieuLucMaXacThuc());
            String timeNow = Time.getTimeNow();
            
            if(Time.compareTime(timeNow, khachHang.getThoiGianHieuLucMaXacThuc()) > 0){
                error += "Đã hết thời gian hiệu lực của mã OTP";
                url = "/khachhang/viaemailbeforeresetpassword.jsp";
            }
            
            

            if (!sortOTP.equals(khachHang.getMaXacThuc())) {
                System.out.println("Đã xác thực THẤT BẠI.");
                error = "SAI OTP";
                url = "/khachhang/viaemailbeforeresetpassword.jsp";
            } 
            
            if (error.length()>0) {
                url = "/khachhang/viaemailbeforeresetpassword.jsp";
            } else {
                // Cập nhật thông tin xuống CSDL khi người dùng nhập đúng OTP
                KhachHangDAO dao = new KhachHangDAO();
                
                // Set mật khẩu mới và trạng thái xác thực = 1
                dao.updateNewPassword(khachHang);
                
                System.out.println("Đã xác thực thành công. Mật khẩu đã được đổi");
                url = "/khachhang/viaemailbeforeresetpassword_success.jsp";
            }

            request.setAttribute("error", error);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            System.out.println("Lỗi ở viaemailbeforeresetpassword");
            e.printStackTrace();
        }
    }
    protected void updateavatar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String folerName = "uploads";

        // Lấy đường dẫn thực của thư mục upload trên server
        String uploadPath = getServletContext().getRealPath("");
        uploadPath = uploadPath.substring(0, uploadPath.length() - 10);
        uploadPath = uploadPath + "web" + File.separator + folerName + File.separator;;

        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir(); // Tạo folder nếu chưa có
        }
        //Lấy file từ request
        Part filePart = request.getPart("avatar");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

        String error = "";
        // Kiểm tra file hợp lệ
        if (fileName == null || fileName.isEmpty()) {
            if (fileName.length() < 5) {
                error += "File không hợp lệ";
            }
            return;
        }
        // Kiểm tra xem có đúng là file ảnh hay không
        if (fileName.lastIndexOf(".jpg") > 0 || fileName.lastIndexOf(".jpeg") > 0 || fileName.lastIndexOf(".png") > 0) {

            HttpSession session = request.getSession();
            Object obj = session.getAttribute("khachHang");
            KhachHang khachHang = null;
            if (obj != null) {
                khachHang = (KhachHang) obj;
            }

            //Đổi lại tên file bằng tên của tên đăng nhập để tránh bị trùng
            int dotLaster = fileName.lastIndexOf(".");
            fileName = khachHang.getTenDangNhap() + fileName.substring(dotLaster);

            // Lưu file vào thư mục uploads
            String filePath = uploadPath + fileName;
            System.out.println("Lưu thành công" + filePath);
            filePart.write(filePath);

            // Lưu tên file xuống CSDL
            khachHang.setHinhAvatar(fileName);
            KhachHangDAO dao = new KhachHangDAO();
            if (dao.updateAvatar(khachHang) > 0) {
                System.out.println("Lưu tên file xuống CSDL thành công");
                error = "Đã cập nhật Avatar thành công";
            }
        }
        
        request.getRequestDispatcher("/khachhang/upload.jsp").forward(request, response);

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
