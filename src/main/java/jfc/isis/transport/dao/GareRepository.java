package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Gare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GareRepository extends JpaRepository<Gare, String> {
}