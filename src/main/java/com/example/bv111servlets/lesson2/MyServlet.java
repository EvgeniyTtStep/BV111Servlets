package com.example.bv111servlets.lesson2;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "MyNewServlet", value = "/lesson2")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String age = req.getParameter("age");

        String[] checks = req.getParameterValues("check");
        String radio = req.getParameter("radio");


        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);

        for (String check : checks) {
            System.out.println("check = " + check);
        }
        System.out.println("radio = " + radio);

        req.setAttribute("name", name);
        req.setAttribute("surname", surname);
        req.setAttribute("age", age);

        req.setAttribute("checks", new ArrayList<>(Arrays.asList(checks)));
        req.setAttribute("radio", radio);

        Student student = new Student(name, surname, Integer.parseInt(age), checks, radio);

        req.setAttribute("student", student);


        req.getRequestDispatcher("student-info.jsp").forward(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
