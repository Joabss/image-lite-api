package io.github.joabss.imageliteapi.service;

import io.github.joabss.imageliteapi.domain.entity.Image;
import io.github.joabss.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService  {
    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}
