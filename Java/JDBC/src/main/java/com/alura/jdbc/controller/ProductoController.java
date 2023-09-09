package com.alura.jdbc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
		try {
			ConnectionFactory factory = new ConnectionFactory();
			final Connection con = factory.recuperaConexion();

			final PreparedStatement statement = con
					.prepareStatement("UPDATE PRODUCTO SET NOMBRE = ?, DESCRIPCION = ?, CANTIDAD = ? WHERE ID = ? ");
			statement.setString(1, nombre);
			statement.setString(2, descripcion);
			statement.setInt(3, cantidad);
			statement.setInt(4, id);
			statement.execute();
			JOptionPane.showMessageDialog(null, "Se han modificado los datos");
			System.out.println(nombre + ", " + descripcion + ", " + cantidad);
			int updateCount = statement.getUpdateCount();
			return updateCount;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			return -1;
		}
	}

	public int eliminar(Integer id) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();
		try (con) {
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
			try (statement) {
				statement.setInt(1, id);
				statement.execute();
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		}
	}

	public List<Map<String, String>> listar() throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();
		try (con) {
			final PreparedStatement statement = con
					.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			try (statement) {
				statement.execute();
				ResultSet resultSet = statement.getResultSet();
				List<Map<String, String>> resultado = new ArrayList<>();
				while (resultSet.next()) {
					Map<String, String> fila = new HashMap<>();
					fila.put("ID", String.valueOf(resultSet.getInt("ID")));
					fila.put("NOMBRE", resultSet.getString("NOMBRE"));
					fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
					fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));
					resultado.add(fila);
				}
				return resultado;
			}
		}
	}

	public void guardar(Map<String, String> producto) throws SQLException {
		String nombre = producto.get("NOMBRE");
		String descripcion = producto.get("DESCRIPCION");
		Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
		Integer maxCant = 100;
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();
		try (con) {
			con.setAutoCommit(false);
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO PRODUCTO (nombre, descripcion, cantidad) VALUES (?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			try (statement) {
				do {
					int cantdidadParaGuardar = Math.min(cantidad, maxCant);
					ejecutaRegistro(nombre, descripcion, cantdidadParaGuardar, statement);
					cantidad -= maxCant;
				} while (cantidad > 0);
				con.commit();
			} catch (Exception e) {
				con.rollback();
			}
		}
	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		statement.execute();
		final ResultSet resultSet = statement.getGeneratedKeys();
		try (resultSet) {
			while (resultSet.next()) {
				System.out.println(String.format("Fue insertado el valor de ID %d", resultSet.getInt(1)));
			}
		}
	}
}
