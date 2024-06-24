package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Entities.ImageEntity;
import com.dilget.imageboard_backend.Services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/image")
@CrossOrigin("*")
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImageById(@PathVariable Long id) {
        ImageEntity image = imageService.getImageById(id);
        if (image != null) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + image.getName() + "\"")
                    .body(image.getData());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/upload")
    public ResponseEntity<ImageEntity> uploadImage(@RequestParam("file")MultipartFile file) throws IOException {
        ImageEntity savedImage = imageService.saveImage(file);
        return new ResponseEntity<>(savedImage, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteImage(@PathVariable Long id) {
        try {
            imageService.deleteImage(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
