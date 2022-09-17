package com.example.comercio.servicio;

import java.util.Optional;

import com.example.comercio.modelo.Producto;

public interface ProductoService {

	public Producto save( Producto producto);
	public Optional <Producto>get(Integer id);
	public void update( Producto producto);
	public void delete( Integer id);
}
