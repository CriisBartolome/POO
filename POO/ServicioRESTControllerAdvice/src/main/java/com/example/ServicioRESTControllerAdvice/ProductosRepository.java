package com.example.ServicioRESTControllerAdvice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Integer> {
}
