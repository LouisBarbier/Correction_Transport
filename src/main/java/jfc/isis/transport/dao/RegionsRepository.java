package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionsRepository extends JpaRepository<Regions, String> {
}