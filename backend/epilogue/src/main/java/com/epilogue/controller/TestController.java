package com.epilogue.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test Controller", description = "배포 테스트용 API")
public class TestController {

    @GetMapping("/api/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("프론트 백엔드 연결 테스트 중! 자동 배포 찐!! 완료!!!", HttpStatus.OK);
    }
    
    @GetMapping("/home")
    public ResponseEntity<String> test2() {
        return new ResponseEntity<>("redirect-uri 테스트", HttpStatus.OK);
    }

}
