package com.stream.app.services;

import com.stream.app.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {

    //save
    Video save(Video video, MultipartFile file);

    //get by id
    Video get(String VideoId);

    //get by title
    Video getByTitle(String title);

    //get all
    List<Video> getAll();
}
