package idris.backend.football.service;

import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.repository.FootballPlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballPlayerService {

    private FootballPlayerRepository footballPlayerRepository;

    public FootballPlayerService(FootballPlayerRepository footballPlayerRepository) {
        this.footballPlayerRepository = footballPlayerRepository;
    }

    public List<FootballPlayer> getAllFootballPlayers(){
        return footballPlayerRepository.findAll();
    }

    public FootballPlayer save(FootballPlayer footballPlayer){
        return footballPlayerRepository.save(footballPlayer);
    }

    public void delete(FootballPlayer footballPlayer){
        footballPlayerRepository.delete(footballPlayer);
    }

    public FootballPlayer update(FootballPlayer footballPlayer){
        return footballPlayerRepository.save(footballPlayer);
    }

    public FootballPlayer getById(int Id){
        return footballPlayerRepository.getOne(Id);
    }
}
