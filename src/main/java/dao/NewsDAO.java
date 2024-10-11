package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.News;
import util.Jdbc;

public class NewsDAO {
    
    public List<News> getAllNews() {
        List<News> newsList = new ArrayList<>();
        String query = "SELECT * FROM News";
        
        try (Connection connection = Jdbc.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet rs = statement.executeQuery()) {
            
            while (rs.next()) {
                News news = new News(
                    rs.getString("Id"),
                    rs.getString("Title"),
                    rs.getString("Content"),
                    rs.getString("Image"),
                    rs.getString("PostedDate"),
                    rs.getString("Author"),
                    rs.getInt("ViewCount"),
                    rs.getString("CategoryId"),
                    rs.getBoolean("Home")
                );
                newsList.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newsList;
    }

    public void addNews(News news) {
        String query = "INSERT INTO News (Id, Title, Content, Image, PostedDate, Author, ViewCount, CategoryId, Home) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = Jdbc.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, news.getId());
            statement.setString(2, news.getTitle());
            statement.setString(3, news.getContent());
            statement.setString(4, news.getImage());
            statement.setString(5, news.getPostedDate());
            statement.setString(6, news.getAuthor());
            statement.setInt(7, news.getViewCount());
            statement.setString(8, news.getCategoryId());
            statement.setBoolean(9, news.isHome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public List<News> getNewsByCategory(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logPageEvent(String string) {
		// TODO Auto-generated method stub
		
	}

	public void incrementViewCount(String id) {
		// TODO Auto-generated method stub
		
	}
    
    // Implement các phương thức updateNews, deleteNews...
}
