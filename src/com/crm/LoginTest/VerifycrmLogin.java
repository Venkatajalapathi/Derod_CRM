package com.crm.LoginTest;

import org.testng.annotations.Test;

import com.crm.Pages.LoginPage;
import com.crm.Pages.NewCampaign;
import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;

public class VerifycrmLogin extends BaseTest {
	
	FileLib flib;
	LoginPage lp;
	
	@Test(priority=1)
	public void verifyValid() throws Throwable {
		
		flib=new FileLib();
		lp=new LoginPage();
		
		String un = flib.getPropKeyValue(PROP_PATH, "username");
		String pwd = flib.getPropKeyValue(PROP_PATH, "password");
		
		lp.login(un, pwd);
		//abc

	}
	
	
	
	
NewCampaign ncp;
	
	@Test(priority=2)
	public void openCampingPage() {
		
		ncp=new NewCampaign();
		
		ncp.setCampTab();
	
	}
	
	
	
	@Test(priority=3)
	public void openNewCampaign() {
		ncp=new NewCampaign();
		ncp.setnewCmp();
		
		
		String campname="Road Show";
		ncp.setcampTB(campname);
		 
	   String date="01/10/2018";
	   ncp.startdate(date);
	   String er="500000";
	   ncp.expecteRevenue(er);
	   String ac="300000";
	   ncp.actualCost(ac);
	   String ns="30";
	   ncp.numSend(ns);
	   
	   String valuetp="Others";
	   ncp.typeDropDown(valuetp);
	   
	   String valuest="Planning";
	   ncp.statusDropDown(valuest);
	   
	   //String ed="01-12-2018";
	   ncp.endDate("01/15/2018");
	   
	   String bc="30000";
	   ncp.budgetedCost(bc);
	   
	   String ersp="500";
	   ncp.expectedResponce(ersp);
		
	   ncp.clickSave();
	   
	   ncp.clickEdit();
	   ncp.getactualCost().clear();
	   ncp.actualCost("3500000");
	   ncp.clickSave();
	}
	
	
	
	
	
	

}
