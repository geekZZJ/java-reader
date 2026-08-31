package com.example.reader.service;

import com.example.reader.entity.Evaluation;

import java.util.List;

public interface EvaluationService {
    public List<Evaluation> selectByBookId(Long bookId);
}
