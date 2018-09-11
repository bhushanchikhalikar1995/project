
import DBManager.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class backend
 */
@WebServlet("/backend")
public class backend extends HttpServlet {
	DBManager db;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public backend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		db=new DBManager();
		PrintWriter pw=response.getWriter();
		pw.write("in doget");
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
 		db.loader();
 		db.connect();
 		
 		try {
 			pw.println("in try");
			PreparedStatement ps=db.connection.prepareStatement("insert into user values(?,?);");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ps.execute();
			pw.println("Records inserted");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
