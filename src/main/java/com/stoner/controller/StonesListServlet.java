package com.stoner.controller;

import com.stoner.service.CRUDService;
import com.stoner.service.NecklacesService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StonesListServlet extends HttpServlet {
    private static final CRUDService SERVICE = new NecklacesService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SERVICE.findAll();
    }
}
