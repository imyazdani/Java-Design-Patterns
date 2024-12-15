package org.example.structural.proxy;

import java.util.Objects;

public class ImageDto {
    private long id;
    private String fileName;

    public ImageDto(long id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageDto imageDto = (ImageDto) o;
        return Objects.equals(id, imageDto.id) && Objects.equals(fileName, imageDto.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName);
    }
}
