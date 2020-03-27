package idris.backend.football.model.dto;

import idris.backend.football.model.dao.FootballPlayer;
import idris.backend.football.model.dao.FootballTeam;

import javax.persistence.Column;

public class DealDto {

    private int startYear;

    private int endYear;

    private int transferFee;

    private int commission;

    private int contractPrice;

    private String teamName;

    private String teamLocation;

    private FootballPlayer footballPlayer;

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public FootballPlayer getFootballPlayer() {
        return footballPlayer;
    }

    public void setFootballPlayer(FootballPlayer footballPlayer) {
        this.footballPlayer = footballPlayer;
    }


    public int getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(int transferFee) {
        this.transferFee = transferFee;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(int contractPrice) {
        this.contractPrice = contractPrice;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLocation() {
        return teamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        this.teamLocation = teamLocation;
    }
}
