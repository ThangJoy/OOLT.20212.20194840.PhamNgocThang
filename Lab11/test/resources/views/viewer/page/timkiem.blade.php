@extends('viewer.layout.index')
@section('title')
  <title>Trang chủ</title>
@endsection
@section('content')
<!--slider area start-->
   
    <!--slider area end-->
    
    <!--banner area start-->
    <div class="banner_area mb-45">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <figure class="single_banner">
                        <div class="banner_thumb">
                            <a href="shop.html"><img src="asset/assets/img/bg/banner6.jpg" alt=""></a>
                        </div>
                    </figure>
                </div>
                <div class="col-lg-6 col-md-6">
                    <figure class="single_banner">
                        <div class="banner_thumb">
                            <a href="shop.html"><img src="asset/assets/img/bg/banner7.jpg" alt=""></a>
                        </div>
                    </figure>
                </div>
            </div>
        </div>
    </div>
    <!--banner area end-->
    
    <!--product area start-->
    <div class="product_area product_style2 mb-15">
        <div class="container">
            <div class="row">
                <div class="col-12">
                   <div class="product_header">
                        <div class="section_title">
                           <h2>Tìm thấy {{count($sptks)}} sản phẩm <span style="color:red;">"{{$name}}"</span></h2>

                        </div>
                        <div class="product_tab_btn">
                            
                        </div>
                    </div>
                </div>
            </div> 
            <div class="tab-content">
                <div class="tab-pane fade show active" id="Video" role="tabpanel">
                    <div class="row">
                        <div class="product_carousel product_style product_column4 owl-carousel">
                            @foreach($sptks as $sptk)
                            <div class="col-lg-3">
                                <article class="single_product">
                                        <figure>
                                           <div class="product_name">
                                               <h4><a href="chitiet/{{$sptk->id}}">{{$sptk->ten}} - {{$sptk->bonhotrong->ten}}</a></h4>
                                           </div>
                                           <div class="product_rating">
                                               
                                           </div>

                                            <div class="product_thumb">
                                                <a class="primary_img" href="chitiet/{{$sptk->id}}"><img src="image/{{$sptk->hinhanh}}" alt=""></a>
                                                <div class="label_product">
                                                    @if($sptk->gia_sale != 0)
                                                        <span class="label_sale">Sale!</span>
                                                    @endif
                                                </div>
                                                <!-- <div class="quick_button">
                                                    <a href="#" data-toggle="modal" data-target="#modal_box"  title="Xem nhanh"> Xem nhanh</a>
                                                </div> -->
                                            </div>
                                            <div class="product_footer">
                                                <div class="price_box" style="text-align:center"> 
                                                    @if($sptk->gia_sale != 0)
                                                        <span class="old_price">{{number_format($sptk->gia)}}<sup>đ</sup></span> 
                                                        
                                                        <span class="current_price">{{number_format($sptk->gia_sale)}}<sup>đ</sup></span>&nbsp
                                                    @else
                                                        <span class="current_price" >{{number_format($sptk->gia)}}<sup>đ</sup></span>&nbsp
                                                    @endif
                                                   
                                                </div>
                                                <div class="action_links">
                                                     <ul>
                                                        <li class="add_to_cart"><a href="{{route('add-cart',$sptk->id)}}" title="Chọn mua">Thêm vào giỏ hàng</a></li>

                                                       

                                                       
                                                    </ul>
                                                </div>
                                            </div>
                                        </figure>
                                    </article>   
                            </div>
                            @endforeach

                        </div> 
                    </div>   
                </div>
                
            </div> 
              
        </div>
    </div>
    <div class="shipping_area shipping_two mb-50 mt-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping1.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Miễn phí vận chuyển</h4>
                            <p>Giảm 40% cho hóa đơn có giá trị trên 20 triệu đồng</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping2.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Hỗ trợ 24/7</h4>
                            <p>Hỗ trợ 24 giờ trên ngày</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping3.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Trả tiền</h4>
                            <p>Đảm bảo hoàn lại tiền nếu sản phẩm gặp vấn đề sau 7 ngày</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping4.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Giảm giá thành viên</h4>
                            <p>Giảm giá 10% cho khách hàng là thành viên trên 2 năm</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--shipping area end-->
    @endsection
    
    <!--product area end-->