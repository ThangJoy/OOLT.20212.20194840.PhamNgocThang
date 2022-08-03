<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\MauSacSanPham;

class MauSacSanPhamController extends Controller
{
    public function getDanhSach(){
    	$mausacsanpham = MauSacSanPham::orderBy('id','DESC')->get();
        return view('admin.mausacsanpham.danhsach',['mausacsanpham'=>$mausacsanpham]);
    }

    public function getThem(){
    	return view('admin.mausacsanpham.them');
    }

    public function postThem(Request $request){

    	$this->validate($request,[
                'ten'=>'required'
	    	],
	    	[
                'ten.required'=>'Bạn chưa nhập tên ram'                
	    ]);

	    $mausacsanpham = new MauSacSanPham;
	    $mausacsanpham->ten = $request->ten;
	    $mausacsanpham->save();

	    return redirect('admin/mausacsanpham/them')->with('thongbao','Bạn đã thêm thành công! ');
    }

    public function getSua($id){
    	$mausacsanpham = MauSacSanPham::find($id);
    	return view('admin/mausacsanpham/sua',['mausacsanpham'=>$mausacsanpham]);
    }

    public function postSua(Request $request,$id){
    	$mausacsanpham = MauSacSanPham::find($id);
    	$this->validate($request,[
                'ten'=>'required'              
            ],
            [
                'ten.required'=>'Bạn chưa nhập tên slide'                
        ]);
      
        $mausacsanpham->ten = $request->ten;                
        $mausacsanpham->save();

        return redirect('admin/mausacsanpham/sua/'.$id)->with('thongbao','Sửa thành công! ');
    }

    
    public function getXoa($id){
    	$mausacsanpham = MauSacSanPham::find($id);
    	
    	$mausacsanpham->delete();

    	return redirect('admin/mausacsanpham/danhsach')->with('thongbao','Xóa thành công');
    }
}
