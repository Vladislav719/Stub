package com.github.vladislav719.service;

import com.github.vladislav719.model.News;

/**
 * Created by Владислав on 03.04.2015.
 */
public interface NewsService {

    public Iterable<News> getAll();

    public News getNewsById(Long id);

    public boolean deleteNews(Long id);


}
