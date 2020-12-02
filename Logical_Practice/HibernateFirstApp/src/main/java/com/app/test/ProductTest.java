package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		Product prd = new Product();
		prd.setPid(12);
		prd.setpName("Refrigerator");
		prd.setpPrice(23400.50);
		prd.setpQuantity(250);

		ses.save(prd);
		tx.commit();
		ses.close();

	}

}
