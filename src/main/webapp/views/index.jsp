<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chủ Báo</title>
<link rel="stylesheet" type="text/css" href="/ASM1/views/style.css">
</head>
<body>
	<!-- Menu -->
	<nav>
		<div class="menuleft">
			<ul>
			<c:url var ="home" value="/home"/>
            <li><a href="${home}/index">Trang chủ</a></li>
            <li><a href="${home}/vanhoa">Văn Hóa</a></li>
            <li><a href="${home}/chinhtri">Chính trị</a></li>
            <li><a href="${home}/phapluat">Pháp luật</a></li>
            <li><a href="${home}/thethao">Thể thao</a></li>
            <li><a href="${home}/giaitri">Giải trí</a></li>
			</ul>
			<jsp:include page ="${view}"/>
		</div>
		<div class="menuright">
			<ul>
				<li><a href="">Đăng nhập</a></li>
				<li><a href="">Đăng ký</a></li>
			</ul>
		</div>
	</nav>

	<!-- Phần chính -->
	<section>
		<article>
			<div class="contents">
				<div class="content-box">
					<h2>Các Tin Tức Văn Hóa Nổi Bật</h2>
					<div>
						<img src="/ASM1/image/hinhvanhoa.jpg" alt="" width="300px"
							align="left">
						<h2>Thông tin mới nhất về đề xuất lập thanh tra di sản văn
							hóa</h2>
						<p style="font-size: 24px">Ủy ban Văn hóa, Giáo dục đề nghị
							Chính phủ có ý kiến chính thức về việc sẽ quy định thanh tra di
							sản văn hóa ở dự Luật Di sản văn hóa sửa đổi hay sửa nghị định
							hướng dẫn...</p>
					</div>
					<div>
						<img src="/ASM1/image/hinh2.webp" alt="" width="300px"
							align="left">
						<h2>Thông tin mới nhất về đề xuất lập thanh tra di sản văn
							hóa</h2>
						<p style="font-size: 24px">Ủy ban Văn hóa, Giáo dục đề nghị
							Chính phủ có ý kiến chính thức về việc sẽ quy định thanh tra di
							sản văn hóa ở dự Luật Di sản văn hóa sửa đổi hay sửa nghị định
							hướng dẫn...</p>

					</div>
					<div>
						<img src="/ASM1/image/hinh3.webp" alt="" width="300px"
							align="left">
						<h2>Thông tin mới nhất về đề xuất lập thanh tra di sản văn
							hóa</h2>
						<p style="font-size: 24px">Ủy ban Văn hóa, Giáo dục đề nghị
							Chính phủ có ý kiến chính thức về việc sẽ quy định thanh tra di
							sản văn hóa ở dự Luật Di sản văn hóa sửa đổi hay sửa nghị định
							hướng dẫn...</p>

					</div>
					<div>
						<img src="/ASM1/image/hinh4.webp" alt="" width="300px"
							align="left">
						<h2>Thông tin mới nhất về đề xuất lập thanh tra di sản văn
							hóa</h2>
						<p style="font-size: 24px">Ủy ban Văn hóa, Giáo dục đề nghị
							Chính phủ có ý kiến chính thức về việc sẽ quy định thanh tra di
							sản văn hóa ở dự Luật Di sản văn hóa sửa đổi hay sửa nghị định
							hướng dẫn...</p>

					</div>
					<hr>
					<h2>Tin Tức Mới Nhất</h2>
					<div class="hinh-container">
						<div class="hinh">
							<img src="/ASM1/image/hinh4.webp" alt="Hình 1" width="150px">
							<p>Liệu bạn có biết...?</p>
						</div>
						<div class="hinh">
							<img src="/ASM1/image/hinh3.webp" alt="Hình 2" width="150px">
							<p>Theo thông tin thống kê...</p>
						</div>
						<div class="hinh">
							<img src="/ASM1/image/hinh4.webp" alt="Hình 3" width="150px">
							<p>Thật bất ngờ...</p>
						</div>
					</div>
				</div>
		</article>

		<!-- Sidebar -->
		<aside>
			<div class="contents">
				<div class="content-box">
					<h3>5 Bản Tin Hot Nhất</h3>
					<!-- Hiển thị 5 bản tin hot nhất -->
					<ul>
						<c:forEach var="popularNews" items="${popularNewsList}">
							<li><a href="newsDetail?id=${popularNews.id}">${popularNews.title}</a></li>
						</c:forEach>
					</ul>
					<h3>5 Bản Tin Mới Nhất</h3>
					<!-- Hiển thị 5 bản tin mới nhất trong sidebar -->
					<ul>
						<c:forEach var="latestNews" items="${latestNewsList}">
							<li><a href="newsDetail?id=${latestNews.id}">${latestNews.title}</a></li>
						</c:forEach>
					</ul>
					<h3>5 Bản Tin Đã Xem</h3>
					<!-- Hiển thị 5 bản tin đã xem -->
					<ul>
						<c:forEach var="viewedNews" items="${viewedNewsList}">
							<li><a href="newsDetail?id=${viewedNews.id}">${viewedNews.title}</a></li>
						</c:forEach>
					</ul>
					<h3>Newsletter</h3>
					<!-- Form đăng ký nhận tin -->
					<form action="subscribeNewsletter" method="post">
						<input type="email" name="email" placeholder="Nhập email của bạn">
						<input type="submit" value="Đăng ký">
					</form>
				</div>
			</div>
		</aside>
	</section>


</body>
</html>
