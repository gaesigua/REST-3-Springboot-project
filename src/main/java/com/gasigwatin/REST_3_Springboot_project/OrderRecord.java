package com.gasigwatin.REST_3_Springboot_project;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {
}
