package com.tienda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductoDAO {
    public void insertarProducto(String nombre, float precio, int cantidad) {
        String sql = "INSERT INTO Productos (nombre, precio, cantidad) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setFloat(2, precio);
            statement.setInt(3, cantidad);
            statement.executeUpdate();
            System.out.println("Producto insertado: " + nombre);
        } catch (SQLException e) {
            System.err.println("Error al insertar producto: " + e.getMessage());
        }
    }

    public void mostrarProductos() {
        String sql = "SELECT * FROM Productos";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                float precio = resultSet.getFloat("precio");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio);
            }
        } catch (SQLException e) {
            System.err.println("Error al leer productos: " + e.getMessage());
        }
    }

    public void actualizarPrecio(String nombre, float nuevoPrecio) {
        String sql = "UPDATE Productos SET precio = ? WHERE nombre = ?";
        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setFloat(1, nuevoPrecio);
            statement.setString(2, nombre);
            statement.executeUpdate();
            System.out.println("Precio actualizado para el producto: " + nombre);
        } catch (SQLException e) {
            System.err.println("Error al actualizar precio: " + e.getMessage());
        }
    }

    public void eliminarProducto(String nombre) {
        String sql = "DELETE FROM Productos WHERE nombre = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.executeUpdate();
            System.out.println("Producto eliminado: " + nombre);
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto: " + e.getMessage());
        }
    }
}
