package com.tienda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.insertarProducto("Camiseta", 10.5f, 1);
        productoDAO.insertarProducto("Pantalones", 20.0f, 1);
        productoDAO.insertarProducto("Chaqueta", 30.25f, 1);
        productoDAO.mostrarProductos();
        productoDAO.actualizarPrecio("Camiseta", 9.5f);
        productoDAO.mostrarProductos();
        productoDAO.eliminarProducto("Chaqueta");
        productoDAO.mostrarProductos();
    }
}