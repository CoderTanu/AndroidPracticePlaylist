package com.example.day24recyclebin;

public class News {

    private String newContent;
    private int newsImage;
    private String newsData;

    public News(String newContent, int newsImage, String newsData) {
        this.newContent = newContent;
        this.newsImage = newsImage;
        this.newsData = newsData;
    }


    public String getNewContent() {
        return newContent;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public String getNewsData() {
        return newsData;
    }


    @Override
    public String toString() {
        return "News{" +
                "newContent='" + newContent + '\'' +
                ", newsImage=" + newsImage +
                ", newsData='" + newsData + '\'' +
                '}';
    }
}
