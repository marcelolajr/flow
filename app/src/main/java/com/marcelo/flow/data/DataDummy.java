package com.marcelo.flow.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by projeto on 11/10/2016.
 */

public class DataDummy {

    public List<Flow> flowList;
    public List<Mission> missionList;
    public List<User> userList;

    public DataDummy() {

    }

    public void load(){
        this.flowList = new ArrayList<>();
        this.missionList = new ArrayList<>();
        this.userList = new ArrayList<>();

        User moderator = new User();
        moderator.setEmail("marcelolajr@gmail.com");
        moderator.setFullname("Marcelo Aguiar");
        moderator.setNickname("Dartagnan");
        moderator.setPassword("123456");

        Flow flow1 = new Flow();
        flow1.setCreator(moderator);
        flow1.setDescription("Curso de Android Nativo");
        flow1.setName("Android Flow Course");

        Mission mission1 = new Mission();
        mission1.setName("Hello World!");
        mission1.setDescription("Abra um novo projeto de Android e execute um Hello World e mande um print");
        mission1.setCreator(moderator);
        flow1.getMissionList().add(mission1);

        User user = new User();
        user.setEmail("BryansFury@gmail.com");
        user.setFullname("Bryans Fury");
        user.setNickname("Bryans");
        user.setPassword("11235");
        user.getFlowList().add(flow1);

        userList.add(user);
        userList.add(moderator);

        flowList.add(flow1);

        missionList.add(mission1);

    }

}
