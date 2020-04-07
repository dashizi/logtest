package com.example.log.entity;

import java.time.LocalDateTime;
public class TestGenerateMybatis {
    private Long id;

    private LocalDateTime generateDate;

    private String description;

    private Long isValid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(LocalDateTime generateDate) {
        this.generateDate = generateDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getIsValid() {
        return isValid;
    }

    public void setIsValid(Long isValid) {
        this.isValid = isValid;
    }
}