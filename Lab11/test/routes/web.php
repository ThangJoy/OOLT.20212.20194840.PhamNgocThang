<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('login','UserController@getDangNhap');
Route::post('login','UserController@postDangNhap')->name('post-login');
Route::get('logout','UserController@getDangXuat')->name('logout');


//,'middleware'=>'adminLogin'
Route::get('loaisanpham/{id_theloai}','AjaxController@getLoaiSanPham'); 

Route::group(['prefix'=>'admin'],function(){	
	Route::group(['prefix'=>'theloai'],function(){
		// admin/theloai/danhsach
		Route::get('danhsach','TheLoaiController@getDanhSach')->name('quantri');

		Route::get('xoa/{id}','TheLoaiController@getXoa');

		Route::get('sua/{id}','TheLoaiController@getSua');
		Route::post('sua/{id}','TheLoaiController@postSua');

		Route::get('them','TheLoaiController@getThem');
		Route::post('them','TheLoaiController@postThem');
	});

	

	Route::group(['prefix'=>'sanpham'],function(){
		// admin/sanpham/danhsach
		Route::get('danhsach','SanPhamController@getDanhSach');

		Route::get('sua/{id}','SanPhamController@getSua');
		Route::post('sua/{id}','SanPhamController@postSua');

		Route::get('them','SanPhamController@getThem');
		Route::post('them','SanPhamController@postThem');

		Route::get('xoa/{id}','SanPhamController@getXoa');	
	});

	Route::group(['prefix'=>'hoadon'],function(){
		// admin/sanpham/danhsach
		Route::get('danhsach','CartController@getDanhSachHD')->name('quan-tri');

		// Route::get('sua/{id}','HoaDonController@getSua');
		// Route::post('sua/{id}','HoaDonController@postSua');

		Route::get('xoa/{id}','CartController@getXoa');	
	});


	Route::group(['prefix'=>'comment'],function(){
		// admin/sanpham/danhsach

		Route::get('xoa/{id}','CommentController@getXoa');	
	});
	// Route::group(['prefix'=>'ajax'],function(){
	// 		Route::get('ajax/loaisanpham/{id_theloai}','AjaxController@getLoaiSanPham'); 	
	// });

	Route::group(['prefix'=>'user'],function(){ 
		// admin/user/danhsach
		Route::get('danhsach','UserController@getDanhSach');

		Route::get('sua/{id}','UserController@getSua');
		Route::post('sua/{id}','UserController@postSua');


		Route::get('them','UserController@getThem');
		Route::post('them','UserController@postThem');

		Route::get('xoa/{id}','UserController@getXoa');	
	});

	Route::group(['prefix'=>'slide'],function(){
		// admin/slide/danhsach
		Route::get('danhsach','SlideController@getDanhSach');
		
		Route::get('sua/{id}','SlideController@getSua');
		Route::post('sua/{id}','SlideController@postSua');


		Route::get('them','SlideController@getThem');
		Route::post('them','SlideController@postThem');

		Route::get('xoa/{id}','SlideController@getXoa');	
	});
	Route::group(['prefix'=>'ram'],function(){
		// admin/ram/danhsach
		Route::get('danhsach','RamController@getDanhSach');
		
		Route::get('sua/{id}','RamController@getSua');
		Route::post('sua/{id}','RamController@postSua');


		Route::get('them','RamController@getThem');
		Route::post('them','RamController@postThem');

		Route::get('xoa/{id}','RamController@getXoa');	
	});

	Route::group(['prefix'=>'hedieuhanh'],function(){
		// admin/ram/danhsach
		Route::get('danhsach','HeDieuHanhController@getDanhSach');
		
		Route::get('sua/{id}','HeDieuHanhController@getSua');
		Route::post('sua/{id}','HeDieuHanhController@postSua');


		Route::get('them','HeDieuHanhController@getThem');
		Route::post('them','HeDieuHanhController@postThem');

		Route::get('xoa/{id}','HeDieuHanhController@getXoa');	
	});

	Route::group(['prefix'=>'mausacsanpham'],function(){
		// admin/ram/danhsach
		Route::get('danhsach','MauSacSanPhamController@getDanhSach');
		
		Route::get('sua/{id}','MauSacSanPhamController@getSua');
		Route::post('sua/{id}','MauSacSanPhamController@postSua');


		Route::get('them','MauSacSanPhamController@getThem');
		Route::post('them','MauSacSanPhamController@postThem');

		Route::get('xoa/{id}','MauSacSanPhamController@getXoa');	
	});
});


Route::get('trangchu','PageController@getTrangChu')->name('trang-chu');

Route::get('theloai/{id}','TheLoaiController@getViewerDanhSach');

Route::get('chitiet/{id}','PageController@getChiTiet');

Route::group(['prefix'=>'cart'],function(){
	Route::get('add/{id}','CartController@getAddCart')->name('add-cart');

	Route::get('delete/{id}','CartController@getDeleteCart')->name('delete-cart');

	Route::get('show','CartController@getShowCart')->name('show-cart');

	

	Route::get('update','CartController@getUpdateCart');
});

Route::group(['prefix'=>'dathang'],function(){
	Route::get('dathang','CartController@getDatHang')->name('dat-hang');

	Route::post('dathang','CartController@postDatHang')->name('post-dh');
});

Route::get('doimatkhau','UserController@getDMK')->name('get-doi');

Route::post('doimat','UserController@postDMK')->name('post-dmk');

Route::get('logout','UserController@getDangXuat');

Route::get('dangki','UserController@getDangKi')->name('get-dk');

Route::post("dangkimoi",'UserController@postDangKi')->name('post-dk');

Route::get('timkiem','PageController@getTim')->name('tk');

Route::get('contact','PageController@getContact')->name('contact');
Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');
