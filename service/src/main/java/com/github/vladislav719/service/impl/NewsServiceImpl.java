package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.News;
import com.github.vladislav719.repository.NewsRepository;
import com.github.vladislav719.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Владислав on 03.04.2015.
 */
@Service
public class NewsServiceImpl implements NewsService {


    @Autowired
    private NewsRepository newsRepository;

    @Override
    public Iterable<News> getAll() {
        return newsRepository.findAll();
    }

    @Override
    public News getNewsById(Long id) {
        return newsRepository.findOne(id);
    }

    @Override
    public boolean deleteNews(Long id) {
        News oneNews = newsRepository.findOne(id);
        if (oneNews == null)
            return false;
        newsRepository.delete(oneNews);
        return true;
    }
}
