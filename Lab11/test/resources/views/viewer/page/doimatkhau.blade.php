@extends('viewer.layout.index')
@section('title')
  <title>Đặt mua hàng</title>
@endsection
@section('content')
    <div class="customer_login mt-45">
        <div class="container">
            <div class="row">
               <!--login area start-->
                <div class="col-lg-6 col-md-6">
                    <div class="account_form login">
                        <h2>{{Auth::user()->name}}</h2>
                        <form action="{{route('post-dmk')}}" method="post">
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
                                <label>Mật khẩu mới<span>*</span></label>
                                <input type="password" name="newpass">
                             </p>   
                             <p>   
                                <label>Xác nhận mật khẩu<span>*</span></label>
                                <input type="password" name="newpassagain">
                             </p>  
                            <div class="login_submit">
                              
                               
                                <button type="submit">Đổi mật khẩu</button>
                                
                            </div>

                        </form>
                     </div>    
                </div>
                <!--login area start-->

                
            </div>
        </div>    
    </div>
@endsection