<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Ram;

class RamController extends Controller
{
    public function getDanhSach(){
    	$ram = Ram::orderBy('id','DESC')->get();
        return view('admin.ram.danhsach',['ram'=>$ram]);
    }

    public function getThem(){
    	return view('admin.ram.them');
    }

    public function postThem(Request $request){

    	$this->validate($request,[
                'ten'=>'required'
	    	],
	    	[
                'ten.required'=>'Bạn chưa nhập tên ram'                
	    ]);

	    $ram = new Ram;
	    $ram->ten = $request->ten;
	    $ram->save();

	    return redirect('admin/ram/them')->with('thongbao','Bạn đã thêm thành công! ');
    }

    public function getSua($id){
    	$ram = Ram::find($id);
    	return view('admin/ram/sua',['ram'=>$ram]);
    }

    public function postSua(Request $request,$id){
    	$ram = Ram::find($id);
    	$this->validate($request,[
                'ten'=>'required'              
            ],
            [
                'ten.required'=>'Bạn chưa nhập tên slide'                
        ]);
      
        $ram->ten = $request->ten;                
        $ram->save();

        return redirect('admin/ram/sua/'.$id)->with('thongbao','Sửa thành công! ');
    }

    
    public function getXoa($id){
    	$ram = Ram::find($id);
    	
    	$ram->delete();

    	return redirect('admin/ram/danhsach')->with('thongbao','Xóa thành công');
    }
}
