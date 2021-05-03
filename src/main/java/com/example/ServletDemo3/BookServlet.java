package com.example.ServletDemo3;

import com.example.ServletDemo3.dao.BookDAO;
import com.example.ServletDemo3.models.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {

    private BookDAO bd;

    public void init(){
        bd = new BookDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in bookServlet" );
        PrintWriter p = response.getWriter();
        String title = request.getParameter("title");
        if(title == null){
            p.println("<h1>All books</h1>");
            p.println("<table>");
            for (Book b : bd.getAllBooks()){
                p.println("<tr><td>"+b.getTitle()+"</td><td>"+b.getAuthor()+"</td></tr>");
            }
            p.println("</table>");
        }
        else {
            String res = bd.getBookInfo(title);
            if (res == null){
                p.println("<h1>Book "+title+" could not be found</h1>");
            }
            else{
                p.println("<h1>"+res+" </h1>");
            }
        }

    }
}
