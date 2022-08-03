<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Slide;


class SlideController extends Controller
{
    public function getDanhSach(){
    	$slide = Slide::orderBy('id','DESC')->get();
        return view('admin.slide.danhsach',['slide'=>$slide]);
    }

    public function getThem(){
    	return view('admin.slide.them');
    }

    public function postThem(Request $request){

    	$this->validate($request,[
                'ten'=>'required',
                'noidung'=>'required',

	    	],
	    	[
                'ten.required'=>'Bạn chưa nhập tên slide',
                'noidung.required'=>'Bạn chưa nhập nội dunh cho slide'
	    ]);

	    $slide = new Slide;
	    $slide->ten = $request->ten;
        if($request->hasFile('hinh')){
            $file = $request-> file('hinh');
            $duoi = $file -> getClientOriginalExtension();
            if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
                return redirect('admin/slide/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
            }
            // $file = $request->file('sanpham');
            $name = $file->getClientOriginalName();
            $hinh = str_random(4)."_".$name;
            while(file_exists("upload/slide/".$hinh)){
                $hinh = str_random(4)."_".$name;
            }
            $file->move("upload/slide",$hinh);
            $slide->hinh = $hinh;
        }else{
            $slide->hinh = "";
        }
	    $slide->noidung = $request->noidung;
        if($request->has('link'))
            $slide->link = $request->link;
	    $slide->save();

	    return redirect('admin/slide/them')->with('thongbao','Bạn đã thêm slide thành công! ');
    }

    public function getSua($id){
    	$slide = Slide::find($id);
    	return view('admin/slide/sua',['slide'=>$slide]);
    }

    public function postSua(Request $request,$id){
    	$this->validate($request,[
                'ten'=>'required',
                'noidung'=>'required',

            ],
            [
                'ten.required'=>'Bạn chưa nhập tên slide',
                'noidung.required'=>'Bạn chưa nhập nội dunh cho slide'
        ]);

        $slide = Slide::find($id);
        $slide->ten = $request->ten;
        if($request->hasFile('hinh')){
            $file = $request-> file('hinh');
            $duoi = $file -> getClientOriginalExtension();
            if($duoi != 'jpg' && $duoi !='png'  && $duoi != 'jpeg'){
                return redirect('admin/slide/them')->with('thongbao','Bạn chỉ được chọn file có đuôi jpg,png,jpeg! ');
            }
            // $file = $request->file('sanpham');
            $name = $file->getClientOriginalName();
            $hinh = str_random(4)."_".$name;
            while(file_exists("upload/slide/".$hinh)){
                $hinh = str_random(4)."_".$name;
            }
            $file->move("upload/slide",$hinh);
            $slide->hinh = $hinh;
        }else{
            $slide->hinh = "";
        }
        $slide->noidung = $request->noidung;
        if($request->has('link'))
            $slide->link = $request->link;
        $slide->save();

        return redirect('admin/slide/sua/'.$id)->with('thongbao','Sửa thành thành công! ');
    }

    
    public function getXoa($id){
    	$slide = Slide::find($id);
    	
    	$slide->delete();

    	return redirect('admin/slide/danhsach')->with('thongbao','Xóa thành công');
    }
}
