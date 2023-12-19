package com.bryancfz.wishlist.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bryancfz.wishlist.apirest.models.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
