@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">User
                    <small>Thêm</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <div class="col-lg-7" style="padding-bottom:120px">
                {{-- truyen nhan dl --}}
                
                <form action="admin/user/them" method="POST" enctype="multipart/form-data"> 
                    {{-- <input type="hidden" name="_token" value="{{csrf_token()}}" /> --}}
                @if(count($errors)>0)   
                    <div class="alert alert-danger">
                        @foreach($errors->all() as $err)
                            {{ $err }}<br>
                        @endforeach
                    </div>            
                @endif
                
                @if(session('thongbao'))
                    <div class="alert alert-success">
                        {{ session('thongbao') }}
                    </div>
                @endif
                    @CSRF                  
                    <div class="form-group">
                        <label>Họ tên</label>
                        <input class="form-control" name="name" placeholder="Nhập tên người dùng" />
                    </div>     
                    <div class="form-group">
                        <label>Chon avatar</label>
                        <input type="file" name="avatar" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Gioi tính</label>
                        <label class="radio-inline">
                            <input name="rdoSex" value="1" checked="" type="radio">Nam
                        </label>
                        <label class="radio-inline">
                            <input name="rdoSex" value="2" type="radio">Nữ
                        </label> 
                        <label class="radio-inline">
                            <input name="rdoSex" value="0" type="radio">Khác
                        </label> 
                    </div>
                    <div class="form-group">
                        <label>Email:</label>
                        <input type="email" class="form-control" name="email" placeholder="Nhập địa chỉ email" />
                    </div>      
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" class="form-control" name="password" placeholder="Nhập password" />
                    </div>      
                    <div class="form-group">
                        <label>Nhập lại password:</label>
                        <input type="password" class="form-control" name="passwordAgain" placeholder="Nhập lại mật khẩu" />
                    </div>       
                    <div class="form-group">
                        <label>Chọn quyền</label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="1" checked="" type="radio">Admin
                        </label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="2" type="radio">Employee
                        </label> 
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="0" type="radio">Khách hàng
                        </label> 
                    </div>
                    <div class="form-group">
                        <label>Địa chỉ:</label>
                        <input class="form-control" name="diachi" placeholder="Nhập địa chỉ đang sinh sống" />
                    </div> 
                    <div class="form-group">
                        <label>Số điện thoại:</label>
                        <input class="form-control" name="phone" placeholder="Nhập số điện thoại" />
                    </div> 
                    <button type="submit" class="btn btn-success">Thêm</button>
                    <button type="reset" class="btn btn-default">Làm mới</button>
                </form>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /#page-wrapper -->
@endsection