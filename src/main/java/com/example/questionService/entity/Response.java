package com.example.questionService.entity;

import java.util.Objects;

public class Response {
    private Integer id;
    private String response;


    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", response='" + response + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response1 = (Response) o;
        return Objects.equals(id, response1.id) &&
                Objects.equals(response, response1.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, response);
    }
}
