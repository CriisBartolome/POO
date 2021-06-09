package com.example.conexionConH2Productos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Integer>{
    List <Producto> findByCategoria(String categoria);
    List <Producto> findByPrecioGreaterThanEqual(Double precio);
    List <Producto> findByNombreStartingWith(String inicio);
    List <Producto> findByNombreContaining(String cadena);
    List <Producto> findByCategoriaOrderByPrecioAsc(String categoria);
}
