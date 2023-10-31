package com.bilgeadam.postgresqljdbc;

import java.sql.SQLException;

import com.bilgeadam.postgresqljdbc.repository.DersRepository;
import com.bilgeadam.postgresqljdbc.repository.OgretmenRepository;

public class App
{
	private static OgretmenRepository ogretmen_repo = new OgretmenRepository();
	private static DersRepository ders_repo = new DersRepository();

	public static void main(String[] args)
	{
		try
		{
//			System.err.println(ogretmen_repo.save(new Ogretmen("gökhan", true)));
			System.err.println(ogretmen_repo.getAll());
//			System.err.println(ders_repo.getAll());
//			System.err.println(ders_repo.getAllDTO());
//			System.err.println(ogretmen_repo.getByID(22));
//			System.err.println(ogretmen_repo.deleteByID(7));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
