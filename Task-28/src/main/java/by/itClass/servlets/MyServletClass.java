package by.itClass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

@WebServlet(name = "MyServlet", value = "/servlet")
public class MyServletClass extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.getWriter().append(
                    "<html>\n" +
                    "<head><title>" + "MyServlet" + "</title></head>\n" +
                    "<body >\n" +
                    "<h1 align = \"center\">" + "Reading All Requests Parameters" + "</h1>\n" +
                    "<table >\n" +
                    "  <tr ><th border = \"1, solid, #black\">Parameter Name</th> " + "  <th border = \"1, solid, #black\">Parameter Values</th> "+
                    "</body>" +
                    "</html>"
            );
            String box3 = request.getParameter("box3");
            response.getWriter().append(String.format("<tr border = \"1, solid, #black\"><td>box3</td>" + "<td>" + box3+"</td></tr>" + "\n"));
            String box1 = request.getParameter("box1");
            response.getWriter().append(String.format("<tr><td>box1</td>" + "<td>" + box1+"</td></tr>" + "\n"));
            String btn = request.getParameter("btn");
            response.getWriter().append(String.format("<tr><td>btn</td>" + "<td>" + btn+"</td></tr>" + "\n"));
            String[] param3 = request.getParameterValues("param3");
            response.getWriter().append(String.format("<tr><td>param3</td>" + "<td>" + Arrays.toString(param3)+"</td></tr>" + "\n"));
            String param2 = request.getParameter("param2");
            response.getWriter().append(String.format("<tr><td>param2</td>" + "<td>" + param2+"</td></tr>" + "\n"));
            String param1 = request.getParameter("param1");
            response.getWriter().append(String.format("<tr><td>param1</td>" + "<td>" + param1+"</td></tr>" + "\n"));
            String radio1 = request.getParameter("rad");
            response.getWriter().append(String.format("<tr><td>radio1</td>" + "<td>" + radio1+"</td></tr>" + "\n"));
    }
}
