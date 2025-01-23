package com.finalexample.finaldemo.service.image;

import com.finalexample.finaldemo.dto.ImageDto;
import com.finalexample.finaldemo.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
