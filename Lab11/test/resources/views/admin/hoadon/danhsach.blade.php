@extends('admin.layout.index')

@section('content')
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Hóa đơn
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
                        <th>STT</th>
                        <th>Người mua</th>
                        <th>Email</th>
                        <th>Tổng tiền</th>
                        <th>Ngày mua</th>
                        <th>SDT</th>
                        <th>Địa chỉ</th>
                        <th>Trạng thái</th> 
                        <th>Thao tác</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach($hoadon as $hd)
                    <tr class="odd gradeX" align="center">
                        <td>{{$hd->id}}</td>
                        <td>{{ $hd->ten }}</td>
                        <td>
                        {{ $hd->User->email }}
                        </td>
                        <td>{{ $hd->tongtien }}</td>
                        <td>{{ $hd->ngaymua }}</td>
                        <td>{{ $hd->sdt }}</td>
                        <td>{{ $hd->dia_chi }}</td>
                    
                        <td>
                        @if($hd->trangthai ==0)
                            <span style="color:red">Chưa thanh toán</span>

                            @else
                            <span style="color:green">Đã thanh toán</span>
                            @endif
                        </td>
                        <td class="center">
                            <button class="btn btn-info btn-action">
                            <i class="fa fa-trash-o  fa-fw"></i><a href="admin/hoadon/xoa/{{ $hd->id }}">Thanh toán</a></button></td>
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
