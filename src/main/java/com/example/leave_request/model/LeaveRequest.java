package com.example.leave_request.model;

import java.time.LocalDate;

public record LeaveRequest(
    LocalDate startDate,
    LocalDate endDate,
    String reason
){

    public LeaveRequest{
        if (startDate == null || endDate == null){
            throw new IllegalArgumentException("開始日と終了日は必須です");
        }
        if(endDate.isBefore(startDate)){
            throw new IllegalArgumentException("終了日は開始日以降にしてください");
        }
        if(reason == null || reason.isBlank()){
            throw new IllegalArgumentException("申請理由は必須です");
        }
    }
}