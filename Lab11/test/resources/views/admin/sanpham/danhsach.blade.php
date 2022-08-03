@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Sản phẩm
                    <small>danh sách</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->

            @if(session('thongbao'))
                <div class="alert alert-success">
                    {{ session('thongbao') }}
                </div>
            @endif

            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                <thead>
                    <tr align="center">
                        <th>ID</th>
                        <th>Tên thể loại</th>
                        <th>Hình ảnh</th>
                        <!-- <th>Màn hình</th> -->
                        <!-- <th>Camera trước</th> -->
                        <!-- <th>Camera sau</th> -->
                        <th>CPU</th>
                        <th>Dung lượng pin</th>
                        <th>Trọng lượng</th>
                        <!-- <th>Độ phân giải màn hình</th> -->
                        <!-- <th>Kích thước</th> -->
                        <!-- <th>GPS</th> -->
                        <!-- <th>Bluetooth</th> -->
                        <th>Hệ điều hành</th>
                        <th>Màu sắc</th>
                        <th>Ram</th>
                        <th>Trạng thái</th>
                        <th>Thao tác</th>                  
                    </tr>
                </thead>
                <tbody>
                    @foreach($sanpham as $sp)
                    <tr class="odd gradeX" align="center">
                        <td>{{ $sp->id  }}</td>
                        <td>{{ $sp->theloai->ten }}</td>
                        <td>
                        <img width="100px" height="100px" src="upload/sanpham/{{$sp->hinhanh}}">
                           </td>
                        <!-- <td>{{ $sp->manhinh }}</td> -->
                        <!-- <td>{{ $sp->camera_truoc }}</td> -->
                        <!-- <td>{{ $sp->camera_sau }}</td> -->
                        <td>{{ $sp->cpu }}</td>
                        <td>{{ $sp->dungluongpin }}</td>
                        <td>{{ $sp->trongluong }}</td>
                        <!-- <td>{{ $sp->dophangiai_manhinh }}</td> -->
                        <!-- <td>{{ $sp->kichthuoc }}</td> -->
                        <!-- <td>{{ $sp->gps }}</td> -->
                        <!-- <td>{{ $sp->bluetooth }}</td> -->
                        <td>{{ $sp->hedieuhanh->ten }}</td>
                        <td>{{ $sp->mausacsanpham->ten }}</td>
                        <td>{{ $sp->ram->ten }}</td>
                        <td>
                            @if($sp->trangthai == 1){{ "Còn" }}
                            @else {{ "Hết" }}
                            @endif
                            </td>
                        <td class="center">
                            <button class="btn btn-info btn-action">
                            <i class="fa fa-trash-o  fa-fw"></i><a href="admin/sanpham/xoa/{{$sp->id}}"> Xóa</a></button> <br>
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/sanpham/sua/{{$sp->id}}"> Sửa</a></button>                         
                            </button>                         
                        </td>
                    </tr>
                    @endforeach
                </tbody>
            </table>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /#page-wrapper -->
@endsection
