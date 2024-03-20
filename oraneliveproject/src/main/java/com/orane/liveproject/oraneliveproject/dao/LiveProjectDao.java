package com.orane.liveproject.oraneliveproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orane.liveproject.oraneliveproject.entity.CarEntity;

public interface LiveProjectDao extends JpaRepository<CarEntity, String> {

}
