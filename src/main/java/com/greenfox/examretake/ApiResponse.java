package com.greenfox.examretake;

import java.util.List;

public class ApiResponse {

    String result;
    List<Clothing> clothes;

    public ApiResponse() {
    }

    public ApiResponse(List<Clothing> clothes) {
        this.result = "ok";
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Clothing> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothing> clothes) {
        this.clothes = clothes;
    }
}



