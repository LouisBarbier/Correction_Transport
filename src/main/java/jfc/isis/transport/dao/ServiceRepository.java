package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, String> {
}