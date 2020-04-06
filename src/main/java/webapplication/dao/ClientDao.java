package webapplication.dao;

import org.springframework.stereotype.Repository;
import webapplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Integer> {
    List<Client> findByUserlogin(String login);
}