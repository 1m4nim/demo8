package com.example.demo8.form;

import java.time.LocalDate;
import jakarta.validation.constraints.*;

public class ReviewRegistForm {
    @NotNull(message = "入力してください。")
    @Min(value = 1, message = "正の整数を入力してください。")
    private Integer restaurantId;

    @Size(min = 4, max = 16, message = "4文字から16文字で指定してください。")
    private String userId;

    @Past(message = "今日以前の日付を入力してください。")
    private LocalDate visitDate;

    @NotNull(message = "入力してください。")
    @Min(value = 1, message = "1-5で指定してください。")
    @Max(value = 5, message = "1-5で指定してください。")
    private Integer rating;

    @Size(min = 1, max = 128, message = "1文字から128文字で指定してください。")
    private String comment;

    // Getter & Setter (これがないとThymeleafでエラーになります)
    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}