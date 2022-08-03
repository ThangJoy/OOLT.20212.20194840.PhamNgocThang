@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">User
                    <small>{{$user->name}}</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <div class="col-lg-7" style="padding-bottom:120px">
                <form action="admin/user/sua/{{$user->id}}" method="POST" enctype="multipart/form-data">
                    @if(count($errors)>0)   
                    <div class="alert alert-danger">
                        @foreach($errors->all() as $err)
                            {{ $err }}<br>
                        @endforeach
                    </div>            
                    @endif
                    
                    @if(session('thongbao'))
                        <div class="alert alert-success">
                            {{ session('thongbao')}}
                        </div>
                    @endif

                    @CSRF                  
                    <div class="form-group">
                        <label>Họ tên</label>
                        <input class="form-control" name="name" placeholder="Nhập tên người dùng" value="{{$user->name}}" />
                    </div>     
                    <div class="form-group">
                        <label>Chọn avatar</label>
                        <p>
                        <img src="upload/avatar/{{ $user->avatar }}" width="300px">
                        </p>
                        <input type="file" name="avatar" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Giới tính</label>
                        <label class="radio-inline">
                            <input name="rdoSex" value="1" checked=""
                            @if($user->sex == 1)
                                {{"checked"}}
                            @endif  
                            type="radio">Nam
                        </label>
                        <label class="radio-inline">
                            <input name="rdoSex" value="2"
                            @if($user->sex == 2)
                                {{"checked"}}
                            @endif
                            type="radio">Nữ
                        </label> 
                        <label class="radio-inline">
                            <input name="rdoSex" value="0"
                            @if($user->sex == 0)
                                {{"checked"}}
                            @endif
                            type="radio">Khác
                        </label> 
                    </div>
                    <div class="form-group">
                        <label>Email:</label>
                        <input type="email" class="form-control" name="email" placeholder="Nhập địa chỉ email" value="{{$user->email}}" readonly="" />
                    </div>      
                    <div class="form-group">
                        <label>Đổi mật khẩu</label>
                        <input type="password" class="form-control" name="password" placeholder="Nhập password"
                        />
                    </div>      
                    <div class="form-group">
                        <label>Nhập lại mật khẩu:</label>
                        <input type="password" class="form-control" name="passwordAgain" placeholder="Nhập lại mật khẩu" />
                    </div>       
                    <div class="form-group">
                        <label>Chọn quyền</label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="1" checked=""
                            @if($user->role == 1)
                                {{"checked"}}
                            @endif  
                            type="radio">Admin
                        </label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="2"
                            @if($user->role == 2)
                                {{"checked"}}
                            @endif
                            type="radio">Employee
                        </label> 
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="0"
                            @if($user->role == 0)
                                {{"checked"}}
                            @endif
                            type="radio">Khách hàng
                        </label> 
                    </div>
                    <div class="form-group">
                        <label>Địa chỉ</label>
                        <input type="text" class="form-control" name="diachi" placeholder="Nhập địa chỉ"
                         value="{{ $user->diachi }}" />
                    </div>      
                    <div class="form-group">
                        <label>Số điện thoại:</label>
                        <input type="numeric" class="form-control" name="phone" placeholder="Nhập số điện thoại" value="{{ $user->phone }}" />
                    </div>       
                    <button type="submit" class="btn btn-success">Sửa</button>
                    <button type="reset" class="btn btn-default">Làm mới</button>
                <form>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /#page-wrapper -->

@endsection

