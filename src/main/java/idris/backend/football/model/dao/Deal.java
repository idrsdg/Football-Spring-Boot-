package idris.backend.football.model.dao;

import javax.persistence.*;

@Table
@Entity
public class Deal {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private int endYear;

    @Column(name = "transfer_fee")
    private int transferFee;

    @Column(name = "commission")
    private int commission;

    @Column(name = "contract_price")
    private int contractPrice;

    @Column(name = "football_player_id")
    private int footballPlayerId;

    @Column(name = "team_id")
    private int teamId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getFootballPlayer() {
        return footballPlayerId;
    }

    public void setFootballPlayer(int footballPlayer) {
        this.footballPlayerId = footballPlayer;
    }

    public int getTeam() {
        return teamId;
    }

    public void setTeam(int team) {
        this.teamId = team;
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
}
