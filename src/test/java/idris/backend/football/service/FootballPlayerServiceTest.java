package idris.backend.football.service;

import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.repository.FootballPlayerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class FootballPlayerServiceTest {

    @Mock
    private FootballPlayerRepository footballPlayerRepository;

    private FootballPlayerService footballPlayerService;

    @Before
    public void setUp(){
        footballPlayerService = new FootballPlayerService(footballPlayerRepository);
    }

    @Test
    public void shouldGet(){
        //given
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setId(10);

        //when
        when(footballPlayerRepository.getOne(10)).thenReturn(footballPlayer);

        //then
        footballPlayerService.getById(10);

        //verify
        verify(footballPlayerRepository).getOne(10);

    }

    @Test
    public void shouldDelete(){
        //given
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setName("idris");

        //then
        footballPlayerService.delete(footballPlayer);

        //verify
        verify(footballPlayerRepository).delete(footballPlayer);
    }

    @Test
    public void shouldSave(){
        //given
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setName("idris");

        //when
        when(footballPlayerRepository.save(footballPlayer)).thenReturn(footballPlayer);

        //then
        FootballPlayer returnedFootballPlayer = footballPlayerService.save(footballPlayer);

        //verify
        verify(footballPlayerRepository).save(footballPlayer);

        assertEquals(footballPlayer.getName(), returnedFootballPlayer.getName());
    }
}
