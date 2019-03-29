package com.cc.netty.session;

import lombok.Data;

/**
 * @Author: cc
 */
@Data
public class Session {

    private String userId;

    private String userName;

    public Session(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
