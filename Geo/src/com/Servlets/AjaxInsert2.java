package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DAOFactory;

/**
 * Servlet implementation class AjaxInsert
 */
@WebServlet(name="AjaxInsert2", urlPatterns="/AjaxInsert2")
public class AjaxInsert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxInsert2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain");
		int id_departement= Integer.parseInt(request.getParameter("id_departement"));
		ResultSet rs=new DAOFactory().getLaboratoireDAO().getAll(id_departement);
		PrintWriter out= response.getWriter();
		System.out.println("Hello");
		try {
			String chaine="";
			while(rs.next()) {
				chaine+="<option value="+rs.getInt("id_labo")+">"+rs.getString("nom")+"</option>"; 
				System.out.println(chaine);
			}
			out.print(chaine);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
