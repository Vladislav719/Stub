package com.github.vladislav719.controller.api;

import com.github.vladislav719.dto.TeamCreationForm;
import com.github.vladislav719.helper.http.errors.ResponseBuilder;
import com.github.vladislav719.model.Team;
import com.github.vladislav719.model.User;
import com.github.vladislav719.service.SecurityService;
import com.github.vladislav719.service.TeamService;
import static com.google.common.base.Preconditions.checkNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vladislav on 11.04.2015.
 */
@RestController
@RequestMapping("api/")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "team", method = RequestMethod.POST)
    public @ResponseBody Object registerTeam(@RequestBody TeamCreationForm teamCreationForm) {
        User currentUser = securityService.getCurrentUser();
        Team team = teamService.findTeamByName(teamCreationForm.getTeamName());
//        checkNotNull(team, ResponseBuilder.standartErrorResource(HttpStatus.CONFLICT, "you should use unique name of your team"));
        if (team == null) {
            team = teamService.createTeam(teamCreationForm);
            return ResponseBuilder.success(HttpStatus.OK, team);
        }else {
            //проверить у пользователя состоит ли он уже в команде или нет
        }
        return ResponseBuilder.standartErrorResource(HttpStatus.BAD_REQUEST, "Team already exist with requested name");
    }

}
