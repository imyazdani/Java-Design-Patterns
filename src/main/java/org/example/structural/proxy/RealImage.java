package org.example.structural.proxy;

public class RealImage implements Image{
    @Override
    public ImageDto loadImage(String fileName) {
        System.out.println("Loading image from RealImage: " + fileName);
        return new ImageDto(1, fileName);
    }
}
