package jfc.isis.transport.dao;

import jfc.isis.transport.entity.Container;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerRepository extends JpaRepository<Container, Integer> {
}