package edu.sru.thangiah.webrouting.repository;

import org.springframework.data.repository.CrudRepository;

import edu.sru.thangiah.webrouting.domain.VehicleTypes;

/**
 * Sets the VehicleTypes Repository using the CrudRepository
 * @author Logan Kirkwood	llk1005@sru.edu
 * @since 1/30/2022
 */

public interface VehicleTypesRepository extends CrudRepository<VehicleTypes, Long>{}
