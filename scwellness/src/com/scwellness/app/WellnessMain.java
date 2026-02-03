package com.scwellness.app;

import com.scwellness.bean.Program;
import com.scwellness.bean.Senior;
import com.scwellness.dao.ProgramDAO;
import com.scwellness.dao.SeniorDAO;

public class WellnessMain {

    public static void main(String[] args) {

        // Insert Senior
        Senior s = new Senior();
        s.setSeniorID("SR3001");   // ⚠ change if duplicate
        s.setFullName("RAVI KUMAR");
        s.setAge(66);
        s.setGender("MALE");
        s.setPrimaryPhone("9999999999");
        s.setChronicConditions("BP");
        s.setEmergencyContactName("Anitha");
        s.setEmergencyContactPhone("8888888888");

        SeniorDAO sdao = new SeniorDAO();
        System.out.println("Senior Inserted: " + sdao.insertSenior(s));

        // Insert Program
        Program p = new Program();
        p.setProgramID("PRG3001"); // ⚠ change if duplicate
        p.setProgramName("General Wellness");
        p.setCategory("GENERAL");
        p.setRecommendedDurationWeeks(6);
        p.setSessionFrequency("Weekly");

        ProgramDAO pdao = new ProgramDAO();
        System.out.println("Program Inserted: " + pdao.insertProgram(p));
    }
}
