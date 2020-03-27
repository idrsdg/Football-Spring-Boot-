package idris.backend.football.controller;

import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("football/player")
public class FootballController {
    @Autowired
    private FootballPlayerService footballPlayerService;

    //entityleri controllerlarda kullanma
    @PostMapping("/create")
    public FootballPlayer createFootballPlayer(@RequestBody FootballPlayer footballPlayer){
        return footballPlayerService.save(footballPlayer);
    }

    @PutMapping("/put")
    public FootballPlayer updateFootballPlayer(@RequestBody FootballPlayer footballPlayer){
        return footballPlayerService.update(footballPlayer);
    }

    @DeleteMapping("/delete")
    public void deleteFootballPlayer(@RequestBody FootballPlayer footballPlayer){
        footballPlayerService.delete(footballPlayer);
    }

    @GetMapping("/get")
    public List<FootballPlayer> getAllPlayers(){
        return footballPlayerService.getAllFootballPlayers();
    }
}
