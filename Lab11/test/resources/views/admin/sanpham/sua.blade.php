@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Sản phẩm
                    <small>{{$sanpham->ten}}</small>
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
                
                <form action="admin/sanpham/sua/{{ $sanpham->id }}" method="POST" enctype="multipart/form-data">
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
                        <input class="form-control" value="{{$sanpham->ten}}" name="ten" placeholder="Nhập tên sản phẩm" />
                    </div>     
                    <div class="form-group">
                        <label>Chon hình ảnh</label>
                        <p><img src="upload/sanpham/{{$sanpham->hinhanh}}" width:300px; height:300px alt=""></p>
                        <input type="file" name="hinhanh" class="form-control" value="{{$sanpham->hinhanh}}"/>
                        
                    </div>
                    <div class="form-group">
                        <label>Màn hình</label>
                        <input class="form-control" value="{{$sanpham->manhinh}}" name="manhinh" placeholder="Nhập màn hình" />
                    </div> 
                    <div class="form-group">
                        <label>Camera trước</label>
                        <input class="form-control" value="{{$sanpham->camera_truoc}}" name="camera_truoc" placeholder="Nhập camera trước" />
                    </div> 
                    <div class="form-group">
                        <label>Camera sau</label>
                        <input class="form-control" value="{{$sanpham->camera_sau}}" name="camera_sau" placeholder="Nhập camera sau" />
                    </div>
                    <div class="form-group">
                        <label>CPU</label>
                        <input class="form-control" value="{{$sanpham->cpu}}" name="cpu" placeholder="Nhập CPU" />
                    </div>
                    <div class="form-group">
                        <label>Dung lượng pin</label>
                        <input class="form-control" value="{{$sanpham->dungluongpin}} " name="dungluongpin" placeholder="Nhập dung lượng pin" />
                    </div>
                    <div class="form-group">
                        <label>Trọng lượng</label>
                        <input class="form-control" value="{{$sanpham->trongluong}}" name="trongluong" placeholder="Nhập trọng lượng" />
                    </div>
                    <div class="form-group">
                        <label>Độ phân giải</label>
                        <input class="form-control" value="{{$sanpham->dophangiai_manhinh}}" name="dophangiai_manhinh" placeholder="Nhập độ phân giải màn hình" />
                    </div>
                    <div class="form-group">
                        <label>Kích thước</label>
                        <input class="form-control" value="{{$sanpham->kichthuoc}}" name="kichthuoc" placeholder="Nhập kích thước" />
                    </div>
                    <div class="form-group">
                        <label>GPS</label>
                        <input class="form-control" value="{{$sanpham->gps}}" name="gps" placeholder="Nhập GPS" />
                    </div>
                    <div class="form-group">
                        <label>Bluetooth</label>
                        <input class="form-control" value="{{$sanpham->bluetooth}}" name="bluetooth" placeholder="Nhập bluetooth" />
                    </div>
                    <div class="form-group">
                        <label>Màu sắc sản phẩm</label>
                        <select class="form-control" name="mausacsanpham" id="MauSac">
                            @foreach($mausacsanpham as $m)
                                <!-- <option value="{{ $m->id }}">{{$m->ten}}</option> -->
                                <option 
                                @if($sanpham->mausacsanpham->id == $m->id)
                                    {{ "selected" }}
                                @endif
                                value="{{$m->id}}">{{$m->ten}}</option>
                            @endforeach
                        </select>
                    </div>   
                    <div class="form-group">
                        <label>Ram</label>
                        <select class="form-control" name="ram" id="Ram">
                            @foreach($ram as $r)
                                <!-- <option value="{{ $r->id }}">{{$r->ten}}</option> -->
                                <option 
                                @if($sanpham->ram->id == $r->id)
                                    {{ "selected" }}
                                @endif
                                value="{{$r->id}}">{{$r->ten}}</option>
                            @endforeach
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Bộ nhớ trong</label>
                        <select class="form-control" name="bonhotrong" id="BoNhotrong">
                            @foreach($ram as $r)
                                <option
                                @if($sanpham->bonhotrong->id == $r->id)
                                    {{ "selected" }}
                                @endif
                                value="{{$r->id}}">{{$r->ten}}</option>
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