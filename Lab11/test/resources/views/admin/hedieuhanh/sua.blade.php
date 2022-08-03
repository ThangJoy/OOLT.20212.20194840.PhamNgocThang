@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Sửa
                    <small>{{ $slide->ten }}</small> 
                </h1>
            </div>
            <!-- /.col-lg-12 -->
            <div class="col-lg-7" style="padding-bottom:120px">
                <form action="admin/slide/sua/{{ $slide->id }}" method="POST" enctype="multipart/form-data">
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
                        <label>Tên slide</label>
                        <input class="form-control" name="ten" placeholder="Nhập tên slide" value="{{ $slide->ten }}" />
                    </div>
                    <div class="form-group">
                        <label>Hình ảnh</label>
                        <p>
                            <img width="500px" src="upload/slide/{{ $slide->hinh }}" alt="">
                        </p>
                        <input type="file" name="hinh" class="form-control" />
                    </div>
                    {{-- <div class="form-group">
                        <label>Nội dung</label>
                        <textarea id="demo" class="form-control ckeditor" rows="3" name="noidung"   placeholder="Nhập nội dung cho slide">
                            {{ $slide->noidung }}
                        </textarea>
                    </div> --}}
                    <div class="form-group">
                        <label>Nội dung</label>
                        <input class="form-control" name="link" placeholder="Nhập nội dung cho slide" value="{{ $slide->noidung }}" />
                    </div>
                    <div class="form-group">
                        <label>Link</label>
                        <input class="form-control" name="link" placeholder="Nhập link cho slide" value="{{ $slide->link }}" />
                    </div>

                    <button type="submit" class="btn btn-default">Sửa</button>
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

