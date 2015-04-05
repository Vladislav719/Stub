package com.github.vladislav719.service.impl;

import com.github.vladislav719.dto.TeamCreationForm;
import com.github.vladislav719.dto.TeamEditForm;
import com.github.vladislav719.model.Team;
import com.github.vladislav719.model.User;
import com.github.vladislav719.repository.TeamRepository;
import com.github.vladislav719.service.SecurityService;
import com.github.vladislav719.service.TeamService;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Владислав on 04.04.2015.
 */
@Service
public class TeamServiceImpl implements TeamService {

    private static final long DEFAULT_START_TEAM_SCORE_POINTS = 1000l;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private SecurityService securityService;

    @Override
    @Transactional
    public Team createTeam(TeamCreationForm teamCreationForm) {
        Team team = new Team();
        User user = securityService.getCurrentUser();
        team.setOwner(user);
        team.setTeam_score(DEFAULT_START_TEAM_SCORE_POINTS);
        team.setTeamName(teamCreationForm.getTeamName());
        return teamRepository.save(team);
    }

    @Override
    public Team getTeamById(Long teamId) {
        return teamRepository.findOne(teamId);
    }

    @Override
    public Iterable<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public boolean deleteTeam(Long id) {
        Team team = teamRepository.findOne(id);
        if (team == null)
            return false;
        teamRepository.delete(id);
        return true;
    }

    @Override
    public Team editTeam(Long teamId, TeamEditForm teamEditForm) {
        return null;
    }

    @Override
    public boolean kickTeamMember(Long teamId, Long userId) {
        return false;
    }

    @Override
    public boolean sendInvite(Long userIdTo, Long teamIdFrom) {
        return false;
    }

    @Override
    public boolean isMember(Long userId, Long teamId) {
        return false;
    }

    @Override
    public Iterable<User> getMembers(Long teamId) {
        return null;
    }

    @Override
    public void sendJoinRequest(Long teamId) {

    }

    @Override
    public boolean leaveTeam(Long teamId) {
        return false;
    }

    @Override
    public Iterable<User> getInvitedUsers(Long teamId) {
        return null;
    }

    @Override
    public Team addWin(Long teamId) {
        return null;
    }

    @Override
    public Team addLose(Long teamId) {
        return null;
    }

    @Override
    public Team addDraw(Long teamId) {
        return null;
    }
}
