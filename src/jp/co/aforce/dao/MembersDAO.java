package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class MembersDAO extends DAO {
	
	public List<Product> search(String keyword)throws Exception{
		List<Product> list = new ArrayList<>();
		
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement("select * from product where name like ?");
		st.setString(1 , "%" + keyword + "%");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			list.add(p);
		}
		
		st.close();
		st.close();
		
		return list;
	}
	
	public int insert(Product product) throws Exception{
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement("insert into product values(null , ? , ?)");
		st.setString(1, product.getName());
		st.setInt(2, product.getPrice());
		int line = st.executeUpdate();
		
		st.close();
		con.close();
		return line;
	}

}
