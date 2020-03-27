package idris.backend.football.controller;

import idris.backend.football.model.dao.FootballTeam;
import idris.backend.football.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("football/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/create")
    public FootballTeam createTeam(@RequestBody FootballTeam footBallTeam){
        return teamService.save(footBallTeam);
    }

    @PutMapping("/put")
    public FootballTeam updateTeam(@RequestBody FootballTeam footBallTeam){
        return teamService.update(footBallTeam);
    }

    @DeleteMapping("/delete")
    public void deleteFootballPlayer(@RequestBody FootballTeam footBallTeam){
        teamService.delete(footBallTeam);
    }

    @GetMapping("/get")
    public List<FootballTeam> getAllTeamsOfAFootballPlayer() {
        return teamService.getAllTeamsOfAFootballPlayer();
    }
}
