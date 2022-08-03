@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Slide
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
                    @foreach($ram as $r)
                    <tr class="odd gradeX" align="center">
                        <td>{{ $r->id }}</td>
                        <td>{{ $r->ten }}</td>                       
                        <td class="center">
                            <button class="btn btn-info btn-action"><i class="fa fa-trash-o  fa-fw"></i><a href="admin/ram/xoa/{{ $r->id }}">Xóa</a></button><br>
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/ram/sua/{{ $r->id }}">Sửa</a>
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

