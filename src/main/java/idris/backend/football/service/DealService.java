package idris.backend.football.service;

import idris.backend.football.mapper.DealToDealDtoMapper;
import idris.backend.football.model.dao.Deal;
import idris.backend.football.model.dto.DealDto;
import idris.backend.football.repository.DealRepository;
import idris.backend.football.repository.FootballPlayerRepository;
import idris.backend.football.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DealService {

    //böyle yapınca testtlerde bu class da yaratılır mı?
    private final DealRepository dealRepository;
    private final TeamRepository teamRepository;
    private final FootballPlayerRepository footballPlayerRepository;

    public DealService(DealRepository dealRepository, TeamRepository teamRepository, FootballPlayerRepository footballPlayerRepository) {
        this.dealRepository = dealRepository;
        this.teamRepository = teamRepository;
        this.footballPlayerRepository = footballPlayerRepository;
    }

    public List<DealDto> getAllDeals() {
        return dealRepository.findAll()
                .stream()
                .map(deal -> DealToDealDtoMapper.dealToDealDtoMapper(deal, teamRepository.findById(deal.getTeam()).get(), footballPlayerRepository.findById(deal.getFootballPlayer()).get()))
                .collect(Collectors.toList());
    }

    public Deal save(Deal deal) {
        return dealRepository.save(deal);
    }

    public Deal update(Deal deal) {
        return dealRepository.save(deal);
    }

    public void delete(Deal deal) {
        dealRepository.delete(deal);
    }

    public Deal getById(int id) {
        return dealRepository.getOne(id);
    }
}
