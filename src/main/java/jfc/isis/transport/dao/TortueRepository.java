package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Tortue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TortueRepository extends JpaRepository<Tortue, Integer> {
}