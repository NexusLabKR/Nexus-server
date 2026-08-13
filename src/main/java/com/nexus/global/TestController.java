package com.nexus.global;

import com.nexus.global.exception.CustomException;
import com.nexus.global.exception.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/error")
    public void testError() {
        throw new CustomException(ErrorCode.USER_NOT_FOUND);
    }
}
