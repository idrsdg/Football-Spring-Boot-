package idris.backend.football.repository;

import idris.backend.football.model.dao.FootballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<FootballTeam, Integer> {
}
