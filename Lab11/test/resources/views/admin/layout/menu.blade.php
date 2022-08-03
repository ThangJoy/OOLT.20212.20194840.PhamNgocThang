<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
                <!-- /input-group -->
            </li>
            <li>
                <a href=""><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-cube fa-fw"></i>Hóa đơn<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/hoadon/danhsach">Danh sách</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="admin/theloai/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Thể loại<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/theloai/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/theloai/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="admin/theloai/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Thương hiệu<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/thuonghieu/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/thuonghieu/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="admin/mausacsanpham/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Màu sắc sản phẩm<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/mausacsanpham/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/mausacsanpham/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="admin/theloai/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Hệ điều hành<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/hedieuhanh/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/hedieuhanh/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="admin/theloai/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Ram<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/ram/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/ram/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            {{-- <li>
                <a href="admin/loaisanpham/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Loại sản phẩm<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/loaisanpham/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/loaisanpham/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li> --}}
            <li>
                <a href="#"><i class="fa fa-cube fa-fw"></i>Sản phẩm<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/sanpham/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/sanpham/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
        
            <li>
                <a href="admin/slide/danhsach"><i class="fa fa-bar-chart-o fa-fw"></i>Slide<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="admin/slide/danhsach">Danh sách</a>
                    </li>
                    <li>
                        <a href="admin/slide/them">Thêm</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
           {{--  @if(Auth::check())
                @if(Auth::user()->role == 1) --}}
                    <li>
                        <a href="admin/user/danhsach"><i class="fa fa-users fa-fw"></i>User<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="admin/user/danhsach">Danh sách</a>
                            </li>
                            <li>
                                <a href="admin/user/them">Thêm</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
             {{--    @endif
            @endif --}}
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
