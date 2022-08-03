@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Thể loại
                    <small>{{ $theloai->ten }}</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <div class="col-lg-7" style="padding-bottom:120px">
                @if(count($errors)>0)
                    <div class="alert alert-danger">
                        @foreach(@$errors->all() as $err)
                            {{ $err }}<br>
                        @endforeach
                    </div>
                @endif

                @if(session('thongbao'))
                    <div class="alert alert-success">
                        {{ session('thongbao') }}
                    </div>
                @endif
                
                <form action="admin/theloai/sua/{{ $theloai->id }}" method="POST" enctype="multipart/form-data">
                @CSRF
                    <div class="form-group">
                        <label>Tên thể loại</label>
                        <input class="form-control" name="ten" placeholder="Điền tên thể loại" value="{{ $theloai->ten }}" />
                    </div>
                    <div class="form-group">
                        <label>Chọn hình ảnh</label>
                        <p>
                        <img src="upload/theloai/{{ $theloai->hinhanh }}" width="300px">
                        </p>
                        <input type="file" name="hinhanh" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Ghi chú</label>
                        <input class="form-control" name="ghichu" placeholder="Nhập ghi chú" value="{{ $theloai->ghichu }}" />
                    </div>                 
                    <div class="form-group">
                        <label>Trạng thái</label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="1" checked="" type="radio">Còn
                        </label>
                        <label class="radio-inline">
                            <input name="rdoTrangThai" value="0" type="radio">Hết
                        </label> 
                    </div>
                    <button type="submit" class="btn btn-success">Sửa</button>
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