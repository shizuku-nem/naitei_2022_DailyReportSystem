<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Navbar Start -->
<nav
	class="navbar navbar-expand bg-secondary navbar-dark sticky-top px-4 py-0">
	<a href="index.html" class="navbar-brand d-flex d-lg-none me-4">
		<h2 class="text-primary mb-0">
			<i class="fa fa-user-edit"></i>
		</h2>
	</a> <a href="#" class="sidebar-toggler flex-shrink-0"> <i
		class="fa fa-bars"></i>
	</a>

	<div class="navbar-nav align-items-center ms-auto">
		<div class="d-none d-md-flex ms-4 text-center">
	</div>

		<div class="nav-item dropdown">
			<a href="#" class="nav-link dropdown-toggle"
				data-bs-toggle="dropdown"> <i class="fa fa-bell me-lg-2"></i> <span
				class="d-none d-lg-inline-flex">Thông báo</span>
			</a>
			<div
				class="dropdown-menu dropdown-menu-end bg-secondary border-0 rounded-0 rounded-bottom m-0">
				<a href="Task?method=taskById" class="dropdown-item">
					<h6 class="fw-normal mb-0">Công việc đã được duyệt</h6> 
					<small>15 phút trước</small>
				</a>

			</div>
		</div>
		
	</div>
</nav>
