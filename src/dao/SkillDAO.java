package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public void listAllSkills() throws SQLException, ClassNotFoundException {
		String sql="SELECT * FROM SKILL ORDER BY NAME";
			PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("ID" + "\t" + "SKILL NAME");
			System.out.println("");
			while(rs.next())
			{
				Long id=rs.getLong("id");
				String name=rs.getString("name");				 
			    System.out.println(id + "\t" + name);
			}
	}
}
