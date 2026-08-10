package com.nexus.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
// <T>는 응답으로 어떤 데이터가 들어올지 몰라 나중에 결정하겠다는 뜻
public class ApiResponse<T> {

    private boolean success;
    private T data;
    private String message;

}