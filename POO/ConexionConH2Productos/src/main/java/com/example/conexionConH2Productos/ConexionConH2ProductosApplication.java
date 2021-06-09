package com.example.conexionConH2Productos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class ConexionConH2ProductosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConexionConH2ProductosApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductosRepository productosRepository) {
        return (args) -> {
            Producto producto1 = new Producto("Camiseta", 1, 12.95, "Ropa");
            Producto producto2 = new Producto("Camiseta", 2, 10.0, "Deporte");
            Producto producto3 = new Producto("Perfume", 3, 35.50, "Perfumes");
            Producto producto4 = new Producto("Lechuga", 4, 0.85, "Verdura");
            Producto producto5 = new Producto("Helado", 5, 2.95, "Congelados");
            Producto producto6 = new Producto("Patata", 6, 0.72, "Verdura");

            // Guardo los productos
            productosRepository.save(producto1);
            productosRepository.findAll().forEach(System.out::println);

            productosRepository.save(producto2);
            productosRepository.save(producto3);
            productosRepository.save(producto4);
            productosRepository.save(producto5);
            productosRepository.save(producto6);

            // Creo un elemento para hacer la paginación
            // Indico la página y el número de elementos que quiero ver en cada
            // página
            Pageable pageable = PageRequest.of(0, 2);

            // Los listo todos
            productosRepository.findAll(pageable).forEach(System.out::println);

            pageable = PageRequest.of(1, 2);
            productosRepository.findAll(pageable).forEach(System.out::println);

            pageable = PageRequest.of(2, 2);
            productosRepository.findAll(pageable).forEach(System.out::println);

            // Creo un producto que va a ser el ejemplo de los productos que
            // quiero obtener
            // Tengo que indicarle las características
            Producto ejemplo = new Producto();
            ejemplo.setNombre("Camiseta");

            // Busco todos los objetos de nombre Camiseta y los escribo
            productosRepository.findAll(Example.of(ejemplo)).forEach(System.out::println);

            // Actualizo info de los productos
            producto2.setNombre("Balón");
            productosRepository.save(producto2);

            // Los listo todos
            productosRepository.findAll().forEach(System.out::println);

            // Cambio el nombre a l
            ejemplo.setNombre("l");

            // Creo un filtro que me permita encontrar todos los nombres que
            // contengan cierta caracteristica
            ExampleMatcher ejemploMacher = ExampleMatcher.matchingAny().withMatcher("nombre",
                    ExampleMatcher.GenericPropertyMatchers.contains());

            // En este caso, escribo los objetos que contengan la letra l
            // minúscula
            productosRepository.findAll(Example.of(ejemplo, ejemploMacher)).forEach(System.out::println);

            // Borro todos los elementos que contengan la l
            productosRepository.deleteAll(productosRepository.findAll(Example.of(ejemplo, ejemploMacher)));

            // Los listo todos
            productosRepository.findAll().forEach(System.out::println);

            // Utilizo el query method creado para buscar por categoria y los
            // escribo
            productosRepository.findByCategoria("Verdura").forEach(System.out::println);

            // Utilizo el query method creado para buscar productos que cuesten
            // más que una cantidad dada y los escribo
            productosRepository.findByPrecioGreaterThanEqual(10.0).forEach(System.out::println);

            // Utilizo el query method creado para buscar productos cuyo nombre
            // empiece por el string indicado y los escribo
            productosRepository.findByNombreStartingWith("P").forEach(System.out::println);

            // Utilizo el query method creado para buscar productos cuyo nombre
            // contenga la cadena indicada y los escribo
            productosRepository.findByNombreContaining("t").forEach(System.out::println);

            // Utilizo el query method creado para buscar productos cuya
            // categoria sea la indicada y las ordeno según su precio
            // ascendente. Después los escribo
            productosRepository.findByCategoriaOrderByPrecioAsc("Verdura").forEach(System.out::println);
        };
    }

}
