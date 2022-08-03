@extends('viewer.layout.index')
@section('title')
  <title>Đăng kí</title>
@endsection
@section('content')
    <div class="customer_login mt-45">
        <div class="container">
            <div class="row">
               <!--login area start-->
                <div class="col-lg-6 col-md-6">
                    <div class="account_form login">
                        
                        <form action="{{route('post-dk')}}" method="post" enctype="multipart/form-data">
                        <h3>Đăng kí</h3>
                            @CSRF
                            <p>
                            @if(count($errors) > 0)
                            <div class="alert alert-danger">
                                @foreach($errors->all() as $err)
                                    {{ $err }}<br>
                                @endforeach
                            </div>
                            @endif
                            @if(session('thongbao'))      
                            <div class="alert alert-success">                
                                    {{session('thongbao')}}
                            </div>
                            
                            @endif
                            </p>
                             <p>   
                                <label>Họ tên<span>*</span></label>
                                <input type="text" name="hoten">
                             </p>   
                             <p>   
                                <label>Email<span>*</span></label>
                                <input type="email" name="mail">
                             </p> 
                             <p>   
                                <label>Mật khẩu<span>*</span></label>
                                <input type="password" name="pass">
                             </p> 
                             <p>   
                                <label>Xác nhận mật khẩu<span>*</span></label>
                                <input type="password" name="passagain">
                             </p> 
                             <p>   
                                <label>SĐT<span>*</span></label>
                                <input type="text" name="sdt">
                             </p>
                             <p>   
                                <label>Địa chỉ<span>*</span></label>
                                <input type="text" name="diachi">
                             </p>
                             <p>   
                                <label>Ảnh đại diện<span>*</span></label>
                                <input type="file" name="anh">
                             </p>
                            <div class="login_submit">
                              
                               
                                <button type="submit">Đăng kí</button>
                                
                            </div>

                        </form>
                     </div>    
                </div>
                <!--login area start-->

                
            </div>
        </div>    
    </div>
@endsection