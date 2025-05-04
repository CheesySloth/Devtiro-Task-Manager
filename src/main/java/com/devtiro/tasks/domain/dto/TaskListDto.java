package com.devtiro.tasks.domain.dto;

import java.util.UUID;
import com.devtiro.tasks.domain.entities.*;
import java.util.List;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> tasks) {
}