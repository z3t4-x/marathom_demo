package com.dev.service;

import com.dev.domain.Producto;

import java.util.List;

public interface ProductoService {


    List<Producto> listarProductos();
    Producto obtenerProductoPorId(Long id);
    Producto guardarProducto(Producto producto);
}
