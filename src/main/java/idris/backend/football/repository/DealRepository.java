package idris.backend.football.repository;

import idris.backend.football.model.dao.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> {
}
