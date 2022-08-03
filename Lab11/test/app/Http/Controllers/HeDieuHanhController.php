<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\HeDieuHanh;

class HeDieuHanhController extends Controller
{
    public function getDanhSach(){
    	$hedieuhanh = HeDieuHanh::orderBy('id','DESC')->get();
        return view('admin.hedieuhanh.danhsach',['hedieuhanh'=>$hedieuhanh]);
    }

    public function getThem(){
    	return view('admin.hedieuhanh.them');
    }

    public function postThem(Request $request){

    	$this->validate($request,[
                'ten'=>'required'
	    	],
	    	[
                'ten.required'=>'Bạn chưa nhập tên ram'                
	    ]);

	    $hedieuhanh = new HeDieuHanh;
	    $hedieuhanh->ten = $request->ten;
	    $hedieuhanh->save();

	    return redirect('admin/hedieuhanh/them')->with('thongbao','Bạn đã thêm thành công! ');
    }

    public function getSua($id){
    	$hedieuhanh = HeDieuHanh::find($id);
    	return view('admin/hedieuhanh/sua',['hedieuhanh'=>$hedieuhanh]);
    }

    public function postSua(Request $request,$id){
    	$hedieuhanh = HeDieuHanh::find($id);
    	$this->validate($request,[
                'ten'=>'required'              
            ],
            [
                'ten.required'=>'Bạn chưa nhập tên slide'                
        ]);
      
        $hedieuhanh->ten = $request->ten;                
        $hedieuhanh->save();

        return redirect('admin/hedieuhanh/sua/'.$id)->with('thongbao','Sửa thành công! ');
    }

    
    public function getXoa($id){
    	$hedieuhanh = HeDieuHanh::find($id);
    	
    	$hedieuhanh->delete();

    	return redirect('admin/hedieuhanh/danhsach')->with('thongbao','Xóa thành công');
    }
}
