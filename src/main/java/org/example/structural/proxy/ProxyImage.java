package org.example.structural.proxy;

import java.util.HashMap;

public class ProxyImage implements Image {
    private final HashMap<String, ImageDto> cacheImages;
    private final RealImage realImage;

    public ProxyImage() {
        cacheImages = new HashMap<>();
        realImage = new RealImage();
    }

    @Override
    public ImageDto loadImage(String fileName) {
        if (cacheImages.get(fileName) == null) {
            ImageDto imageDto = realImage.loadImage(fileName);
            cacheImages.put(fileName, imageDto);
            return imageDto;
        }
        System.out.println("Loading image from ProxyImage: " + fileName);
        ImageDto imageDtoProxy = cacheImages.get(fileName);

        // other check on ImageDto object
        // in this example, lets check the id of image is 1
        if (imageDtoProxy.getId() == 1){
            System.out.println("Check some conditions on ProxyImage: " + imageDtoProxy.getFileName());
        }

        return imageDtoProxy;
    }
}
