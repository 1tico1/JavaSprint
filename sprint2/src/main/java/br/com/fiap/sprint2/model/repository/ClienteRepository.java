package br.com.fiap.sprint2.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.sprint2.model.entity.Cliente;

public class ClienteRepository extends Repository{
	public static ArrayList<Cliente> findAll() {
		ArrayList<Cliente> Cliente = new ArrayList<Cliente>();
		String sql = "select * from tb_cliente";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setId(rs.getInt("id"));
					cliente.setName(rs.getString("name"));
					cliente.setCpf(rs.getString("cpf"));
					cliente.setMail(rs.getString("mail"));
					cliente.setRg(rs.getString("rg"));
					cliente.setConfirmMail(rs.getString("confirmMail"));
					cliente.setConfirmPass(rs.getString("confirmPass"));
					cliente.setPassword(rs.getString("password"));
					Cliente.add(cliente);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return Cliente;
	}
	
	public static Cliente save(Cliente cliente) {
		String sql = "insert into tb_cliente" + "(id, name, cpf, mail, rg, confirmMail, confirmPass, password)"
				+ " values(null, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, cliente.getName());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getMail());
			ps.setString(4, cliente.getRg());
			ps.setString(5, cliente.getConfirmMail());
			ps.setString(6, cliente.getConfirmPass());
			ps.setString(7, cliente.getPassword());		
			if (ps.executeUpdate() > 0) {
				return cliente;
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
		String sql = "delete from tb_cliente where id=?";
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

	public static Cliente update(Cliente cliente) {
		String sql = "UPDATE tb_cliente " + "SET name=?, cpf=?, mail=?, rg=?, confirmMail=?, confirmPass=?, password=? "
				+ "WHERE id=?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, cliente.getName());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getMail());
			ps.setString(4, cliente.getRg());
			ps.setString(5, cliente.getConfirmMail());
			ps.setString(6, cliente.getConfirmPass());
			ps.setString(7, cliente.getPassword());
			ps.setLong(8, cliente.getId());
			if (ps.executeUpdate() > 0) {
				return cliente;
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

	
	
	
	public static Cliente findByid(long id) {
		String sql = "select * from tb_cliente where id=?";
		Cliente cliente = new Cliente();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				cliente.setId(rs.getInt("id"));
				cliente.setName(rs.getString("name"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setMail(rs.getString("mail"));
				cliente.setRg(rs.getString("rg"));
				cliente.setConfirmMail(rs.getString("confirmMail"));
				cliente.setConfirmPass(rs.getString("confirmPass"));
				cliente.setPassword(rs.getString("password"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return cliente;
	}

}




	
	



