package com.devtiro.tasks.domain.dto;

import java.util.UUID;
import java.time.LocalDateTime;
import com.devtiro.tasks.domain.entities.*;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status) {
}
