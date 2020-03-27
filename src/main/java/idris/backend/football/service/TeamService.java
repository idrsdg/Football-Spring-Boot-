package idris.backend.football.service;

import idris.backend.football.model.dao.FootballTeam;
import idris.backend.football.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired

    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<FootballTeam> getAllTeamsOfAFootballPlayer(){
        return teamRepository.findAll();
    }

    public FootballTeam save(FootballTeam footBallTeam) {
        return teamRepository.save(footBallTeam);
    }

    public void delete(FootballTeam footBallTeam){
        teamRepository.delete(footBallTeam);
    }

    public FootballTeam update(FootballTeam footBallTeam){
        return teamRepository.save(footBallTeam);
    }

    public FootballTeam getById(int id){
        return teamRepository.getOne(id);
    }

    /*public List<Team> getAllTeamsOfAFootballPlayer(int footballPlayerId) {
        List<Deal> deals = dealRepository.getAllByFootballPlayerId(footballPlayerId);

        Set<Team> teams = new HashSet<>();

        deals.forEach(deal -> teams.add(deal.getTeam()));

        return new ArrayList<>(teams);
    }

     */
}
