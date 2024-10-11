package model;

import java.util.ArrayList;
import java.util.List;

public class NewsData {
    public static List<News> getNewsList() {
        List<News> newsList = new ArrayList<>();

        // Thêm các bản tin vào danh sách
        newsList.add(new News("1", "Tin Tức Văn Hóa", "Nội dung tin tức văn hóa...", "image1.jpg", "2024-10-01", "Tác giả 1", 0, "VH", true));
        newsList.add(new News("2", "Tin Tức Chính Trị", "Nội dung tin tức chính trị...", "image2.jpg", "2024-10-02", "Tác giả 2", 0, "CT", true));
        newsList.add(new News("3", "Tin Tức Thể Thao", "Nội dung tin tức thể thao...", "image3.jpg", "2024-10-03", "Tác giả 3", 0, "TT", true));
        newsList.add(new News("4", "Tin Tức Giải Trí", "Nội dung tin tức giải trí...", "image4.jpg", "2024-10-04", "Tác giả 4", 0, "GT", true));
        newsList.add(new News("5", "Tin Tức Pháp Luật", "Nội dung tin tức pháp luật...", "image5.jpg", "2024-10-05", "Tác giả 5", 0, "PL", true));

        return newsList;
    }
}

