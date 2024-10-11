package controller;

import dao.NewsDAO;
import model.News;
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

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

	private NewsDAO newsDAO;

	@Override
	public void init() throws ServletException {
		newsDAO = new NewsDAO();
		
	}

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String categoryId = request.getParameter("categoryId");
		List<News> newsList;

		if (categoryId != null && !categoryId.isEmpty()) {
			// Nếu có categoryId, tìm kiếm các tin theo loại tin
			newsList = newsDAO.getNewsByCategory(categoryId);
		} else {
			// Nếu không có categoryId, hiển thị tất cả tin tức
			newsList = newsDAO.getAllNews();
		}

		// Đặt danh sách tin vào request và chuyển hướng đến trang JSP để hiển thị
		request.setAttribute("newsList", newsList);
		request.getRequestDispatcher("ASM1/views/news.jsp").forward(request, response);

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
		newsDAO.addNews(news);

		response.sendRedirect("news");

	}


}
