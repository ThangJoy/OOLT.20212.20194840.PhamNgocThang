<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\TheLoai;
use App\SanPham;
use App\HeDieuHanh;
use App\MauSacSanPham;
use App\Ram;
use App\BoNhoTrong;

class SanPhamController extends Controller
{
    public function getDanhSach(){
    	$sanpham= SanPham::all();
    	return view('admin.sanpham.danhsach',['sanpham'=>$sanpham]);
    }

    public function getThem(){
        $theloai = TheLoai::where('trangthai',1)->get();
        $hedieuhanh = HeDieuHanh::all();
        $mausacsanpham = MauSacSanPham::all();  
        $ram = Ram::all();  
        $bonhotrong = BoNhoTrong::all();    
    	return view('admin.sanpham.them',compact('theloai','hedieuhanh','mausacsanpham','ram','bonhotrong'));
    }

    public function postThem(Request $request){

    	$this->validate($request,[
    			'ten'=>'required|min:3|max:100',
                'theloai'=>'required',
                'hedieuhanh'=>'required',
                'mausacsanpham'=>'required',
                'ram'=>'required',
                'bonhotrong'=>'required',
                'dophangiai_manhinh'=>'required',
                'gps'=>'required',
                'cpu'=>'required',
                'dungluongpin'=>'required',
                'trongluong'=>'required',
                'bluetooth'=>'required',
                'manhinh'=>'required',
                'camera_truoc'=>'required',
                'camera_sau'=>'required',
                'kichthuoc'=>'required',
                'hinhanh'=>'required'
	    	],
	    	[
                'theloai.required'=>'Bạn chưa chọn thể loại',
                'hedieuhanh.required'=>'Bạn chưa chọn hệ điều hành',
                'mausacsanpham.required'=>'Bạn chưa chọn màu sắc sản phẩm',
                'ram.required'=>'Bạn chưa chọn ram',
                'bonhotrong.required'=>'Bạn chưa chọn bộ nhớ trong',
	    		'ten.required'=>'Bạn chưa nhập tên sản phẩm',
                'gps.required'=>'Bạn chưa nhập gps',
                'cpu.required'=>'Bạn chưa nhập cpu',
                'dungluongpin.required'=>'Bạn chưa nhập dung lượng pin',
                'bluetooth.required'=>'Bạn chưa nhập bluetooth',
                'manhinh.required'=>'Bạn chưa nhập màn hình',
                'camera_truoc.required'=>'Bạn chưa nhập camera trước',
                'trongluong.required'=>'Bạn chưa nhập trọng lượng',
                'camera_sau.required'=>'Bạn chưa nhập camera sau',
                'kichthuoc.required'=>'Bạn chưa nhập kích thước',
                'hinhanh.required'=>'Bạn chưa chọn hình ảnh',              
	    		'ten.min'=>'Tên sản phẩm phải có độ dài từ 3 đến 100 kí tự',
	    		'ten.max'=>'Tên sản phẩm phải có độ dài từ 3 đến 100 kí tự',
	    ]);

	    $sanpham = new SanPham;
	    $sanpham->ten = $request->ten;
	    // $sanpham->tenkhongdau = str_slug($request->ten,' ');
        $sanpham->id_theloai = $request->theloai;
        $sanpham->id_hedieuhanh = $request->hedieuhanh;
        $sanpham->id_mausacsanpham = $request->mausacsanpham;
        $sanpham->id_ram = $request->ram;
        $sanpham->id_bonhotrong = $request->ram;
	    $sanpham->manhinh = $request->manhinh;
        $sanpham->dungluongpin = $request->dungluongpin;
        $sanpham->dophangiai_manhinh = $request->dophangiai_manhinh;
        $sanpham->gps = $request->gps;
        $sanpham->cpu = $request->cpu;
        $sanpham->trongluong = $request->trongluong;
        $sanpham->bluetooth = $request->bluetooth;
        $sanpham->kichthuoc = $request->kichthuoc;
        $sanpham->camera_sau = $request->camera_sau;
        $sanpham->camera_truoc = $request->camera_truoc;
        if($request->hasFile('hinhanh')){
            $file = $request-> file('hinhanh');
            $duoi = $file -> getClientOriginalExtension();
            if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
                return redirect('admin/sanpham/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
            }
            // $file = $request->file('sanpham');
            $name = $file->getClientOriginalName();
            $hinh = str_random(4)."_".$name;
            while(file_exists("upload/sanpham/".$hinh)){
                $hinh = str_random(4)."_".$name;
            }
            $file->move("upload/sanpham",$hinh);
            $sanpham->hinhanh = $hinh;
        }else{
            $sanpham->hinhanh = "";
        }
	    $sanpham->trangthai = 1;
	    $sanpham->save();

	    return redirect('admin/sanpham/them')->with('thongbao','Bạn đã thêm thành công ');
    }

