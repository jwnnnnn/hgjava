package com.yedam.interfaces;

public class DataExe {
	public static void main(String[] args) {
		// Mysql vs. Oracle
//		MysqlDB mysql = new MysqlDB();
//		OracleDB oracle = new OracleDB();
		DAO dao = new OracleDB();
		
		int menu = 0;

		if (menu == 1) {
			dao.insert();
//			mysql.insert();
//			oracle.add(); // 오라클이 mysql 값이랑 같이 바꿔줘야함.
		} else if (menu == 2) {
			dao.update();
//			mysql.update();
//			oracle.modify();
		} else if (menu == 3) {
			dao.delete();
//			mysql.delete();
//			oracle.remove();
		}
	}
}
