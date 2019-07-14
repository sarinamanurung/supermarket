package com.eksad.supermarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eksad.supermarket.service.ReportService;

import net.sf.jasperreports.data.http.RequestMethod;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(value = "/report")
	public String generateReport() {
		return reportService.generateReport();
	
		
	}

}
