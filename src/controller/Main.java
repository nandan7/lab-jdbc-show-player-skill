package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.SkillDAO;
import model.Skill;
import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		ConnectionManager c=new ConnectionManager();
		 Connection a=c.getConnection();
		 if(a==null) {
			 System.out.println("Check your connection");
			
		 }
		 else {
			 System.out.println("Connection established");
		 }
		 System.out.println("List of all skills:");  
		 System.out.println();
		SkillDAO skilldao=new SkillDAO();
		skilldao.listAllSkills();
	}
}
