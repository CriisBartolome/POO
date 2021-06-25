package com.example.ServicioRESTOpenAPI;

import com.example.ServicioRESTOpenAPI.model.Producto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-25T09:08:27+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoEntity productoAProductoEntity(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoEntity productoEntity = new ProductoEntity();

        productoEntity.setNombre( producto.getNombre() );
        productoEntity.setId( producto.getId() );
        productoEntity.setPrecio( producto.getPrecio() );
        productoEntity.setCategoria( producto.getCategoria() );

        return productoEntity;
    }

    @Override
    public Producto productoEntityAProducto(ProductoEntity productoEntity) {
        if ( productoEntity == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoEntity.getId() );
        producto.setNombre( productoEntity.getNombre() );
        producto.setPrecio( productoEntity.getPrecio() );
        producto.setCategoria( productoEntity.getCategoria() );

        return producto;
    }
}
