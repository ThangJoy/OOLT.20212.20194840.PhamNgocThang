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
                                <h1>Shop Rusu <br>  2019</h1>
                               <p style="font-size: 20px">Nhân dịp kỉ niệm 2 năm thành lập Shop </p>
                                <a class="button" href="{{route('trang-chu')}}">MUA NGAY</a>
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
    <div class="product_area product_style2 mb-15">
        <div class="container">
            <div class="row">
                <div class="col-12">
                   <div class="product_header">
                        <div class="section_title">
                           <h2 style="color:red; font-size: 25px">Điện thoại mới nhất</h2>

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
                            @foreach($dts_moinhat as $dt_moinhat)
                            <div class="col-lg-3">
                                <article class="single_product">
                                        <figure>
                                           <div class="product_name">
                                               <h4><a href="chitiet/{{$dt_moinhat->id}}">{{$dt_moinhat->ten}} - {{$dt_moinhat->bonhotrong->ten}}</a></h4>
                                           </div>
                                           <div class="product_rating">
                                               
                                           </div>

                                            <div class="product_thumb">
                                                <a class="primary_img" href="chitiet/{{$dt_moinhat->id}}"><img src="image/{{$dt_moinhat->hinhanh}}" alt=""></a>
                                                <div class="label_product">
                                                    @if($dt_moinhat->gia_sale != 0)
                                                        <span class="label_sale">Sale!</span>
                                                    @endif
                                                </div>
                                                <!-- <div class="quick_button">
                                                    <a href="#" data-toggle="modal" data-target="#modal_box"  title="Xem nhanh"> Xem nhanh</a>
                                                </div> -->
                                            </div>
                                            <div class="product_footer">
                                                <div class="price_box" style="text-align:center"> 
                                                    @if($dt_moinhat->gia_sale != 0)
                                                        <span class="old_price">{{number_format($dt_moinhat->gia)}}<sup>đ</sup></span> 
                                                        
                                                        <span class="current_price">{{number_format($dt_moinhat->gia_sale)}}<sup>đ</sup></span>&nbsp
                                                    @else
                                                        <span class="current_price" >{{number_format($dt_moinhat->gia)}}<sup>đ</sup></span>&nbsp
                                                    @endif
                                                   
                                                </div>
                                                <div class="action_links">
                                                     <ul>
                                                        <li class="add_to_cart"><a href="{{route('add-cart',$dt_moinhat->id)}}" title="Chọn mua">Thêm vào giỏ hàng</a></li>

                                                       

                                                       
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
    <!--product area end-->
    
    <!--product area start-->
    <div class="product_area product_style2 mb-15">
        <div class="container">
            <div class="row">
                <div class="col-12">
                   <div class="product_header">
                        <div class="section_title">
                           <h2 style="color:red; font-size: 25px">Điện thoại bán chạy nhất</h2>

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
                            @foreach($dts_banchay as $dt_banchay)
                            <div class="col-lg-3">
                                <article class="single_product">
                                        <figure>
                                           <div class="product_name">
                                               <h4><a href="chitiet/{{$dt_banchay->SanPham->id}}">{{$dt_banchay->SanPham->ten}} - {{$dt_banchay->SanPham->bonhotrong->ten}}</a></h4>
                                           </div>
                                           <div class="product_rating">
                                               
                                           </div>

                                            <div class="product_thumb">
                                                <a class="primary_img" href="chitiet/{{$dt_banchay->SanPham->id}}"><img src="image/{{$dt_banchay->SanPham->hinhanh}}" alt=""></a>
                                                <div class="label_product">
                                                    @if($dt_banchay->SanPham->gia_sale != 0)
                                                        <span class="label_sale">Sale!</span>
                                                    @endif
                                                </div>
                                                <!-- <div class="quick_button">
                                                    <a href="#" data-toggle="modal" data-target="#modal_box"  title="Xem nhanh"> Xem nhanh</a>
                                                </div> -->
                                            </div>
                                            <div class="product_footer">
                                                <div class="price_box" style="text-align:center"> 
                                                    @if($dt_banchay->SanPham->gia_sale != 0)
                                                        <span class="old_price">{{number_format($dt_banchay->SanPham->gia)}}<sup>đ</sup></span> 
                                                        
                                                        <span class="current_price">{{number_format($dt_banchay->SanPham->gia_sale)}}<sup>đ</sup></span>&nbsp
                                                    @else
                                                        <span class="current_price" >{{number_format($dt_banchay->SanPham->gia)}}<sup>đ</sup></span>&nbsp
                                                    @endif
                                                   
                                                </div>
                                                <div class="action_links">
                                                     <ul>
                                                        <li class="add_to_cart"><a href="{{route('add-cart',$dt_banchay->SanPham->id)}}" title="Chọn mua">Thêm vào giỏ hàng</a></li>

                                                       

                                                       
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
    <!--product area end-->
    
    <!--product area start-->
    <div class="product_area product_style2 mb-10">
        <div class="container">
            <div class="row">
                <div class="col-12">
                   <div class="product_header">
                        <div class="section_title">
                           <h2 style="font-size: 25px">Điện thoại Pin khủng</h2>
                        </div>
                        <div class="product_tab_btn">
                            
                        </div>
                    </div>
                </div>
            </div> 
            <div class="tab-content">
                <div class="tab-pane fade show active" id="Tablet3" role="tabpanel">
                    <div class="row">
                        <div class="product_carousel product_style product_column4 owl-carousel">
                        @foreach($dts_pinkhung as $dt_pinkhung)
                            <div class="col-lg-3">
                                <article class="single_product">
                                        <figure>
                                           <div class="product_name">
                                               <h4><a href="product-details.html">{{$dt_pinkhung->ten}} - {{$dt_pinkhung->bonhotrong->ten}}</a></h4>
                                           </div>
                                           <div class="product_rating">
                                               
                                           </div>

                                            <div class="product_thumb">
                                                <a class="primary_img" href="product-details.html"><img src="image/{{$dt_pinkhung->hinhanh}}" alt=""></a>
                                                <div class="label_product">
                                                    <span class="label_sale">Sale!</span>
                                                </div>
                                                <!-- <div class="quick_button">
                                                    <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Xem nhanh</a>
                                                </div> -->
                                            </div>
                                            <div class="product_footer">
                                                <div class="price_box" style="text-align:center"> 
                                                    
                                                    @if($dt_pinkhung->gia_sale != 0)
                                                        <span class="old_price">{{number_format($dt_pinkhung->gia)}}<sup>đ</sup></span> 
                                                        
                                                        <span class="current_price">{{number_format($dt_pinkhung->gia_sale)}}<sup>đ</sup></span>&nbsp
                                                    @else
                                                        <span class="current_price">{{number_format($dt_pinkhung->gia)}}<sup>đ</sup></span>&nbsp
                                                    @endif
                                                </div>
                                                <div class="action_links">
                                                     <ul>
                                                        <li class="add_to_cart"><a href="{{route('add-cart',$dt_pinkhung->id)}}" title="Chọn mua">Thêm vào giỏ hàng</a></li>

                                                        

                                                       
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
                <div class="tab-pane fade" id="Game3" role="tabpanel">
                    <div class="row">
                        <div class="product_carousel product_style product_column4 owl-carousel">
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Consequuntur magni risus tincidunt convallis scelerisque</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product6.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$56.00</span> 
                                                <span class="current_price">$52.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product7.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$82.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>  
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product10.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$75.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div> 
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product2.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$80.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product1.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$76.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article> 
                            </div>
                             
                        </div>   
                    </div>    
                </div>
                <div class="tab-pane fade" id="tabs2" role="tabpanel">
                    <div class="row">
                        <div class="product_carousel product_style product_column4 owl-carousel">
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product7.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$82.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>  
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product10.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$75.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Consequuntur magni risus tincidunt convallis scelerisque</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product6.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$56.00</span> 
                                                <span class="current_price">$52.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div> 
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product2.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$80.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product1.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$76.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article> 
                            </div>
                             
                        </div>   
                    </div>    
                </div>
                <div class="tab-pane fade" id="Watches3" role="tabpanel">
                    <div class="row">
                        <div class="product_carousel product_style product_column4 owl-carousel">
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product1.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$76.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article> 
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Consequuntur magni risus tincidunt convallis scelerisque</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product6.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$56.00</span> 
                                                <span class="current_price">$52.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                             <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product10.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$75.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div> 
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Officiis debitis varius risus dignissim massa quis</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product2.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$80.00</span> 
                                                <span class="current_price">$70.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>   
                            </div>
                            <div class="col-lg-3">
                                <article class="single_product">
                                    <figure>
                                       <div class="product_name">
                                           <h4><a href="product-details.html">Itaque earum velit elementum mollis volutpat metus</a></h4>
                                       </div>
                                       <div class="product_rating">
                                           <ul>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                               <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                           </ul>
                                       </div>

                                        <div class="product_thumb">
                                            <a class="primary_img" href="product-details.html"><img src="asset/assets/img/product/product7.jpg" alt=""></a>
                                            <div class="label_product">
                                                <span class="label_sale">Sale!</span>
                                            </div>
                                            <div class="quick_button">
                                                <a href="#" data-toggle="modal" data-target="#modal_box"  title="quick view"> Quick View</a>
                                            </div>
                                        </div>
                                        <div class="product_footer">
                                            <div class="price_box"> 
                                                <span class="old_price">$82.00</span> 
                                                <span class="current_price">$72.00</span>
                                            </div>
                                            <div class="action_links">
                                                 <ul>
                                                    <li class="add_to_cart"><a href="cart.html" title="Add to cart">Add to cart</a></li>

                                                    <li class="wishlist"><a href="wishlist.html"  title="Add to Wishlist"><i class="ion-android-favorite-outline"></i></a></li>

                                                    <li class="compare"><a href="#" title="Add to Compare"><i class="ion-shuffle"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </figure>
                                </article>  
                            </div>
                        </div>   
                    </div>    
                </div>
            </div> 
        </div>
    </div>
    <!--product area end-->
    

    <!--shipping area start-->
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
    