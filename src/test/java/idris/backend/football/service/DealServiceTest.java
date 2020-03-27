package idris.backend.football.service;

import idris.backend.football.model.dao.Deal;
import idris.backend.football.repository.DealRepository;
import idris.backend.football.repository.FootballPlayerRepository;
import idris.backend.football.repository.TeamRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DealServiceTest {

    @Mock
    private DealRepository dealRepository;

    @Mock
    private TeamRepository teamRepository;

    @Mock
    private FootballPlayerRepository footballPlayerRepository;

    private DealService dealService;

    @Before
    public void setUp() {
        dealService = new DealService(dealRepository, teamRepository, footballPlayerRepository);
    }

    @Test
    public void shouldDelete() {
        //given
        Deal deal = new Deal();
        deal.setStartYear(2020);

        //then
        dealService.delete(deal);

        //verify
        verify(dealRepository).delete(deal);
    }

    @Test
    public void shouldGet() {
        //given
        Deal deal = new Deal();
        deal.setId(10);

        //when
        when(dealRepository.getOne(10)).thenReturn(deal);

        //then
        dealService.getById(10);

        //verify
        verify(dealRepository).getOne(10);

    }


    @Test
    public void shouldUpdate() {
        //given
        Deal deal = new Deal();
        deal.setStartYear(2020);

        //when
        when(dealRepository.save(deal)).thenReturn(deal);

        //then
        Deal returnedDeal = dealService.save(deal);

        //verify
        verify(dealRepository).save(deal);
    }


    @Test
    public void shouldSave() {
        //given:
        Deal deal = new Deal();
        deal.setCommission(0);
        deal.setContractPrice(100);

        //when:
        when(dealRepository.save(deal)).thenReturn(deal);

        //then:
        Deal returnedDeal = dealService.save(deal);

        //verify
        verify(dealRepository).save(deal);

        assertEquals(deal.getCommission(), returnedDeal.getCommission());
        assertEquals(deal.getContractPrice(), returnedDeal.getContractPrice());

    }
}
