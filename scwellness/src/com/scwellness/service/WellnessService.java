package com.scwellness.service;

import com.scwellness.bean.Program;
import com.scwellness.bean.Senior;
import com.scwellness.dao.ProgramDAO;
import com.scwellness.dao.SeniorDAO;
import com.scwellness.util.ValidationException;

public class WellnessService {

    // -------- SENIOR --------
    public boolean registerNewSenior(Senior s) throws Exception {

        if (s.getAge() < 55) {
            throw new ValidationException("Age must be >= 55");
        }

        s.setStatus("ACTIVE");

        SeniorDAO dao = new SeniorDAO();
        return dao.insertSenior(s);   // ✅ CORRECT
    }

    // -------- PROGRAM --------
    public boolean createProgram(Program p) throws Exception {

        if (p.getRecommendedDurationWeeks() <= 0) {
            throw new ValidationException("Duration must be > 0");
        }

        p.setStatus("ACTIVE");

        ProgramDAO dao = new ProgramDAO();
        return dao.insertProgram(p);  // ✅ CORRECT
    }
}
