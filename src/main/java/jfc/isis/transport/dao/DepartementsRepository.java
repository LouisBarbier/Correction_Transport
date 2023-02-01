package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Departements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementsRepository extends JpaRepository<Departements, String> {
}