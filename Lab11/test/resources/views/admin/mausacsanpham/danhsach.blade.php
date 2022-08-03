@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Màu sắc sản phẩm
                    <small>Danh sách</small>
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
                        <th>Tên</th>                     
                        <th>Thao tác</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach($mausacsanpham as $m)
                    <tr class="odd gradeX" align="center">
                        <td>{{ $m->id }}</td>
                        <td>{{ $m->ten }}</td>                       
                        <td class="center">
                            <button class="btn btn-info btn-action"><i class="fa fa-trash-o  fa-fw"></i><a href="admin/mausacsanpham/xoa/{{ $m->id }}">Xóa</a></button><br>
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/mausacsanpham/sua/{{ $m->id }}">Sửa</a>
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

