package br.com.fiap.sprint2.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.sprint2.model.entity.Protocol;

public class ProtocolRepository extends Repository{
	public static ArrayList<Protocol> findAll() {
		ArrayList<Protocol> Protocol = new ArrayList<Protocol>();
		String sql = "select * from tb_protocol";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Protocol protocol = new Protocol();
					protocol.setAproved(true);
					protocol.setIdprotocol(5);
					Protocol.add(protocol);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return Protocol;
	}
	
	public static Protocol save(Protocol protocol) {
		String sql = "insert into tb_protocol" + "(idprotocol, aproved) values(null, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setBoolean(1, protocol.isAproved());		
			if (ps.executeUpdate() > 0) {
				return protocol;
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
	
	public static boolean delete(long idprotocol) {
	    String sql = "delete from tb_protocol where idprotocol=?";
	    try {
	        PreparedStatement ps = getConnection().prepareStatement(sql);
	        ps.setLong(1, idprotocol);
	        if (ps.executeUpdate() > 0) {
	            return true;
	        } else {
	            return false;
	        }
	    } catch (SQLException e) {
	        System.out.println("Erro ao excluir: " + e.getMessage());
	    } finally {
	        closeConnection();
	    }
	    return false;
	}


	public static Protocol update(Protocol protocol) {
	    String sql = "UPDATE tb_protocol SET aproved = ? WHERE idprotocol = ?";
	    try {
	        PreparedStatement ps = getConnection().prepareStatement(sql);
	        ps.setBoolean(1, protocol.isAproved()); 
	        ps.setInt(2, protocol.getIdprotocol()); 
	        if (ps.executeUpdate() > 0) {
	            return protocol; 
	        } else {
	            return null; 
	        }
	    } catch (SQLException e) {
	        System.out.println("Erro ao atualizar: " + e.getMessage());
	    } finally {
	        closeConnection(); 
	    }
	    return null; 
	}


	
	
	
	public static Protocol findByidprotocol(long id) {
		String sql = "select * from tb_cliente where id=?";
		Protocol protocol = new Protocol();
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				Protocol protocol3 = new Protocol();
				protocol3.setAproved(true);
				protocol3.setIdprotocol(5);
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return protocol;
	}

}




	
	






