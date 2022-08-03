@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Sản phẩm
                    <small>Thêm</small>
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <div class="col-lg-7" style="padding-bottom:120px">
                {{-- truyen nhan dl --}}
                
                <form action="admin/sanpham/them" method="POST" enctype="multipart/form-data"> 
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
                @if(session('saifile'))
                    <div class="alert alert-danger">
                        {{ session('saifile') }}
                    </div>
                @endif
                    @CSRF 
                    <div class="form-group">
                        <label>Thể loại</label>
                        <select class="form-control" name="theloai" id="TheLoai">
                            @foreach($theloai as $tl)
                                <option value="{{ $tl->id }}">{{$tl->ten}}</option>
                            @endforeach
                        </select>
                    </div>     
                    <div class="form-group">
                        <label>Hệ điều hành</label>
                        <select class="form-control" name="hedieuhanh" id="HeDieuHanh">
                            @foreach($hedieuhanh as $h)
                                <option value="{{ $h->id }}">{{$h->ten}}</option>
                            @endforeach
                        </select>
                    </div>             
                    <div class="form-group">
                        <label>Tên sản phẩm</label>
                        <input class="form-control" name="ten" placeholder="Nhập tên thể loại" />
                    </div>     
                    <div class="form-group">
                        <label>Chon hình ảnh</label>
                        <input type="file" name="hinhanh" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label>Màn hình</label>
                        <input class="form-control" name="manhinh" placeholder="Nhập màn hình" />
                    </div> 
                    <div class="form-group">
                        <label>Camera trước</label>
                        <input class="form-control" name="camera_truoc" placeholder="Nhập camera trước" />
                    </div> 
                    <div class="form-group">
                        <label>Camera sau</label>
                        <input class="form-control" name="camera_sau" placeholder="Nhập camera sau" />
                    </div>
                    <div class="form-group">
                        <label>CPU</label>
                        <input class="form-control" name="cpu" placeholder="Nhập CPU" />
                    </div>
                    <div class="form-group">
                        <label>Dung lượng pin</label>
                        <input class="form-control" name="dungluongpin" placeholder="Nhập dung lượng pin" />
                    </div>
                    <div class="form-group">
                        <label>Trọng lượng</label>
                        <input class="form-control" name="trongluong" placeholder="Nhập trọng lượng" />
                    </div>
                    <div class="form-group">
                        <label>Độ phân giải</label>
                        <input class="form-control" name="dophangiai_manhinh" placeholder="Nhập độ phân giải màn hình" />
                    </div>
                    <div class="form-group">
                        <label>Kích thước</label>
                        <input class="form-control" name="kichthuoc" placeholder="Nhập kích thước" />
                    </div>
                    <div class="form-group">
                        <label>GPS</label>
                        <input class="form-control" name="gps" placeholder="Nhập GPS" />
                    </div>
                    <div class="form-group">
                        <label>Bluetooth</label>
                        <input class="form-control" name="bluetooth" placeholder="Nhập bluetooth" />
                    </div>
                    <div class="form-group">
                        <label>Màu sắc sản phẩm</label>
                        <select class="form-control" name="mausacsanpham" id="MauSac">
                            @foreach($mausacsanpham as $m)
                                <option value="{{ $m->id }}">{{$m->ten}}</option>
                            @endforeach
                        </select>
                    </div>   
                    <div class="form-group">
                        <label>Ram</label>
                        <select class="form-control" name="ram" id="Ram">
                            @foreach($ram as $r)
                                <option value="{{ $r->id }}">{{$r->ten}}</option>
                            @endforeach
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Bộ nhớ trong</label>
                        <select class="form-control" name="bonhotrong" id="BoNhotrong">
                            @foreach($ram as $r)
                                <option value="{{ $r->id }}">{{$r->ten}}</option>
                            @endforeach
                        </select>
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