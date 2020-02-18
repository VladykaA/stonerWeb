package com.stoner.controller;

import com.stoner.entity.Chain;
import com.stoner.service.CRUDService;
import com.stoner.service.NecklacesService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NecklacesCreationServlet extends HttpServlet {
    private static final CRUDService SERVICE = new NecklacesService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SERVICE.save(new Chain());
    }
}
