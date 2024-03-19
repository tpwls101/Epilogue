package com.epilogue.service;

import com.epilogue.domain.user.User;
import com.epilogue.dto.response.user.CustomUserDetails;
import com.epilogue.repository.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userRepository.findByUserId(userId);
        // 로그인한 사용자 검증
        if(user != null) {
            CustomUserDetails customUser = new CustomUserDetails(user);
            return customUser;
        }

        return null;
    }
}
