package com.oracle.servlet.backend;

import com.oracle.service.ScheduleService;
import com.oracle.service.ScheduleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/backend/deleteScheduleServlet")
public class DeleteScheduleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScheduleService scheduleService = new ScheduleServiceImpl();
        Integer scheduleId = Integer.parseInt(req.getParameter("scheduleId"));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(scheduleId);
        scheduleService.deleteScheduleByScheduleId(scheduleId);
        req.getRequestDispatcher("/backend/rootScheduleServlet").forward(req,resp);
    }
}
