package com.dilget.imageboard_backend.Services;

import com.dilget.imageboard_backend.Entities.ImageEntity;
import com.dilget.imageboard_backend.Repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository;

    public ArrayList<ImageEntity> getAllImages() {
        return (ArrayList<ImageEntity>) imageRepository.findAll();
    }

    public ImageEntity getImageById(Long id) {
        return imageRepository.findById(id).get();
    }

    public ImageEntity saveImage(MultipartFile file) throws IOException {
        ImageEntity image = new ImageEntity();
        image.setName(file.getOriginalFilename());
        image.setType(file.getContentType());
        image.setData(file.getBytes());
        return imageRepository.save(image);
    }

    public boolean deleteImage(Long id) throws Exception {
        try {
            imageRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
