@extends('viewer.layout.index')
@section('title')
  <title>Trang chủ</title>
@endsection
@section('content')
 <div class="contact_area" style="margin-top: 50px">
        <div class="container">   
            <div class="row">
                <div class="col-lg-6 col-md-12">
                   <div class="contact_message content">
                        <h3>Liên hệ với chúng tôi</h3>    
                         <p>Chúng tôi luôn sẵn sàng giải đáp mọi thắc mắc của khách hàng nếu có nhu cầu gì cần giúp đỡ xin để lại lời nhắn ở form bên dưới , chúng tôi sẽ giải đáp một cách sớm nhất.</p>
                        <ul>
                            <li><i class="fa fa-fax"></i>  Địa chỉ : Minh Khai - Từ Liêm - Hà Nội</li>
                            <li><i class="fa fa-phone"></i> <a href="#">Nhom1@gmail.com</a></li>
                            <li><i class="fa fa-envelope-o"></i> 0(1234) 567 890</li>
                        </ul>             
                    </div> 
                </div>
                <div class="col-lg-6 col-md-12">
                   <div class="contact_message form">
                        <h3>Liên hệ với chúng tôi nếu có thắc mắc cần giải đáp</h3>   
                        <form id="contact-form" method="POST"  action="https://demo.hasthemes.com/rusu-preview/rusu/assets/mail.php">
                            <p>  
                               <label> Họ tên (*)</label>
                                <input name="name" placeholder="Họ tên *" type="text"> 
                            </p>
                            <p>       
                               <label>  Email (*)</label>
                                <input name="email" placeholder="Email *" type="email">
                            </p>
                               
                            <div class="contact_textarea">
                                <label>  Tin nhắn</label>
                                <textarea placeholder="Tin nhắn *" name="message"  class="form-control2" ></textarea>     
                            </div>   
                            <button class="btn btn-success" type="submit"> Gửi</button>  
                            <p class="form-messege"></p>
                        </form> 

                    </div> 
                </div>
            </div>
        </div>    
    </div>
          
@endsection