package com.example.ServletDemo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HolaAmigosServlet", value = "/HolaAmigosServlet")
public class HolaAmigosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in holaAmigoServlet" );
        String firstname = request.getParameter("fname");
        String lastname = request.getParameter("lname");

        PrintWriter p = response.getWriter();
        p.println("<h1>Hello "+firstname+" "+lastname+"</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("fname");
        String lastname = request.getParameter("lname");

        PrintWriter p = response.getWriter();
        p.println("<h1>Hello "+firstname+" "+lastname+"</h1>");
    }
}
