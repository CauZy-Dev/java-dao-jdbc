package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(1);
		
		System.out.println("===teste 1: seller findById");
		System.out.println(seller);
		
		List<Seller> list = new ArrayList<>();
		list = sellerDao.findByDepartment(new Department(1, null));
		
		System.out.println();
		System.out.println("===teste 2: seller findByDepartment");
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
