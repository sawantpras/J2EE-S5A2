//Write a servlet to take name as request parameter from the user and display Welcome
//Page to the user along with his name(with Get and Post http methods).

//HERE I PUT BOTH METHODS doGet and doPost TO SHOW THE DEMONSTRATION
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {

    @Override
    //this method do append all parameters coming from html page to browser
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // receive request from html client
        String cname = request.getParameter("username"); //in this case, parameter username's value = Ram

        //process it
        //Give response back to html client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //here welcome message will print on browser 
        out.println("<html><head><title>GetMethodDemo</title></head><body style='background-color: #6cd38a'>");
        out.println("<center><h2 style='color: #db2d1b'>I am from Post Method </h2>");
        out.println("<h1 style='color:green'>Hello " + cname + "</h1></center></body></html>");
    }

    @Override
    //this method append all parameters coming from html page to browser
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // receive request from html client
        String cname = request.getParameter("username"); //in this case, parameter username's value = Ram

        //process it
        //Give response back to html client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //here welcome message will print on browser 
        out.println("<html><head><title>GetMethodDemo</title></head><body style='background-color: #6cd38a'>");
        out.println("<center><h2 style='color: #db2d1b'>I am from Get Method </h2>");
        out.println("<h1 style='color:blue'>Welcome " + cname + "</h1></center></body></html>");
    }
}
