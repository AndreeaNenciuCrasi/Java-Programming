package com.company;

public class Main {

    public static void main(String[] args) {
	    League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        System.out.println();
        hawthorn.matchResult(fremantle, 1, 0);
        System.out.println();
        hawthorn.matchResult(adelaideCrows, 3, 8);
        System.out.println();
        adelaideCrows.matchResult(fremantle, 2,1);
        System.out.println();

//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();

//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team rawTeam = new Team("Raw Team");
//        rawTeam.addPlayer(beckham);
//        rawTeam.addPlayer(pat);
//
//        footballLeague.add(rawTeam);
//
//        League<Team> rawLeague =new League<>("Raw");
//        rawLeague.add(adelaideCrows);
//        rawLeague.add(baseballTeam);
//        rawLeague.add(rawTeam);
//
//        League reallyRaw = new League("Really raw");
//        reallyRaw.add(adelaideCrows);
//        reallyRaw.add(baseballTeam);
//        reallyRaw.add(rawTeam);
    }
}
