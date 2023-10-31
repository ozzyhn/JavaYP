package com.bilgeadam.postgresqljdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bilgeadam.postgresqljdbc.Constants;
import com.bilgeadam.postgresqljdbc.model.Ogrencı;

public class OgrencıRepository {
	
	public ArrayList<Ogrencı> getAll() throws SQLException
	{
		ArrayList<Ogrencı> list = new ArrayList<>();
		Connection con = Constants.getConnection();
		Statement stmnt = con.createStatement();
		ResultSet result = stmnt.executeQuery("select * from \"public\".\"OGRENCI\" order by \"ID\" asc");
		while (result.next())
		{
			long id = result.getLong("ID");
			String name = result.getString("NAME");
			int ogrnum = result.getInt("OGR_NUMBER");
			int year = result.getInt("YEAR");
			list.add(new Ogrencı(id, name, ogrnum ,year));
		}
		result.close();
		stmnt.close();
		con.close();
		return list;
	}
	
	public boolean save(Ogrencı stu) throws SQLException
	{
		boolean result = false;
		Connection con = Constants.getConnection();
		String sql = "INSERT INTO \"public\".\"OGRENCI\"(\"NAME\", \"OGR_NUMBER\",\"YEAR\",) VALUES (?, ?, ?)";
		PreparedStatement stmnt = con.prepareStatement(sql);
		stmnt.setString(1, stu.getNAME());
		stmnt.setInt(2, stu.getOGR_NUMBER());
		stmnt.setInt(3, stu.getYEAR());
		result = stmnt.executeUpdate() == 1;
		stmnt.close();
		con.close();
		return result;
	}
	public boolean deleteByID(long id) throws SQLException
	{
		Connection con = Constants.getConnection();
		String sql = "delete from \"public\".\"OGRENCI\" where \"ID\" = ?";
		PreparedStatement stmnt = con.prepareStatement(sql);
		stmnt.setLong(1, id);
		boolean result = stmnt.executeUpdate() == 1;
		stmnt.close();
		con.close();
		return result;
	}
	public Ogrencı getByID(long id) throws SQLException
	{
		Ogrencı ogr = null;
		Connection con = Constants.getConnection();
		String sql = "select * from \"public\".\"OGRETMEN\" where \"ID\" = ?";
		PreparedStatement stmnt = con.prepareStatement(sql);
		stmnt.setLong(1, id);
		ResultSet result = stmnt.executeQuery();
		while (result.next())
		{
			ogr = new Ogrencı(result.getLong("ID"), result.getString("NAME"), result.getInt("OGR_NUMBER"),result.getInt("YEAR"));
		}
		result.close();
		stmnt.close();
		con.close();
		return ogr;
	}
	
}
