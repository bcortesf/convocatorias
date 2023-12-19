package com.bryancfz.wishlist.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bryancfz.wishlist.apirest.models.entity.RecordWishList;

public interface IRecordWishListDao extends JpaRepository<RecordWishList, Long>{

}
