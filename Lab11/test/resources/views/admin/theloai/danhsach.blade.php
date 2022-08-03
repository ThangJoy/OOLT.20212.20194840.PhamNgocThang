@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Thể loại
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
                        <th>Tên không dấu</th>
                        <th>Ghi chú</th>
                        <th>Trạng thái</th>
                        <th>Delete</th>
                        <th>Edit</th> 
                    </tr>
                </thead>
                <tbody>
                    @foreach($theloai as $tl)
                    <tr class="odd gradeX" align="center">
                        <td>{{ $tl->id }}</td>
                        <td>{{ $tl->ten }}</td>
                        <td>
                        <img width="100px" height="100px" src="upload/theloai/{{$tl->hinhanh}}">
                           </td>
                        <td>{{ $tl->tenkhongdau }}</td>
                        <td>{{ $tl->ghichu }}</td>
                        <td>
                            @if($tl->trangthai == 1){{ "Còn" }}
                            @else {{ "Hết" }}
                            @endif
                            </td>
                        <td class="center">
                            <button class="btn btn-info btn-action">
                            <i class="fa fa-trash-o  fa-fw"></i><a href="admin/theloai/xoa/{{ $tl->id }}"> Xóa</a></button></td>
                        <td class="center">
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/theloai/sua/{{ $tl->id }}">Sửa</a>
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
