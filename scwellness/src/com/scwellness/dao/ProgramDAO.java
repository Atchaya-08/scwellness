package com.scwellness.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.scwellness.bean.Program;
import com.scwellness.util.DBUtil;

public class ProgramDAO {

    public boolean insertProgram(Program p) {
        boolean result = false;

        try {
            Connection con = DBUtil.getDBConnection();

            String sql = "INSERT INTO PROGRAM_TBL VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getProgramID());
            ps.setString(2, p.getProgramName());
            ps.setString(3, p.getCategory());
            ps.setInt(4, p.getRecommendedDurationWeeks());
            ps.setString(5, p.getSessionFrequency());
            ps.setString(6, "ACTIVE");

            result = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
