/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_jdbc;

import java.sql.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author lamng
 */
public class QLSV {

    private Connection conn;

    public QLSV() throws Exception {
        this.conn = Connector.getConnection();
    }

    public List<SinhVien> getAll() throws Exception {
        List<SinhVien> list = new ArrayList<>();
        Statement sttm = this.conn.createStatement();
        String sql = "SELECT * FROM sinhvien";
        ResultSet rs = sttm.executeQuery(sql);
        while (rs.next()) {
            SinhVien sv = new SinhVien();
            sv.setId(rs.getInt("id"));
            sv.setName(rs.getString("name"));
            sv.setMajor(rs.getString("major"));
            sv.setDate(rs.getDate("date"));
            list.add(sv);
        }
        return list;
    }

    public int add(SinhVien sv) throws Exception {
        String sql = "INSERT INTO sinhvien(name, major, date) VALUES(?,?,str_to_date(?,\"%d-%m-%Y\"))";
        PreparedStatement psttm = this.conn.prepareStatement(sql);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        psttm.setString(1, sv.getName());
        psttm.setString(2, sv.getMajor());
        psttm.setString(3, sdf.format(sv.getDate()));

        return psttm.executeUpdate();
    }

    public int delete(int id) throws Exception {
        String sql = "DELETE FROM sinhvien WHERE id = ?";
        PreparedStatement psttm = this.conn.prepareStatement(sql);
        SinhVien sv = new SinhVien();
        psttm.setInt(1, id);

        return psttm.executeUpdate();
    }

    public int update(SinhVien sv) throws Exception {
        String sql = "UPDATE sinhvien "
                + "SET name = ?, major = ?, "
                + "date = str_to_date(?, \"%d-%m-%Y\")"
                + " WHERE id = ?";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, sv.getName());
        pstmt.setString(2, sv.getMajor());
        pstmt.setString(3, sdf.format(sv.getDate()));
        pstmt.setInt(4, sv.getId());
        return pstmt.executeUpdate();
    }

}
