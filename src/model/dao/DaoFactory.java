package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;
import model.dao.impl.DepartmentDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
