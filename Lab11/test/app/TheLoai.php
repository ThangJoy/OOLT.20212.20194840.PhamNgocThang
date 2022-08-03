<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class TheLoai extends Model
{
    //
    protected $table = "theloai";

    public function SanPham()
    {
    	return $this->hasMany('App\SanPham','id_sanpham','id');
    }

    
}
