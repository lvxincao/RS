package com.example.rs.service.impl;

import com.example.rs.dao.MovieDetailDao;
import com.example.rs.domain.MovieDetail;
import com.example.rs.util.CalcIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rs.service.MovieDetailService;

import java.util.List;
import java.util.Map;

@Service
public class MovieDetailServiceImpl implements MovieDetailService {

    @Autowired
    private MovieDetailDao movieDetailDao;

    @Override
    public List<MovieDetail> pageSelectIdwithName(int pageNum, int pageSize) {
        return movieDetailDao.pageSelectIdwithName(CalcIndex.parseIndex(pageNum, pageSize), pageSize);
    }

    @Override
    public List<MovieDetail> findConditions(Map<String, Object> map) {
        return movieDetailDao.selectConditions(map);
    }

}
