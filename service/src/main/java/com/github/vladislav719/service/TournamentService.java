package com.github.vladislav719.service;

import com.github.vladislav719.dto.TournamentCreationForm;
import com.github.vladislav719.model.Team;
import com.github.vladislav719.model.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Владислав on 04.04.2015.
 */
public interface TournamentService {

    public Iterable<Tournament> getTournamentsList();
    public Tournament getTournamentById(Long tournamentId);
    public Tournament createTournament(TournamentCreationForm tournamentCreationForm);
    public Object getWinner(Long tournamentId);
}
