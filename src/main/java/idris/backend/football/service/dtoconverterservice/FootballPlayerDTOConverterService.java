package idris.backend.football.service.dtoconverterservice;

import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.model.dto.FootballPlayerDTO;
import org.springframework.stereotype.Component;

@Component
public class FootballPlayerDTOConverterService {

    public FootballPlayerDTO apply(FootballPlayer footballPlayer) {
        FootballPlayerDTO footballPlayerDTO = new FootballPlayerDTO();
        footballPlayerDTO.setAge(String.valueOf(footballPlayer.getAge()));
        footballPlayerDTO.setName(footballPlayer.getName());
        footballPlayerDTO.setSurname(footballPlayer.getSurname());

        return footballPlayerDTO;
    }
}
