package com.demo5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTForm extends Frame
{
	public AWTForm() 
	{
		  Label hd=new Label("FORM");
		     hd.setAlignment(Label.CENTER);
		     hd.setSize(30,30);
		     
		     
			Label firstName = new Label("First Name :");  
			firstName.setBounds(40, 80, 80, 20);  
			  
			Label lastName = new Label("Last Name :");  
			lastName.setBounds(40, 110, 80, 20);  
			  
			Label dob = new Label("Date of Birth :");  
			dob.setBounds(40, 140, 80, 20); 
			
			Label gn=new Label("Gender :");
			gn.setBounds(40, 170, 80, 20);
			
			Label place=new Label("Place :");
			place.setBounds(40, 200, 80, 20);
			
			Label cn=new Label("Contact No:");
			cn.setBounds(40, 230, 80, 20);
			
			TextField firstNameTF = new TextField();  
			firstNameTF.setBounds(140, 80, 100, 20);  
			  
			TextField lastNameTF = new TextField();  
			lastNameTF.setBounds(140, 110, 100, 20);  
			  
			TextField dobTF = new TextField();  
			dobTF.setBounds(140, 140, 100, 20);
			
			CheckboxGroup c=new CheckboxGroup();
			
			Checkbox ch=new Checkbox("Male",false,c);
			ch.setBounds(140,170,50,20);
			
			Checkbox ch1=new Checkbox("Female",false,c);
			ch1.setBounds(200,170,60,20);
			
			TextField placetf=new TextField();
			placetf.setBounds(140,200,100,20);
			
			TextField cntf=new TextField();
			cntf.setBounds(140,230,100,20);
			
			Button b1=new Button("Submit");
			b1.setBounds(110, 270, 60, 25);
		
			 
			add(hd);
			add(firstName);  
			add(lastName);  
			add(dob);  
			add(gn);
			add(place);
			add(cn);
			add(firstNameTF);  
			add(lastNameTF);  
			add(dobTF);
			add(ch);
			add(ch1);
			add(placetf);
			add(cntf);
			add(b1);
			  
			setSize(500,500);  
			setLayout(null);  
			setVisible(true);  
	}
	
	public static void main(String[] args) 
	{
		new AWTForm();
	}

}
