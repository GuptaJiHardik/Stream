package com.stream.app.services;

import com.stream.app.entities.Video;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class VideoServiceImpl implements  VideoService{
    @Override
    public Video save(Video video, MultipartFile file) {
        try {
            //original filename
            String filename = file.getOriginalFilename();
            String contentType = file.getContentType();
            InputStream inputStream = file.getInputStream();

            //folder path :create


            //folder path with filename

            //copy file to the folder

            //video meta data

            //metadatasave

        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Video get(String VideoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return List.of();
    }
}
