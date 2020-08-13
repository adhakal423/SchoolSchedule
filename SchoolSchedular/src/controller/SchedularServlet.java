package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Schedule;
import services.ScheduleServices;

/**
 * Servlet implementation class SchedularServlet
 */
@WebServlet("/SchedularServlet")
public class SchedularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	//Schedule schd;


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchedularServlet() {
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
		
		 String[] days = request.getParameterValues("day"); 
		 String courseName=request.getParameter("courseName");	
		int startTime=Integer.parseInt(request.getParameter("startTime"));
		int stopTime=Integer.parseInt(request.getParameter("stopTime"));
		
   
		
		ScheduleServices scheduleService=new ScheduleServices();
		
					if(days != null)
					{
					for(int i = 0; i<days.length; i++)
					{
					String dayString = days[i];
					int day;
					if(dayString.equalsIgnoreCase("SUN"))
						{
										
						day = 0;
						

						
						}
					else if(dayString.equalsIgnoreCase("MON")) {
								
						day = 1;

					}
					else if(dayString.equalsIgnoreCase("TUE")) {
						
						
						day = 2;
					}
					else if(dayString.equalsIgnoreCase("WED")) {
						
						
						day = 3;
					}
					else if(dayString.equalsIgnoreCase("THU")) {
						
						
						
						day = 4;
					}
					else if(dayString.equalsIgnoreCase("FRI")) {
						
						
						day = 5;
					}
					else {
						
						
						day = 6;
					}
					

					Schedule schd = new Schedule(courseName, startTime, stopTime, day);

					scheduleService.addSchedule(schd);
					
                     
					}
					} 
					List<Schedule> classlist=new ArrayList<>();	
					classlist=scheduleService.getSchList();
                   request.setAttribute("classlist",classlist);	
					RequestDispatcher rd=request.getRequestDispatcher("/pages/routine.jsp");
					rd.forward(request,response);
					
			
	}

}
