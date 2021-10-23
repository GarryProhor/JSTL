package by.itClass.servlets;

import by.itClass.beans.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet(name = "GetListServlet", value = "/get")
public class GetListServlet extends HttpServlet {
    private List<Student> students;

    @Override
    public void init() throws ServletException {
        students = Stream.of(
                new Student(1, "Alex", "PO-52"),
                new Student(2, "Garry", "PO-52"),
                new Student(3, "Dima", "PO-53"),
                new Student(4, "Ruslan", "PO-53"),
                new Student(5, "Andrey", "PO-52"),
                new Student(6, "Timofey", "PO-55"),
                new Student(7, "Olga", "PO-55")
                ).collect(Collectors.toList());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String group = request.getParameter("groupId");

        PrintWriter writer = response.getWriter();

        students.stream()
                .filter(student -> student.getGroup().equals(group))
                .forEach(writer::println);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String group = request.getParameter("groupId");

        List<Student> result = students.stream()
                .filter(student -> student.getGroup().equals(group))
                .collect(Collectors.toList());

        request.setAttribute("students", result);

        RequestDispatcher rd = request.getRequestDispatcher("/students.jsp");
        rd.forward(request, response);
    }
}
