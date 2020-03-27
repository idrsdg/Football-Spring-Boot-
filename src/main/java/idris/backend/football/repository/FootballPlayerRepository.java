package idris.backend.football.repository;

import idris.backend.football.model.dao.FootballPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballPlayerRepository extends JpaRepository <FootballPlayer, Integer> {
    FootballPlayer save(FootballPlayer footballPlayer);

    List<FootballPlayer> findAll();

}
