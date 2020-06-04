package com.asaqib.InventoryMgmtSystm;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.asaqib.InventoryMgmtSystm.model.Items;


public interface InventoryRepository extends CrudRepository<Items, Integer>{
	

}
