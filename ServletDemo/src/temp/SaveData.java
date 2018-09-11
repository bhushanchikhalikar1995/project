package temp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveData
 */
@WebServlet(name = "SaveDataToDb", urlPatterns = { "/SaveDataToDb" })
public class SaveData extends HttpServlet {
	
	Connection connection;
	PreparedStatement statement;
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String password="123456";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter out =response.getWriter();
			out.write("here");
			
			Class.forName("com.mysql.jdbc.Driver");
		
			connection=DriverManager.getConnection(url, user, password);
			
			statement=connection.prepareStatement("insert into loginData values(?,?)");
			
			statement.setString(1, request.getParameter("fname"));
			statement.setString(2, request.getParameter("lname"));
			int result=statement.executeUpdate();
			
			if(result>0)
				out.write("Records Inserted Successfully");
			else
				out.write("Records are not Inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
