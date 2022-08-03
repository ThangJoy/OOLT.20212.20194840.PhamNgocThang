@extends('viewer.layout.index')
@section('title')
  <title>Đặt mua hàng</title>
@endsection
@section('content')
<script type="text/javascript">
    function updateCart(qty,rowId){
        $.get(
				'{{asset('cart/update')}}',
				{qty:qty,rowId:rowId},
				function(){
					location.reload();
				}
				);

    }
</script>
<!--breadcrumbs area start-->
<div class="breadcrumbs_area mt-45">
        <div class="container">   
            <div class="row">
                <div class="col-12">
                    <div class="breadcrumb_content">
                        <ul>
                            <li><a href="{{route('trang-chu')}}">Trang chủ</a></li>
                            <li>Giỏ hàng</li>
                        </ul>
                    </div>
                    <div>
                        <span style="font-size: 20px; color:blue"><a href="{{route('trang-chu')}}"> Quay lại</a></span>
                    </div>
                </div>
            </div>
        </div>         
    </div>
    <!--breadcrumbs area end-->
    
     <!--shopping cart area start -->
    <div class="shopping_cart_area mt-45">
        <div class="container">  
            <form action="#"> 
                <div class="row">
                    <div class="col-12">
                        <div class="table_desc">
                            <div class="cart_page table-responsive">
                                <table>
                            <thead>
                                <tr>
                                    <th class="product_remove">Xóa</th>
                                    <th class="product_thumb">Hình ảnh</th>
                                    <th class="product_name">Sản phẩm</th>
                                    <th class="product-price">Giá</th>
                                    <th class="product_quantity">Số lượng</th>
                                    <th class="product_total">Thành tiền</th>
                                </tr>
                            </thead>
                            <tbody>
                                @foreach($data as $dt)
                                <tr>
                                   <td class="product_remove"><a href="{{route('delete-cart',$dt->rowId)}}"><i class="fa fa-trash-o"></i></a></td>
                                    <td class="product_thumb"><a href="#"><img src="upload/sanpham/{{$dt->options->img}}" alt=""></a></td>
                                    <td class="product_name"><a href="#">{{$dt->name}}</a></td>
                                    <td class="product-price">{{number_format($dt->price)}}<sup>đ</sup></td>
                                    <td class="product_quantity"><label>Số lượng</label> <input min="1" max="100" value="{{$dt->qty}}" type="number" onchange="updateCart(this.value,'{{$dt->rowId}}')"></td>
                                    <td class="product_total">{{number_format($dt->price*$dt->qty)}}<sup>đ</sup></td>


                                </tr>
                                @endforeach
                            </tbody>
                        </table>   
                            </div>  
                            <!-- <div class="cart_submit">
                                <button type="submit">Cập nhật giỏ hàng</button>
                            </div>       -->
                        </div>
                     </div>
                 </div>
                 <!--coupon code area start-->
                <div class="coupon_area">
                    <div class="row">
                        
                        <div class="col-lg-12 col-md-12">
                            <div class="coupon_code right">
                                <h3>Tổng thanh toán</h3>
                                <div class="coupon_inner">
                                   
                                 

                                   <div class="cart_subtotal">
                                       <p>Tổng tiền</p>
                                       <p class="cart_amount">{{$total}}<sup>đ</sup></p>
                                   </div>
                                   <div class="checkout_btn">
                                       <a href="{{route('dat-hang')}}">Mua đơn hàng này</a>
                                   </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--coupon code area end-->
            </form> 
        </div>     
    </div>
     <!--shopping cart area end -->
@endsection