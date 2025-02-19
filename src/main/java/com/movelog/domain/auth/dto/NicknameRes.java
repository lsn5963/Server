package com.movelog.domain.auth.dto;

import lombok.Builder;

@Builder
public record NicknameRes(
        String nickname,
        Long userid,
        boolean isRegistered
) {
}
