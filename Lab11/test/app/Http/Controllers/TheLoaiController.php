<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Theloai;
use App\SanPham;

class TheLoaiController extends Controller
{
    public function getDanhSach(){
    	$theloai= TheLoai::all();
    	return view('admin.theloai.danhsach',['theloai'=>$theloai]);
    }

    public function getThem(){
    	return view('admin.theloai.them');
    }

    public function postThem(Request $request){

    	$this->validate($request,[
    			'ten'=>'required|min:3|max:100|unique:TheLoai,ten'
	    	],
	    	[

	    		'ten.required'=>'Bạn chưa nhập tên thể loại',
	    		'ten.unique'=>'Tên thể loại đã tồn tại',
	    		'ten.min'=>'Tên thể loại phải có độ dài từ 3 đến 100 kí tự',
	    		'ten.max'=>'Tên thể loại phải có độ dài từ 3 đến 100 kí tự',
	    ]);

	    $theloai = new TheLoai;
	    $theloai->ten = $request->ten;
	    $theloai->tenkhongdau = str_slug($request->ten,' ');
	    $theloai->ghichu = $request->ghichu;
	    $theloai->trangthai = $request->rdoTrangThai;
	    if($request->hasFile('hinhanh')){
            $file = $request-> file('hinhanh');
            $duoi = $file -> getClientOriginalExtension();
            if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
                return redirect('admin/user/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
            }
            // $file = $request->file('sanpham');
            $name = $file->getClientOriginalName();
            $hinh = str_random(4)."_".$name;
            while(file_exists("upload/theloai/".$hinh)){
                $hinh = str_random(4)."_".$name;
            }
            $file->move("upload/theloai",$hinh);
            $theloai->hinhanh = $hinh;
        }else{
            $theloai->hinhanh = "";
        }
	    $theloai->save();

	    return redirect('admin/theloai/them')->with('thongbao','Thêm thành công ');
    }

    public function getSua($id){
    	$theloai = TheLoai::find($id);
    	return view('admin/theloai/sua',['theloai'=>$theloai]);
    }

    public function postSua(Request $request,$id){
    	$theloai=TheLoai::find($id);
    	$this->validate($request,[
    			'ten'=>'required|min:3|max:100|unique:TheLoai,ten'
    		],
    		[
    			'ten.required'=>'Bạn chưa nhập tên thể loại',
    			'ten.unique'=>'Tên thể loại đã tồn tại',
    			'ten.min'=>'Tên thể loại phải có độ dài từ 3 đến 100 kí tự',
	    		'ten.max'=>'Tên thể loại phải có độ dài từ 3 đến 100 kí tự',
    		]);

    	$theloai->ten = $request->ten;
    	if($request->hasFile('hinhanh')){
            $file = $request-> file('hinhanh');
            $duoi = $file -> getClientOriginalExtension();
            if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
                return redirect('admin/user/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
            }
            // $file = $request->file('sanpham');
            $name = $file->getClientOriginalName();
            $hinh = str_random(4)."_".$name;
            while(file_exists("upload/theloai/".$hinh)){
                $hinh = str_random(4)."_".$name;
            }
            $file->move("upload/theloai",$hinh);
            $theloai->hinhanh = $hinh;
        }else{
            $theloai->hinhanh = "";
        }
    	$theloai->tenkhongdau = str_slug($request->ten,' ');
    	$theloai->ghichu = $request->ghichu;
    	$theloai->trangthai = $request->rdoTrangThai;
    	$theloai->save();

    	return redirect('admin/theloai/sua/'.$id)->with('thongbao','Sửa thành công');
    }

    public function getXoa($id){
    	$theloai = TheLoai::find($id);

    	$theloai->trangthai = 0;
    	$theloai->save();

    	return redirect('admin/theloai/danhsach')->with('thongbao','Bạn đã xóa thành công');
    }
    
    // public function getXoa($id){
    // 	$theloai = TheLoai::find($id);
    	
    // 	$theloai->delete();

    // 	return redirect('admin/theloai/danhsach')->with('thongbao','Bạn đã xóa thành công');
    // }

    public function getViewerDanhSach($id){
        $dts_theloai = SanPham::where('id_theloai',$id)->where('trangthai',1)->paginate(8,['*'], 'page');
        $the_loai = TheLoai::find($id);
  
        return view('viewer.theloai.danhsach',['dts_theloai'=>$dts_theloai,'the_loai'=>$the_loai]);
    }
}
