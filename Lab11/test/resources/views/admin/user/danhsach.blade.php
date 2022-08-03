@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">User
                    <small>Danh sách</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                <thead>
                    <tr align="center">
                        <th>ID</th>
                        <th>Avatar</th>
                        <th>Name</th>
                        <th>Giới tính</th>
                        {{-- <th>Comment</th> --}}
                        <th>Email</th>
                        {{-- <th>Password</th> --}}
                        <th>Role</th>
                        <th>Địa chỉ</th>
                        <th>Số điện thoại</th>
                        <th>Thao tác</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach($user as $u)
                    <tr class="odd gradeX" align="center">
                        <td>{{ $u->id }}</td>
                        <td>
                        <img width="100px" height="100px" src="upload/avatar/{{$u->avatar}}">
                           </td>
                        <td>{{ $u->name }}</td>
                        <td>
                            @if($u->sex == 1)
                            {{ "Nam" }}
                            @elseif($u->sex == 2)
                            {{ "Nữ" }}
                            @else
                            {{ "Khác" }}
                            @endif
                        </td>
                        {{-- <td>{{ $u->comment }}</td> --}}
                        <td>{{ $u->email }}</td>
                        {{-- <td>{{ bcrypt($u->password) }}</td> --}}
                        <td>{{-- {{ $u->role }} --}}
                            @if($u->role == 1)
                            {{ "Admin" }}
                            @elseif($u->role == 2)
                            {{ "Employee" }}
                            @else
                            {{ "Khách hàng" }}
                            @endif
                        </td>
                        <td>{{ $u->diachi }} </td>
                        <td>{{ $u->phone }} </td>
                        <td class="center">
                            @if($u->role!=1)
                            <button class="btn btn-info btn-action">
                            <i class="fa fa-trash-o  fa-fw"></i><a href="admin/user/xoa/{{$u->id}}"> Xóa</a></button> <br>
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/user/sua/{{$u->id}}"> Sửa</a></button>
                            @else
                            <button class="btn btn-default btn-success">
                            <i class="fa fa-pencil fa-fw"></i> <a href="admin/user/sua/{{$u->id}}"> Sửa</a>
                            </button>
                            @endif
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
