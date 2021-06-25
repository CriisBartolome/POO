package com.example.ServicioRESTOpenAPI;

import org.mapstruct.Mapper;

import com.example.ServicioRESTOpenAPI.model.Producto;

@Mapper
public interface ProductoMapper {

    ProductoEntity productoAProductoEntity(Producto producto);
    Producto productoEntityAProducto(ProductoEntity productoEntity);
    
}
