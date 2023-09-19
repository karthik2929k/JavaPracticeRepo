package com.reportgeneration.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportGenDemo extends Object{

	private String reason;
	private String clauseno;
	private String clausedesc;
	private List<ReportGenDemo> inputlist;
	
	
	public ReportGenDemo(String reason, String clauseno, String clausedesc) {
		super();
		this.reason = reason;
		this.clauseno = clauseno;
		this.clausedesc = clausedesc;
	}


	public ReportGenDemo() {
		// TODO Auto-generated constructor stub
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getClauseno() {
		return clauseno;
	}


	public void setClauseno(String clauseno) {
		this.clauseno = clauseno;
	}


	public String getClausedesc() {
		return clausedesc;
	}


	public void setClausedesc(String clausedesc) {
		this.clausedesc = clausedesc;
	}


	


	public static void main(String[] args) throws JRException {
		
		
		List<ReportGenDemo>	inputlist = new ArrayList<>();
		inputlist.add(new ReportGenDemo("reason1", "clauseno1", "clausedesc1"));
		inputlist.add(new ReportGenDemo("reason1", "clauseno2", "clausedesc2"));
		inputlist.add(new ReportGenDemo("reason1", "clauseno3", "clausedesc3"));
		
		
		inputlist.add(new ReportGenDemo("reason2", "clauseno4", "clausedesc4"));
		inputlist.add(new ReportGenDemo("reason2", "clauseno5", "clausedesc5"));
		inputlist.add(new ReportGenDemo("reason2", "clauseno6", "clausedesc6"));
		
		
		inputlist.add(new ReportGenDemo("reason3", "clauseno4reason3", "clausedescreason34"));
		inputlist.add(new ReportGenDemo("reason3", "clauseno5reason3", "clausedescreason35"));
		inputlist.add(new ReportGenDemo("reason3", "clauseno6reason3", "clausedescreason36"));
		
		
		
		inputlist.add(new ReportGenDemo("reason4", "clauseno4reason4", "clausedescreason44"));
		inputlist.add(new ReportGenDemo("reason4", "clauseno5reason4", "clausedescreason45"));
		inputlist.add(new ReportGenDemo("reason4", "clauseno6reason4", "clausedescreason46"));
		
		
		
		inputlist.add(new ReportGenDemo("reason5", "clauseno4reason5", "clausedesc4reason5"));
		inputlist.add(new ReportGenDemo("reason5", "clauseno5reason5", "clausedesc5reason5"));
		inputlist.add(new ReportGenDemo("reason5", "clauseno6reason5", "clausedesc6reason5"));
		
		
		
		
		inputlist.add(new ReportGenDemo("reason6", "clauseno4reason6", "clausedesc4reason6"));
		inputlist.add(new ReportGenDemo("reason6", "clauseno5reason6", "clausedesc5reason6"));
		inputlist.add(new ReportGenDemo("reason6", "clauseno6reason6", "clausedesc6reason6"));
		
		
		
		
		inputlist.add(new ReportGenDemo("reason7", "clausenoreason74", "clausedesc4reason7"));
		inputlist.add(new ReportGenDemo("reason7", "clauseno5reason7", "clausedescreason75"));
		inputlist.add(new ReportGenDemo("reason7", "clausenoreason76", "clausedescreason76"));
		inputlist.add(new ReportGenDemo("reason7", "clauseno4reason7", "clausedesc4reason7"));
		inputlist.add(new ReportGenDemo("reason7", "clausenoreason75", "clausedesc5reason7"));
		inputlist.add(new ReportGenDemo("reason7", "clauseno6reason7", "clausedescreason76"));

		System.out.println(new Gson().toJson(inputlist));
		
		System.out.println(inputlist.size());
		
		
		
		List<ReportGenDemo> mainlist = new ArrayList<ReportGenDemo>();
		List<ReportGenDemo> innerList  = new ArrayList<>();

		int it=0;
		String reasontemp="";
		while(it<inputlist.size())
		{
			ReportGenDemo currentReportGenDemo = inputlist.get(it);
			String currentreason = currentReportGenDemo.getReason();
			
			if(currentreason.equals(reasontemp))
			{System.out.println("check1");
				ReportGenDemo previousinnnerclause =  innerList.get((innerList.size()-1));
				List<ReportGenDemo> clauseList = previousinnnerclause.getInputlist();
				clauseList.add(new ReportGenDemo(null, currentReportGenDemo.getClauseno(), currentReportGenDemo.getClausedesc()));
			}
			else
			{System.out.println("check2");
				ReportGenDemo newinnnerclause = new ReportGenDemo();
				newinnnerclause.setReason(currentreason);
				newinnnerclause.setInputlist(new ArrayList<>(Arrays.asList(new ReportGenDemo(null, currentReportGenDemo.getClauseno(), currentReportGenDemo.getClausedesc()))));
				innerList.add(newinnnerclause);
			}
			reasontemp = currentreason;
			System.out.println(currentreason+ " ::"+it);
		it++;	
		}
		
		ReportGenDemo mainclass = new ReportGenDemo();
		mainclass.setInputlist(innerList);
		mainlist.add(mainclass);
		
		System.out.println(new Gson().toJson(mainlist));
		
		
		/*Set<String> uniqueresaon = new LinkedHashSet<String>();
		for (dummy2 input : inputlist) {
			uniqueresaon.add(input.getReason());			
		}
		System.out.println(uniqueresaon);
		
		List<dummy2> inner_list = new ArrayList<>();
		for (String uniqueresaon_str : uniqueresaon)
		{
			dummy2 innerclass = new dummy2(); 
			innerclass.setReason(uniqueresaon_str);
		
			
			/////////////////////////////clasuse list
			List<dummy2> clause_list = new ArrayList<>();
			for (dummy2 input : inputlist)
			{
			
				if(uniqueresaon_str.equals(input.getReason()))
				{
					dummy2 clsaus = new dummy2();
					clsaus.setClauseno(input.getClauseno());
					clsaus.setClausedesc(input.getClausedesc());
					clause_list.add(clsaus);
					//System.out.println(new Gson().toJson(clause_list));

				}
			}
			
			
			
			innerclass.setInputlist(clause_list);
			inner_list.add(innerclass);
		}*/
		
		
	/*	List<dummy2> mainsublist = new ArrayList<>();
		dummy2 mainsubclass = new dummy2();
		mainsubclass.setInputlist(inner_list);
		mainsublist.add(mainsubclass);
		
		*/
		
		
		
		
		System.out.println(new Gson().toJson(mainlist));
		JasperReport jasperReport,jasperReportsub1 , jasperReportsub2;
		 JasperPrint jasperPrint;
		
		 jasperReport = JasperCompileManager.compileReport("C:\\Users\\karthik.penchala\\Desktop\\WORK\\Javapracticereports\\mainreeport.jrxml");
		 jasperReportsub1 = JasperCompileManager.compileReport("C:\\Users\\karthik.penchala\\Desktop\\WORK\\Javapracticereports\\subreport1.jrxml");
		 jasperReportsub2 = JasperCompileManager.compileReport("C:\\Users\\karthik.penchala\\Desktop\\WORK\\Javapracticereports\\sub_subreport.jrxml");
		 
		 
		 HashMap<String, Object> hashMap = new HashMap<String, Object>();

		 hashMap.put("jasperReportsub1",jasperReportsub1);
		 hashMap.put("jasperReportsub2",jasperReportsub2);
		 hashMap.put("title", "testtitle");
		 jasperPrint = JasperFillManager.fillReport( jasperReport, hashMap,new JRBeanCollectionDataSource(mainlist));	
		 JasperExportManager.exportReportToPdfFile(jasperPrint ,"C:\\Users\\karthik.penchala\\Desktop\\WORK\\Javapracticereports\\test2.pdf");
		
		System.out.println("job done!!");
		
		
	}


	public List<ReportGenDemo> getInputlist() {
		return inputlist;
	}


	public void setInputlist(List<ReportGenDemo> inputlist) {
		this.inputlist = inputlist;
	}
}
