package com.eksad.supermarket.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.TransactionReport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service 


public class ReportService {
	
	@Autowired
	
	private TransactionDao transactionDao;
	
	
	BigDecimal overall = new BigDecimal("0");

	public String generateReport() {
		
		try {
			List<Object[]> treport = transactionDao.transactionReport();
			List<TransactionReport> transactionList = new ArrayList<>();
			
			for (Object[] tr : treport) {
				TransactionReport transaction = new TransactionReport();
				transaction.setId((BigInteger) tr[0]);
				transaction.setDate((Date) tr[1]);
				transaction.setProduct((String) tr[2]);
				transaction.setPrice((BigDecimal) tr[3]);
				transaction.setQuantity((Integer) tr[4]);
				transaction.setTotal((BigDecimal) tr[5]);
				overall = overall.add(transaction.getTotal());
				transactionList.add(transaction);
			}
			
			String reportPath = "C:\\Users\\User-PC\\Downloads\\supermarket\\supermarket\\src\\main\\resources";
			JasperReport jasperReport = JasperCompileManager.compileReport(reportPath+"\\simple_blue.jrxml");
		
			
			JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(transactionList);

			
//			untuk pemanggilan parameter
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("createdBy", "Sepmin Sarina Manurung");
			parameters.put("overall", this.overall);
			
			JasperPrint jasperPrint = JasperFillManager
					.fillReport(jasperReport, parameters, jrBeanCollectionDataSource);
					
			JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath+"\\transaction_report.pdf");
			
			System.out.println("Dobe");
			
			return "jasper report successfuly generated @path="+reportPath;
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error--> check console log";
		
	
	}

}
