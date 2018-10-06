/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_sp;

import java.util.*;
import java.sql.*;
import java.text.*;

/**
 *
 * @author lamng
 */
public class QLSP {

    private Connection conn;

    public QLSP() throws Exception {
        this.conn = ConnectorDB.getConnection();
    }

    public List<SanPham> getAll() throws Exception {
        List<SanPham> list = new ArrayList<>();
        Statement stt = this.conn.createStatement();
        String sql = "SELECT * FROM sanpham";
        ResultSet rs = stt.executeQuery(sql);
        while (rs.next()) {
            SanPham sp = new SanPham();
            sp.setId(rs.getInt("id"));
            sp.setName(rs.getString("name"));
            sp.setPrice(rs.getDouble("price"));
            sp.setDescription(rs.getString("desciprtion"));
            sp.setCreated(rs.getDate("create_at"));
            list.add(sp);
        }
        return list;
    }

    public int add(SanPham sp) throws Exception {
        String sql = "INSERT INTO sanpham(name, price, desciprtion, create_at)  VALUES(?,?,?,str_to_date(?,\"%d-%m-%Y\"))";
        PreparedStatement psttm = this.conn.prepareStatement(sql);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        psttm.setString(1, sp.getName());
        psttm.setString(2, sp.getPrice() + "");
        psttm.setString(3, sp.getDescription());
        psttm.setString(4, sdf.format(sp.getCreated()));

        return psttm.executeUpdate();
    }

    public List<SanPham> search(SanPham sp, String nameSearch) throws Exception {
        List<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM sanpham WHERE name like '%"+nameSearch+"%'";
        PreparedStatement psttm = this.conn.prepareStatement(sql);
        ResultSet rs = psttm.executeQuery();
        while (rs.next()) {
            sp.setName(rs.getString("name"));
            sp.setPrice(rs.getDouble("price"));
            sp.setDescription(rs.getString("desciprtion"));
            sp.setCreated(rs.getDate("create_at"));
            list.add(sp);
       }
        return list;
    }

    public int delete(int id) throws Exception {
        String sql = "DELETE FROM sanpham WHERE id = ?";
        PreparedStatement psttm = this.conn.prepareStatement(sql);
        SanPham sv = new SanPham();
        psttm.setInt(1, id);

        return psttm.executeUpdate();
    }
}
