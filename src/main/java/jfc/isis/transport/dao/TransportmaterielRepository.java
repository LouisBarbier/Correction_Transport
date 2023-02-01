package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Transportmateriel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportmaterielRepository extends JpaRepository<Transportmateriel, Integer> {
}