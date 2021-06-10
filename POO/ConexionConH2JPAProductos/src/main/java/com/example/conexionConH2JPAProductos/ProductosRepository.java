package com.example.conexionConH2JPAProductos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {
    // Expresión SpEL usando Query
    // Si en este caso las omitimos, nos funcionan los query methods
    // perfectamente, ya que JPA sabe hacer la transformación a la consulta
    // indicada
    @Query("select p from #{#entityName} p where p.categoria=?1")
    List<Producto> findByCategoria(String categoria);

    @Query("select p from #{#entityName} p where p.precio>=?1")
    List<Producto> findByPrecioGreaterThanEqual(Double precio);
    
    @Query("select p from #{#entityName} p where p.categoria = ?1 and p.precio>= ?2")
    List<Producto> findByCategoriaAndPrecioGreaterThanEqual(String categoria, Double precio);

    //Si ponía #{#entityName} en vez de Producto, daba error
    @Query("select p from Producto p where p.categoria = :#{#producto.categoria} and p.precio>= :#{#producto.precio}")
    List<Producto> findByCategoriaAndPrecioGreaterThanEqual(Producto producto);
    
    @Query("select p from #{#entityName} p where p.nombre like ?1%")
    List<Producto> findByNombreStartingWith(String inicio);

    @Query("select p from #{#entityName} p where p.nombre like %?1%")
    List<Producto> findByNombreContaining(String cadena);

    @Query("select p from #{#entityName} p where p.categoria=?1 order by p.precio asc")
    List<Producto> findByCategoriaOrderByPrecioAsc(String categoria);
}
