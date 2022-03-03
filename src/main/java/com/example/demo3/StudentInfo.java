package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentInfo", value = "/StudentInfo")
public class StudentInfo extends HttpServlet {
    StudentDB studentDB = new StudentDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");
        Student student = studentDB.vind(naam, voornaam);
        String destination = "nietgevonden.jsp";
        if (student != null) {
            request.setAttribute("student", student);
            destination = "gevonden.jsp";
        }
        request.getRequestDispatcher(destination).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
