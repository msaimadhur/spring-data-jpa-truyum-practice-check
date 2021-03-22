package com.cognizant.truyum.repository;

import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

	public List<MenuItem> findByActiveAndDateOfLaunchBefore(boolean active, Date date);

}
