package com.mangxiao.sample.nacos.config.configuration;

import com.mangxiao.sample.nacos.config.model.User;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "user")
public class UserConfig {
    private int age;

    private String name;

    private String hr;

    private Map<String, Object> map;

    private List<User> users;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    @Override
    public String toString() {
        return "UserConfig{" + "age=" + age + ", name='" + name + '\'' + ", map=" + map
                + ", hr='" + hr + '\'' + ", users=" + users + '}';
    }
}
