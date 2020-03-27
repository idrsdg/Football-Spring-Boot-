package idris.backend.football.controller;

import idris.backend.football.mapper.DealToDealDtoMapper;
import idris.backend.football.model.dao.Deal;
import idris.backend.football.model.dto.DealDto;
import idris.backend.football.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/football/deal")
public class DealController {
    @Autowired
    private DealService dealService;

    @PostMapping("/create")
    public Deal createDeal(@RequestBody Deal deal) {
        return dealService.save(deal);
    }

    @PutMapping("/put")
    public Deal updateDeal(@RequestBody Deal deal) {
        return dealService.save(deal);
    }

    @DeleteMapping("/delete")
    public void deleteFootballPlayer(@RequestBody Deal deal) {
        dealService.delete(deal);
    }

    @GetMapping("/get")
    public List<DealDto> getAllDeals() {
        return dealService.getAllDeals();
    }

}
