package com.chat.base.bean.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class BaseResult implements Serializable {

    protected Status status;

    protected String message;

    public enum Status {
        success, failure, unauthorized;
    }

    public BaseResult(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public static BaseResult success(String message) {
        return new BaseResult(Status.success, message);
    }

    public static BaseResult failure(String message) {
        return new BaseResult(Status.failure, message);
    }
}
