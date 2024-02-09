package com.example.bv111servlets.lesson1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet(name = "myServlet", value = "/home")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String model = request.getParameter("model");
        String vendor = request.getParameter("vendor");
        String price = request.getParameter("price");

        Car car = new Car(model, vendor, Integer.parseInt(price));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div><b>Model: " + car.getModel() + "</b></div>");
        printWriter.println("<div><b>Vendor: " + car.getVendor() + "</b></div>");
        printWriter.println("<div><b>Price: " + car.getPrice() + "</b></div>");
        printWriter.println("<a href='car-form.html'>Back</a> <br>");


    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");
        printWriter.println("<h1>Home my servlet</h1>");


    }
}
