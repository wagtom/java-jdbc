package java_jdbc.java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDao;
import model.Userposjava;

public class TesteBancoJdbc {
	@Test

	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		userPosDao.salvar(userposjava);
	}

}
