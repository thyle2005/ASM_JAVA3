<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>Danh sách Bản tin</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.news-list {
	display: flex;
	flex-direction: column;
	gap: 15px;
}

.news-item {
	display: flex;
	align-items: flex-start;
	border-bottom: 1px solid #ccc;
	padding-bottom: 15px;
}

.news-image {
	width: 100px;
	height: 100px;
	background-color: #99ccff;
	display: flex;
	justify-content: center;
	align-items: center;
	color: white;
	font-size: 18px;
	margin-right: 20px;
}

.news-content {
	flex: 1;
}

.news-title {
	font-size: 18px;
	font-weight: bold;
	color: #3366cc;
	text-decoration: none;
}

.news-title:hover {
	text-decoration: underline;
}

.news-excerpt {
	font-size: 14px;
	color: #555;
}

.news-meta {
	font-size: 12px;
	color: #888;
	margin-top: 5px;
}
</style>
</head>
<body>

	<h2>Danh sách Bản tin</h2>

	<div class="news-list">
		<c:forEach var="news" items="${newsList}">
			<div class="news-item">
				<div class="news-image">Ảnh</div>
				<img> src="" </img>
				<div class="news-content">
					<a href="newsDetail.jsp?id=${news.id}" class="news-title">${news.title}</a>
					<p class="news-excerpt">${fn:substring(news.content, 0, 100)}...</p>
					<p class="news-meta">
						Ngày đăng:
						<fmt:formatDate value="${news.postedDate}" pattern="dd-MM-yyyy" />
						| Tác giả: ${news.author}
					</p>
				</div>
			</div>
		</c:forEach>
	</div>

</body>
</html>
