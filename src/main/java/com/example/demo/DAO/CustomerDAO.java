package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Customer;
@Repository
public class CustomerDAO implements CustomerRepo{
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM customer";
		
		return jdbc.query(query,(res , i)->{
			Customer cut = new Customer();
			cut.setID(res.getInt("id"));
			cut.setAddress(res.getString("address"));
			cut.setEmail(res.getString("email"));
			cut.setFirstName(res.getString("first_name"));
			cut.setDate(res.getDate("date"));
			cut.setLastName(res.getString("last_name"));
			cut.setPhoneNumber(res.getString("phone_number"));
			return cut;
		});
	}

	@Override
	public List<Customer> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Customer> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Customer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(Integer id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM CUSTOMER WHERE ID = " + Integer.toString(id) ;
		List<Customer> custs =  jdbc.query(query,(res , i)->{
			Customer cut = new Customer();
			cut.setID(res.getInt("id"));
			cut.setAddress(res.getString("address"));
			cut.setEmail(res.getString("email"));
			cut.setFirstName(res.getString("first_name"));
			cut.setDate(res.getDate("date"));
			cut.setLastName(res.getString("last_name"));
			cut.setPhoneNumber(res.getString("phone_number"));
			return cut;
		});
		if(custs.size() > 0) {
			return custs.get(0);
		}
		return null;
		}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public <S extends Customer> S save1(S en) throws Exception {
		// TODO Auto-generated method stub
		String query = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?,?)";
		int res = 0;
		try {
			res = jdbc.update(query, en.getID() , en.getAddress() ,en.getDate() ,en.getEmail(), en.getFirstName()
					,en.getLastName() , en.getPassword() , en.getPhoneNumber());
			System.out.print("record updated");
			return en;
		}catch(Exception e) {
			System.out.print("error");
			throw new Exception("error");
		}
		
		
	}

	@Override
	public  <S extends Customer> S save(S en) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?,?)";
		int res = 0;
		try {
			res = jdbc.update(query, en.getID() , en.getAddress() ,en.getDate() ,en.getEmail(), en.getFirstName()
					,en.getLastName() , en.getPassword() , en.getPhoneNumber());
			System.out.print("record updated");
			return en;
		}catch(Exception e) {
			System.out.print("error");
		}
		return en;
		
	}

	@Override
	public Optional<Customer> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Customer> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Customer> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
