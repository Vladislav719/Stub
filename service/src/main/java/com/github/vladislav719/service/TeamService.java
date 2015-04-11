package com.github.vladislav719.service;

import com.github.vladislav719.dto.TeamCreationForm;
import com.github.vladislav719.dto.TeamEditForm;
import com.github.vladislav719.model.Team;
import com.github.vladislav719.model.User;

/**
 * Created by Владислав on 04.04.2015.
 */
public interface TeamService {

    /**
     * создает команду
     * @param teamCreationForm
     * @return
     */
    public Team createTeam(TeamCreationForm teamCreationForm);

    public Team findTeamByName(String name);

    /**
     *
     * @param teamId
     * @return команду по id
     */
    public Team getTeamById(Long teamId);

    /**
     *
     * @return список всех команд
     */
    public Iterable<Team> getAllTeams();

    /**
     * удаляет команду
     * @param id
     * @return
     */
    public boolean deleteTeam(Long id);

    /**
     * редактирует информацию о команде
     * @param teamId
     * @param teamEditForm
     * @return
     */
    public Team editTeam(Long teamId, TeamEditForm teamEditForm);

    /**
     * удаляет юзера из состава
     * @param teamId
     * @param userId
     * @return
     */
    public boolean kickTeamMember(Long teamId, Long userId);

    /**
     * Можно отправить приглашение пользователю на вступление в команду
     * @param userIdTo
     * @param teamIdFrom
     * @return
     */

    public boolean sendInvite(Long userIdTo, Long teamIdFrom);

    /**
     * проверяет находится ли юзер в составе команды с teamId
     * @param userId
     * @param teamId
     * @return
     */
    public boolean isMember(Long userId, Long teamId);

    /**
     * возвращает список пользователей команды
     * @param teamId
     * @return
     */
    public Iterable<User> getMembers(Long teamId);

    /**
     * текущий юзер может отправить заявку на вступление в команду
     * @param teamId ид команды, в которую хочет вступить
     */
    public void sendJoinRequest(Long teamId);

    /**
     * Данный метод позволяет выходить из команды.
     * @param teamId
     * @return true если успешно вышел
     */
    public boolean leaveTeam(Long teamId);

    /**
     * Возвращает список пользователей, которые были приглашены в команду
     * @param teamId
     * @return
     */
    public Iterable<User> getInvitedUsers(Long teamId);

    public Team addWin(Long teamId);
    public Team addLose(Long teamId);
    public Team addDraw(Long teamId);
}
