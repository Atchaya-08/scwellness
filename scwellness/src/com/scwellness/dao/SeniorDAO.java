package com.scwellness.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.scwellness.bean.Senior;
import com.scwellness.util.DBUtil;

public class SeniorDAO {

    public boolean insertSenior(Senior s) {
        boolean result = false;

        try {
            Connection con = DBUtil.getDBConnection();

            String sql = "INSERT INTO SENIOR_TBL VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getSeniorID());
            ps.setString(2, s.getFullName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getGender());
            ps.setString(5, s.getPrimaryPhone());
            ps.setString(6, s.getChronicConditions());
            ps.setString(7, s.getEmergencyContactName());
            ps.setString(8, s.getEmergencyContactPhone());
            ps.setString(9, "ACTIVE");

            result = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
