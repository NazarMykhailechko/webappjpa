package webapplication.dao;

import org.springframework.stereotype.Repository;
import webapplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {
}