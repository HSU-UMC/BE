package hsu.umc.server.converter;

import hsu.umc.server.entity.User;
import hsu.umc.server.web.dto.UserResponseDto;

public class UserConverter {
    public static UserResponseDto.CreateResponseDto toLoginResponseDto(User user) {
        return UserResponseDto.CreateResponseDto.builder()
                .loginId(user.getLoginId())
                .message("로그인 성공").build();
    }
}
