@extends('viewer.layout.index')
@section('title')
  <title>Trang chủ</title>
@endsection
@section('content')
<!--slider area start-->
    <section class="slider_section slider_s_two mb-50">
   
        <div class="slider_area owl-carousel">
            <div class="single_slider d-flex align-items-center" data-bgimg="asset/assets/img/slider/slider2.jpg">
                <div class="container">
                   <div class="row">
                       <div class="col-12">
                           <div class="slider_content">
                                <h1> Pendant <br> Collection 2019</h1>
                               <p>consectetur adipisicing elit. Itaque dolorem, aliquam quos. Molestias dolorum explicabo totam illum itaque sit </p>
                                <a class="button" href="shop.html">SHOPPING NOW</a>
                            </div>
                       </div>
                   </div>
               </div>
            </div>           
        </div>
        
    </section>
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
    <div class="categories_product_area mb-50">
        <div class="container">
           <div class="row">
               <div class="col-12">
                    <div class="section_title">
                       <h2>Điện thoại {{$the_loai->ten}}</h2>
                    </div>
                </div>
           </div>
            <div class="row categories_margin no-gutters">
                @foreach($dts_theloai as $dt_theloai)
                <div class="col-lg-3 col-md-6" style="padding-bottom:50px;">
                    <article class="single_categories_product column4">
                        <figure>
                            <div class="product_thumb">
                                <a class="primary_img" href="chitiet/{{$dt_theloai->id}}"><img src="image/{{$dt_theloai->hinhanh}}" alt=""></a>
                            </div>
                            <div class="categories_product_content" style="text-align:center">
                                <h4><a href="chitiet/{{$dt_theloai->id}}">{{$dt_theloai->ten}} - 
                                {{number_format($dt_theloai->gia)}}<sup>đ</sup></a></h4>
                                
                            </div>
                    
                        </figure>
                    </article> 
                </div>
                @endforeach
                <div class="row" style="text-align:center;margin-left:525px;">
                    {{$dts_theloai->links()}}
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
                            <h4>Free Delivery</h4>
                            <p>Free shipping on all order</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping2.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Online Support 24/7</h4>
                            <p>Support online 24 hours a day</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping3.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Money Return</h4>
                            <p>Back guarantee under 7 days</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <img src="asset/assets/img/about/shipping4.png" alt="">
                        </div>
                        <div class="shipping_content">
                            <h4>Member Discount</h4>
                            <p>Onevery order over $120.00</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--shipping area end-->
    @endsection
    