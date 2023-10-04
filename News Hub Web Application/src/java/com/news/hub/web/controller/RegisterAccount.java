package com.news.hub.web.controller;

import com.news.hub.dao.LoginInfoFacadeLocal;
import com.news.hub.dao.StaffFacadeLocal;
import com.news.hub.dao.StudentFacadeLocal;
import com.news.hub.entity.data.LoginInfo;
import com.news.hub.entity.staff.Staff;
import com.news.hub.entity.student.Student;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DXgriz
 */
public class RegisterAccount extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

    @EJB
    private StaffFacadeLocal staffFacade;

    @EJB
    private LoginInfoFacadeLocal loginInfoFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        //common attributes
        String fullNames = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String emailAddress = request.getParameter("email");
        Long identityNo = Long.valueOf(request.getParameter("identity"));
        String password = request.getParameter("password");

        //controller attribute
        String userType = request.getParameter("userType");

        LoginInfo info;

        if (userType.equalsIgnoreCase("staff")) {

            String StaffNumber = request.getParameter("StaffNumber");
            String jobTitle = request.getParameter("jobTitle");

            Staff staff = generateStaff(fullNames, lastName, identityNo,
                    StaffNumber, emailAddress, jobTitle);
            
            staffFacade.create(staff);
            
            info = generateLoginData(emailAddress, password);
            loginInfoFacade.create(info);
            
            session.setAttribute("emailAddress", emailAddress);
            request.getRequestDispatcher("display_msg.jsp").forward(request, response);

        } else if (userType.equalsIgnoreCase("student")) {

            Long studentNumber = Long.valueOf(request.getParameter("studentNumber"));
            String course = request.getParameter("course");
            String faculty = request.getParameter("faculty");
            Integer academicLevel = Integer.valueOf(request.getParameter("level"));

            Student student = generateStudent(fullNames, lastName, identityNo,
                    studentNumber, academicLevel, faculty, course, emailAddress);

            studentFacade.create(student);
            
            info = generateLoginData(emailAddress, password);
            loginInfoFacade.create(info);
            
            session.setAttribute("emailAddress", emailAddress);
            request.getRequestDispatcher("display_msg.jsp").forward(request, response);
        }

    }

    public LoginInfo generateLoginData(String emailAddress, String password) {

        LoginInfo login = new LoginInfo();

        login.setEmailAddress(emailAddress);
        login.setPassword(password);

        return login;
    }

    public Staff generateStaff(String names, String surname, Long idNo, String staffNo,
            String emailAddr, String jobTitle) {

        Staff staff = new Staff();

        staff.setStaffName(names);
        staff.setStaffSurname(surname);
        staff.setIdentityNumber(idNo);
        staff.setStaffNumber(staffNo);
        staff.setEmailAddress(emailAddr);
        staff.setJobTitle(jobTitle);

        return staff;
    }

    public Student generateStudent(String names, String surname, Long idNo,
            Long studNo, Integer acadLvl, String faculty, String course,
            String emailAddress) {

        Student student = new Student();

        student.setStudentNames(names);
        student.setStudentSurname(surname);
        student.setIdentityNumber(idNo);
        student.setStudentNumber(studNo);
        student.setAcademicLevel(acadLvl);
        student.setFaculty(faculty);
        student.setCourse(course);
        student.setEmail(emailAddress);

        return student;
    }
}
