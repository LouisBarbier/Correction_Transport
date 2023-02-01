package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Transportpersonne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportpersonneRepository extends JpaRepository<Transportpersonne, Integer> {
}