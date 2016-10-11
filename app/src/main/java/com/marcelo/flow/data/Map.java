package com.marcelo.flow.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by projeto on 11/10/2016.
 */

public abstract class Map {
    protected String description;
    protected String name;
    protected User creator;
    protected List<User> moderators;

    List<Mission> missionList;

    public Map() {
        this.missionList = new ArrayList<>();
    }

    public List<Mission> getMissionList() {
        return missionList;
    }

    public void setMissionList(List<Mission> missionList) {
        this.missionList = missionList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<User> getModerators() {
        return moderators;
    }

    public void setModerators(List<User> moderators) {
        this.moderators = moderators;
    }

}
