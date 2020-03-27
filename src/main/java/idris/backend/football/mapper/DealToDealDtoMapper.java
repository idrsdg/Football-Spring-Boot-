package idris.backend.football.mapper;

import idris.backend.football.model.dao.Deal;
import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.model.dao.FootballTeam;
import idris.backend.football.model.dto.DealDto;

public class DealToDealDtoMapper {
    public static DealDto dealToDealDtoMapper(Deal deal, FootballTeam footBallTeam, FootballPlayer footballPlayer) {
        DealDto dealDto = new DealDto();
        dealDto.setCommission(deal.getCommission());
        dealDto.setContractPrice(deal.getContractPrice());
        dealDto.setEndYear(deal.getEndYear());
        dealDto.setFootballPlayer(footballPlayer);
        dealDto.setStartYear(deal.getStartYear());
        dealDto.setTeamName(footBallTeam.getName());
        dealDto.setTeamLocation(footBallTeam.getLocation());
        dealDto.setTransferFee(deal.getTransferFee());

        return dealDto;
    }
}
