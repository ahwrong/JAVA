package banking;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class CustomerDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public CustomerDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 전체 고객 정보 조회
	 * @return
	 */
	public ArrayList<Customer> findAllCustomers(){
		String sql = "SELECT * FROM Customer";
		//List<Customer> customerList = new Array (강사님 코드)
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();   //중요한 부분
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerID(rs.getString("customerId"));
					customerList.add(c);
				}
			}finally {
				rs.close();
				pstmt.close();
				con.close();
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return customerList;
	}
	/**
	 * 주민번호로 고객 조회
	 * @param ssn
	 * @return
	 */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn = ?";
		Customer c = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();   
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerID(rs.getString("customerId"));
				}
			}finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return c;
	}
	/**
	 * 신규 등록 고객 (add)
	 * @param customer  			등록할 고객 정보
	 */
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd)"
			+ " VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  customer.getName());
			pstmt.setString(2,  customer.getSsn());
			pstmt.setString(3,  customer.getPhone());
			pstmt.setString(4,  customer.getCustomerID());
			pstmt.setString(5,  customer.getPassword());
			pstmt.executeUpdate(); 
			pstmt.close();
			con.close();
			System.out.println("INSERTED....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * 객체 sql : sql안에 사용할 쿼리 입력
 * 객체 pstmt : sql쿼리를 받을 값
 * 객체 rs : 결과값 받아오는 것
 * JDBC_DRIVER : mysql Driver 경로 저장
 * JDBC_URL : mysql server 경로 저장
 * JDBC_USER = mysql Id 저장
 * JDBC_PASSWORD = mysql pw 저장
 */
