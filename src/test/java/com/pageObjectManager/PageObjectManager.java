package com.pageObjectManager;

import com.pageObjectModel.Login_Page_Model;
import com.pageObjectModel.Order_Hoodie_Page;
import com.pageObjectModel.Order_Jacket_Pants_Page;
import com.utility.FileReadManager;

public class PageObjectManager {
	
	private FileReadManager fileData;
	public FileReadManager getFileData() {
		if(fileData==null) {
			fileData= new FileReadManager();
			
		}
		return fileData;
		
	}
    private Login_Page_Model login;
    public Login_Page_Model getLogin() {
    	if(login==null) {
    		login= new Login_Page_Model();
    	}
		return login;
    	
    }
    
    private Order_Hoodie_Page hoodie;
    public Order_Hoodie_Page getHoodiePage() {
    	if(hoodie==null) {
    		hoodie= new Order_Hoodie_Page();
    	}
		return hoodie;
    	
    }
    
    private Order_Jacket_Pants_Page jacketPant;
    public Order_Jacket_Pants_Page getJacketPant() {
    	if( jacketPant==null) {
    		 jacketPant= new Order_Jacket_Pants_Page();
    	}
		return jacketPant;
    	
    }
}
