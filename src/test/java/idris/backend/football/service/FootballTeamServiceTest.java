package idris.backend.football.service;

import idris.backend.football.model.dao.FootballTeam;
import idris.backend.football.repository.TeamRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FootballTeamServiceTest {

    @Mock
    private TeamRepository teamRepository;

    @Mock
    private TeamService teamService;


    @Before
    public void setUp() {
        teamService = new TeamService(teamRepository);
    }

    @Test
    public void shouldDelete() {

        //given
        FootballTeam footBallTeam = new FootballTeam();
        footBallTeam.setName("fenerbahce");

        //then
        teamService.delete(footBallTeam);

        //verify
        verify(teamRepository).delete(footBallTeam);
    }

    @Test
    public void shouldGet() {
        //given
        FootballTeam footBallTeam = new FootballTeam();
        footBallTeam.setId(100);

        //when
        when(teamRepository.getOne(100)).thenReturn(footBallTeam);

        assertEquals(teamService.getById(100), footBallTeam);
    }

    @Test
    public void shouldSave() {

        //given
        FootballTeam footBallTeam = new FootballTeam();
        footBallTeam.setId(1);
        footBallTeam.setLocation("kadikoy");
        footBallTeam.setName("fenerbahce");

        //when
        when(teamRepository.save(footBallTeam)).thenReturn(footBallTeam);

        //then
        FootballTeam returnedFootballTeam = teamService.save(footBallTeam);

        //verify
        verify(teamRepository).save(footBallTeam);

        assertEquals(footBallTeam.getId(), returnedFootballTeam.getId());
        assertEquals(footBallTeam.getLocation(), returnedFootballTeam.getLocation());

    }

}
