package com.oracle.servlet;

import com.oracle.pojo.Schedule;
import com.oracle.service.ScheduleService;
import com.oracle.service.ScheduleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/searchScheduleViewServlet")
public class SearchScheduleViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScheduleService scheduleService =new ScheduleServiceImpl();
        List<Schedule> scheduleList = scheduleService.findScheduleAll();
        req.setAttribute("scheduleList",scheduleList);
        req.getRequestDispatcher("/searchScheduleView.jsp").forward(req,resp);
    }
}
