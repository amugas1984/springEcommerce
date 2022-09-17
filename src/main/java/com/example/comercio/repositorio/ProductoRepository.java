package com.example.comercio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comercio.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
