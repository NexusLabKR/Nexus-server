package com.nexus.global.exception;

import com.nexus.global.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 모든 controller에서 발생한 예외를 여기서 감시
@RestControllerAdvice
public class GlobalExceptionHandler {

    // CustomException이 발생하면 이 메서드 실행
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponse<Void>> handleCustomException(CustomException e) {

        ErrorCode errorCode = e.getErrorCode();

        ApiResponse<Void> response = ApiResponse.failure(errorCode.getMessage());

        return ResponseEntity
                .status(errorCode.getStatus())
                .body(response);
    }

}
