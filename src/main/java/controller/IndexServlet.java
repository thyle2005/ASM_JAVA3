package controller;

import dao.NewsDAO;
import model.News;
import model.NewsData;
import util.Jdbc;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    private List<News> newsList;

    @Override
    public void init() throws ServletException {
        // Lấy danh sách tin tức từ NewsData
        newsList = NewsData.getNewsList();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String categoryId = request.getParameter("categoryId");
        List<News> filteredNewsList;

        if (categoryId != null && !categoryId.isEmpty()) {
            // Nếu có categoryId, tìm kiếm các tin theo loại tin
            filteredNewsList = newsList.stream()
                .filter(news -> news.getCategoryId().equals(categoryId))
                .toList();
        } else {
            // Nếu không có categoryId, hiển thị tất cả tin tức
            filteredNewsList = newsList;
        }

        // Đặt danh sách tin vào request và chuyển hướng đến trang JSP để hiển thị
        request.setAttribute("newsList", filteredNewsList);
        request.getRequestDispatcher("ASM1/views/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String image = request.getParameter("image");
        String postedDate = request.getParameter("postedDate");
        String author = request.getParameter("author");
        String categoryId = request.getParameter("categoryId");
        boolean home = Boolean.parseBoolean(request.getParameter("home"));

        News news = new News(id, title, content, image, postedDate, author, 0, categoryId, home);
        // Bạn có thể thêm logic để thêm vào danh sách hoặc cơ sở dữ liệu ở đây

        response.sendRedirect("news");
    }
    
}
