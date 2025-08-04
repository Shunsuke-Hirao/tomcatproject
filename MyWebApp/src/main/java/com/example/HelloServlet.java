package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 入力値を取得
        String name = request.getParameter("username");
        
        // リクエストにデータをセット（JSPに渡す）
        request.setAttribute("username",name);
        
        //result.jspにフォワード
        RequestDispatcher dispatcher= request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request,response);
    }
}
