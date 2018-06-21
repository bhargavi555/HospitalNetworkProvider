package com.Altimetrik.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.Altimetrik.Model.Hospital;

public class HospitalDAO extends DAO {

	public List<Hospital> getHospitals() {
		try {
			begin();
			Query hqlquery = getSession().createQuery("from Hospital");
			List<Hospital> hospitalList = hqlquery.list();

			commit();
			close();
			return hospitalList;

		} catch (HibernateException e) {
			rollback();
		}
		return null;
	}

	public Hospital getHospital(String id) {
		try {
			begin();
			Query hqlquery = getSession().createQuery("from Hospital where id = :hospId");
			hqlquery.setParameter("hospId", id);
			List<Hospital> hospitalList = hqlquery.list();

			commit();
			close();
			return hospitalList.get(0);

		} catch (HibernateException e) {
			rollback();
		}
		return null;
	}

}
