package org.rpc.docker;

public class Vo<Value> {
    Integer status;
    Value data;
    String description;

    public Vo(Value data) {
        this.data = data;
        status = 0;
        description = "访问成功";
    }

    public Vo(Integer status, Value data, String description) {
        this.status = status;
        this.data = data;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Value getData() {
        return data;
    }

    public void setData(Value data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
