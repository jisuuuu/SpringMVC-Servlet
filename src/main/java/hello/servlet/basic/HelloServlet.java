package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);//interface 구현체들

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //서블릿은 간단하게 바로 연결해서 출력할 수 있도록 만들어줌

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");//옛날 시스템 아니면 다 이거 써야함
        response.getWriter().write("hello "+ username);

        //http 요청/응답 메세지를 직접만들라면 어려움 servlet이 도와줌
    }
}
