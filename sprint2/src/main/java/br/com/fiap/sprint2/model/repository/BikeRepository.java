package br.com.fiap.sprint2.model.repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.sprint2.model.entity.Bike;

public class BikeRepository extends Repository{
	
	public static ArrayList<Bike> findAll() {
		ArrayList<Bike> Bike = new ArrayList<Bike>();
		String sql = "select * from tb_bike";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Bike bike = new Bike();
					bike.setid(rs.getLong("id"));
					bike.setModel(rs.getString("model"));
					bike.setColor(rs.getString("color"));
					bike.setAccident(rs.getString("accident"));
					bike.setBrand(rs.getString("brand"));
					bike.setModification(rs.getString("modification"));
					
					Bike.add(bike);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return Bike;
	}
	
	
	public static Bike save(Bike bike) {
		String sql = "insert into tb_bike" + "(id, model, color, accident, brand, modification, nameBike)"
				+ " values(null, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, bike.getModel());
			ps.setString(2, bike.getColor());
			ps.setString(3, bike.getAccident());
			ps.setString(4, bike.getBrand());
			ps.setString(5, bike.getModification());
			ps.setString(6, bike.getNameBike());		
			if (ps.executeUpdate() > 0) {
				return bike;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}
	
	public static boolean delete(Long id) {
		String sql = "delete from tb_bike where id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			if (ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return false;
	}

	public static Bike update(Bike bike) {
		String sql = "UPDATE tb_bike " + "SET model=?, color=?, accident=?, brand=?, modification=?, nameBike=? "
				+ "WHERE id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, bike.getModel());
			ps.setString(2, bike.getColor());
			ps.setString(3, bike.getAccident());
			ps.setString(4, bike.getBrand());
			ps.setString(5, bike.getModification());
			ps.setString(6, bike.getNameBike());
			ps.setLong(7, bike.getId());
			if (ps.executeUpdate() > 0) {
				return bike;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}

	
	
	
	public static Bike findById(Long id) {
		String sql = "select * from tb_bike where id=?";
		Bike bike = new Bike();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				bike.setid(rs.getLong("id"));
				bike.setModel(rs.getString("model"));
				bike.setColor(rs.getString("color"));
				bike.setAccident(rs.getString("accident"));
				bike.setBrand(rs.getString("brand"));
				bike.setModification(rs.getString("modification"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return bike;
	}
}


