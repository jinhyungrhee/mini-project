package com.example.mini.service;

import com.example.mini.dao.CommentDao;
import com.example.mini.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentDao dao;

    @Override
    public List<Map<String, Object>> getCommentList(int seq) {
        return dao.getCommentList(seq);
    }

    @Override
    public void insertComment(CommentDto dto) {
        dao.insertComment(dto);
    }

}
