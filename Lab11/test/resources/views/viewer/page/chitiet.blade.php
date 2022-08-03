@extends('viewer.layout.index')
@section('title')
  <title>Trang chủ</title>
@endsection
@section('content')

<!--breadcrumbs area start-->
<div class="breadcrumbs_area mt-45">
        <div class="container">   
            <div class="row">
                <div class="col-12">
                    <div class="breadcrumb_content">
                        <ul>
                            <li><a href="index.html">home</a></li>
                            <li>product details</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>         
    </div>
    <!--breadcrumbs area end-->
    
    <!--product details start-->
    <div class="product_details mt-45 mb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="product-details-tab">
                        <div id="img-1" class="zoomWrapper single-zoom">
                            <a href="upload/sanpham/{{$sanpham->hinhanh}}">
                                <img id="zoom1" src="upload/sanpham/{{$sanpham->hinhanh}}" data-zoom-image="upload/sanpham/{{$sanpham->hinhanh}}" alt="big-1">
                            </a>
                        </div>
                        
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="product_d_right">
                       <form action="#">
                           
                            <h3><a href="#">{{$sanpham->ten}}</a></h3>
                            <div class="product_nav">
                                <ul>
                                    <li class="prev"><a href="product-details.html"><i class="fa fa-angle-left"></i></a></li>
                                    <li class="next"><a href="variable-product.html"><i class="fa fa-angle-right"></i></a></li>
                                </ul>
                            </div>
                            
                            <div class="price_box">
                                @if($sanpham->gia_sale !=0)
                                <span class="current_price">{{number_format($sanpham->gia_sale)}}<sup>đ</sup></span>
                                <span class="old_price">{{number_format($sanpham->gia)}}<sup>đ</sup></span>
                                @else
                                <span class="current_price">{{number_format($sanpham->gia)}}<sup>đ</sup></span>
                                @endif
                            </div>
                            <div class="product_desc">
                                <p>CPU : {{$sanpham->cpu}}</p>
                                <p>RAM : {{$sanpham->Ram->ten}}</p>
                                <p>Màn hình : {{$sanpham->manhinh}}</p>
                            </div>
                            
                            <div class="product_variant quantity">
                                
                                    <a href="{{route('add-cart',$sanpham->id)}}" style="text-align:center;">Thêm vào giỏ hàng</a>  
                                
                            </div>
                            
                            
                        </form>
                        <div class="priduct_social">
                            <ul>
                                <li><a class="facebook" href="#" title="facebook"><i class="fa fa-facebook"></i> Like</a></li>           
                                <li><a class="twitter" href="#" title="twitter"><i class="fa fa-twitter"></i> tweet</a></li>           
                                <li><a class="pinterest" href="#" title="pinterest"><i class="fa fa-pinterest"></i> save</a></li>           
                                <li><a class="google-plus" href="#" title="google +"><i class="fa fa-google-plus"></i> share</a></li>        
                                <li><a class="linkedin" href="#" title="linkedin"><i class="fa fa-linkedin"></i> linked</a></li>        
                            </ul>      
                        </div>

                    </div>
                </div>
            </div>
        </div>    
    </div>
    <!--product details end-->
    
    <!--product info start-->
    <div class="product_d_info mb-45">
        <div class="container">   
            <div class="row">
                <div class="col-12">
                    <div class="product_d_inner">   
                        <div class="product_info_button">    
                            <ul class="nav" role="tablist">
                                <li >
                                    <a class="active" data-toggle="tab" href="#info" role="tab" aria-controls="info" aria-selected="false">Mô tả</a>
                                </li>
                                <li>
                                     <a data-toggle="tab" href="#sheet" role="tab" aria-controls="sheet" aria-selected="false">Thông số chi tiết</a>
                                </li>
                                <li>
                                   <a data-toggle="tab" href="#reviews" role="tab" aria-controls="reviews" aria-selected="false">Bình luận</a>
                                </li>
                            </ul>
                        </div>
                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="info" role="tabpanel" >
                                <div class="product_info_content">
                                    <p>Sản phẩm của chúng tôi là những sản phẩm sẽ làm cho quý khách cảm tháy hài lòng. Đây là những sản phẩm tốt nhất có trên thị trường hiện nay, những dòng sản phẩm điện thoại mới cực kì bắt mắt và sang trọng.</p>
                                    <p>Nếu trong quá trình sử dụng là 2 tuần mà có gặp vấn đề lỗi kĩ thuật thì quý khách có thể đổi sản phẩm mới hoặc chúng tôi có thể hoàn lại tiền cho quý khách.</p>
                                </div>    
                            </div>
                            <div class="tab-pane fade" id="sheet" role="tabpanel" >
                                <div class="product_d_table">
                                   <form action="#">
                                        <table>
                                            <tbody>
                                                <tr>
                                                    <td class="first_child">Tên : </td>
                                                    <td>{{$sanpham->ten}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Màn hình</td>
                                                    <td>{{$sanpham->ten}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Camera trước</td>
                                                    <td>{{$sanpham->camera_truoc}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Camera sau</td>
                                                    <td>{{$sanpham->camera_sau}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">CPU</td>
                                                    <td>{{$sanpham->cpu}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Dung lượng Pin</td>
                                                    <td>{{$sanpham->dungluongpin}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Trọng lượng</td>
                                                    <td>{{$sanpham->trongluong}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Độ phân giải màn hình</td>
                                                    <td>{{$sanpham->dophangiai_manhinh}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Kích thước</td>
                                                    <td>{{$sanpham->kichthuoc}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">GPS</td>
                                                    <td>{{$sanpham->gps}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Bluetooth</td>
                                                    <td>{{$sanpham->bluetooth}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Hãng sản xuất</td>
                                                    <td>{{$sanpham->TheLoai->ten}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Hệ điều hành</td>
                                                    <td>{{$sanpham->HeDieuHanh->ten}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Ram</td>
                                                    <td>{{$sanpham->Ram->ten}}</td>
                                                </tr>
                                                <tr>
                                                    <td class="first_child">Bộ nhớ trong</td>
                                                    <td>{{$sanpham->BoNhoTrong->ten}}</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </form>
                                </div>
                                    
                            </div>

                            <div class="tab-pane fade" id="reviews" role="tabpanel" >
                                <div class="reviews_wrapper">
                                    <h2>1 bình luận</h2>
                                    <div class="reviews_comment_box">
                                        <div class="comment_thmb">
                                            <img src="assets/img/blog/comment2.jpg" alt="">
                                        </div>
                                        <div class="comment_text">
                                            <div class="reviews_meta">
                                                
                                                <p><strong>admin </strong>- September 12, 2018</p>
                                                <span>roadthemes</span>
                                            </div>
                                        </div>
                                        
                                    </div>
                                    
                                    <div class="product_review_form">
                                        <form action="#">
                                            <div class="row">
                                                <div class="col-12">
                                                    <label for="review_comment">Bình luận của bạn </label>
                                                    <textarea name="comment" id="review_comment" ></textarea>
                                                </div> 
                                                  
                                            </div>
                                            <button type="submit">Submit</button>
                                         </form>   
                                    </div> 
                                </div>     
                            </div>
                        </div>
                    </div>     
                </div>
            </div>
        </div>    
    </div>  
    <!--product info end-->
    
    <!--product area start-->
    <section class="product_area related_products">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="section_title">
                        <h2>Sản phẩm liên quan	</h2>
                    </div>
                </div>
            </div> 
            <div class="row">
                <div class="product_carousel product_column4 owl-carousel">
                    @foreach($splqs as $sp)
                    <div class="col-lg-3">
                                <article class="single_product">
                                        <figure>
                                           <div class="product_name">
                                               <h4><a href="chitiet/{{$sp->id}}">{{$sp->ten}} - {{$sp->bonhotrong->ten}}</a></h4>
                                           </div>
                                           <div class="product_rating">
                                               
                                           </div>

                                            <div class="product_thumb">
                                                <a class="primary_img" href="chitiet/{{$sp->id}}"><img src="image/{{$sp->hinhanh}}" alt=""></a>
                                                <div class="label_product">
                                                    @if($sp->gia_sale != 0)
                                                        <span class="label_sale">Sale!</span>
                                                    @endif
                                                </div>
                                                <div class="quick_button">
                                                    <a href="#" data-toggle="modal" data-target="#modal_box"  title="Xem nhanh"> Xem nhanh</a>
                                                </div>
                                            </div>
                                            <div class="product_footer">
                                                <div class="price_box" style="text-align:center"> 
                                                    @if($sp->gia_sale != 0)
                                                        <span class="old_price">{{number_format($sp->gia)}}<sup>đ</sup></span> 
                                                        
                                                        <span class="current_price">{{number_format($sp->gia_sale)}}<sup>đ</sup></span>&nbsp
                                                    @else
                                                        <span class="current_price" >{{number_format($sp->gia)}}<sup>đ</sup></span>&nbsp
                                                    @endif
                                                   
                                                </div>
                                                <div class="action_links">
                                                     <ul>
                                                        <li class="add_to_cart"><a href="{{route('add-cart',$sp->id)}}" title="Chọn mua">Thêm vào giỏ hàng</a></li>

                                                       

                                                       
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
    </section>
    <!--product area end-->
    
 

    @endsection