package com.example.rs.service;

import com.example.rs.domain.MovieDetail;

import java.util.List;
import java.util.Map;

public interface MovieDetailService {
    List<MovieDetail> findConditions(Map<String,Object> map);
}