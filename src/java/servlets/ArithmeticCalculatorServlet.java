/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author porte
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("output", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // get values from the form
        String fisrtNumString = request.getParameter("firstNum");
        String secondNumString = request.getParameter("secondNum");
        String output = "---";
        
        // keep entered values
        request.setAttribute("firstNum", fisrtNumString);
        request.setAttribute("secondNum", secondNumString);
        
        // if left empty.
        if (fisrtNumString.equals("") || fisrtNumString == null || secondNumString.equals("") || secondNumString == null) {
            output = "invalid"; // display result
            request.setAttribute("output", output);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int firstNum = Integer.parseInt(fisrtNumString);
        int secondNum = Integer.parseInt(secondNumString);
        String operation = request.getParameter("operation");
        
        
        
        if (operation.equals("+")) {
            output = Integer.toString(firstNum + secondNum);
        } else if (operation.equals("-")) {
            output = Integer.toString(firstNum - secondNum);
        } else if (operation.equals("*")) {
            output = Integer.toString(firstNum * secondNum);
        } else if (operation.equals("%")) {
            output = Integer.toString(firstNum % secondNum);
        }
        
        request.setAttribute("output", output);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