    public function getSua($id){
        $sanpham = SanPham::find($id);
        $theloai = TheLoai::where('trangthai',1)->get();
        $hedieuhanh = HeDieuHanh::all();
        $mausacsanpham = MauSacSanPham::all();  
        $ram = Ram::all();  
        $bonhotrong = BoNhoTrong::all(); 
       
    	return view('admin.sanpham.sua',compact('theloai','sanpham','hedieuhanh','mausacsanpham','ram','bonhotrong'));
    }

    public function postSua(Request $request,$id){
        $this->validate($request,[
            'ten'=>'required|min:3|max:100',
            'theloai'=>'required',
            'hedieuhanh'=>'required',
            'mausacsanpham'=>'required',
            'ram'=>'required',
            'bonhotrong'=>'required',
            'dophangiai_manhinh'=>'required',
            'gps'=>'required',
            'cpu'=>'required',
            'dungluongpin'=>'required',
            'trongluong'=>'required',
            'bluetooth'=>'required',
            'manhinh'=>'required',
            'camera_truoc'=>'required',
            'camera_sau'=>'required',
            'kichthuoc'=>'required',
            'hinhanh'=>'required'
        ],
        [
            'theloai.required'=>'Bạn chưa chọn thể loại',
            'hedieuhanh.required'=>'Bạn chưa chọn hệ điều hành',
            'mausacsanpham.required'=>'Bạn chưa chọn màu sắc sản phẩm',
            'ram.required'=>'Bạn chưa chọn ram',
            'bonhotrong.required'=>'Bạn chưa chọn bộ nhớ trong',
            'ten.required'=>'Bạn chưa nhập tên sản phẩm',
            'gps.required'=>'Bạn chưa nhập gps',
            'cpu.required'=>'Bạn chưa nhập cpu',
            'dungluongpin.required'=>'Bạn chưa nhập dung lượng pin',
            'bluetooth.required'=>'Bạn chưa nhập bluetooth',
            'manhinh.required'=>'Bạn chưa nhập màn hình',
            'camera_truoc.required'=>'Bạn chưa nhập camera trước',
            'trongluong.required'=>'Bạn chưa nhập trọng lượng',
            'camera_sau.required'=>'Bạn chưa nhập camera sau',
            'kichthuoc.required'=>'Bạn chưa nhập kích thước',
            'hinhanh.required'=>'Bạn chưa chọn hình ảnh',              
            // ss
            'ten.min'=>'Tên sản phẩm phải có độ dài từ 3 đến 100 kí tự',
            'ten.max'=>'Tên sản phẩm phải có độ dài từ 3 đến 100 kí tự',
    ]);

    $sanpham = SanPham::find($id);
    $sanpham->ten = $request->ten;
    // $sanpham->tenkhongdau = str_slug($request->ten,' ');
    $sanpham->id_theloai = $request->theloai;
    $sanpham->id_hedieuhanh = $request->hedieuhanh;
    $sanpham->id_mausacsanpham = $request->mausacsanpham;
    $sanpham->id_ram = $request->ram;
    $sanpham->id_bonhotrong = $request->ram;
    $sanpham->manhinh = $request->manhinh;
    $sanpham->dungluongpin = $request->dungluongpin;
    $sanpham->dophangiai_manhinh = $request->dophangiai_manhinh;
    $sanpham->gps = $request->gps;
    $sanpham->cpu = $request->cpu;
    $sanpham->trongluong = $request->trongluong;
    $sanpham->bluetooth = $request->bluetooth;
    $sanpham->kichthuoc = $request->kichthuoc;
    $sanpham->camera_sau = $request->camera_sau;
    $sanpham->camera_truoc = $request->camera_truoc;
    if($request->hasFile('hinhanh')){
        $file = $request-> file('hinhanh');
        $duoi = $file -> getClientOriginalExtension();
        if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
            return redirect('admin/sanpham/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
        }
        // $file = $request->file('sanpham');
        $name = $file->getClientOriginalName();
        $hinh = str_random(4)."_".$name;
        while(file_exists("upload/sanpham/".$hinh)){
            $hinh = str_random(4)."_".$name;
        }
        $file->move("upload/sanpham",$hinh);
        $sanpham->hinhanh = $hinh;
    }else{
        $sanpham->hinhanh = "";
    }
    
    $sanpham->save();
  
    return redirect('admin/sanpham/sua/'.$id)->with('thongbao','Bạn đã sửa thành công ');
    }

    public function getXoa($id){
    	$sanpham = SanPham::find($id);

    	$sanpham->trangthai = 0;
    	$sanpham->save();

    	return redirect('admin/sanpham/danhsach')->with('thongbao','Bạn đã xóa thành công');
    }
    
    // public function getXoa($id){
    // 	$theloai = TheLoai::find($id);
    	
    // 	$theloai->delete();

    // 	return redirect('admin/theloai/danhsach')->with('thongbao','Bạn đã xóa thành công');
    // }
}
