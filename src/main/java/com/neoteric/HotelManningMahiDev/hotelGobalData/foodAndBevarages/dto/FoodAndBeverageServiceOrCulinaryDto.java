package com.neoteric.HotelManningMahiDev.hotelGobalData.foodAndBevarages.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class FoodAndBeverageServiceOrCulinaryDto {

    private List<Map<String,Integer>> numberOfOutlets = new ArrayList<>();
    private List<Map<String,Integer>> LevelOrBanquetAndMeetingArea= new ArrayList<>();
    private List<Map<String,Integer>> numberOfSeating= new ArrayList<>();
    private List<Map<String,Integer>> projectedSeating= new ArrayList<>();
    private List<Map<String,Integer>> numberOProjectedSeating= new ArrayList<>();
    private List<Map<String,Integer>> numberOfProjectedDailyCovers= new ArrayList<>();
    private List<Map<String,Integer>> numberOfStations= new ArrayList<>();
    private List<Map<String,Integer>> numberOfHostessStations= new ArrayList<>();
    private List<Map<String,Integer>> numberOfShifts= new ArrayList<>();
    private List<Map<String,Integer>> percentageOfOccupiedRoomsOrderingIRD= new ArrayList<>();
    private List<Map<String,Integer>> numberOfMealPeriods= new ArrayList<>();
    private List<Map<String,Integer>> numberOfEventsSpaces= new ArrayList<>();

}
