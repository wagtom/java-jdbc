package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexaojdbc.SingleConnection;
import model.Userposjava;

public class UserPosDao {

	private Connection connection;

	public UserPosDao() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Userposjava userposjava) {
		try {
			//String sql = "insert into public.userposjava (id, nome, email) values (?, ?, ?)";
			String sql = "insert into public.userposjava (id, nome, email) values (?, ?, ?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, 3);
			insert.setString(2, "Egídio salvar DAO");
			insert.setString(3, "l3ala@gmail.com");
			insert.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
